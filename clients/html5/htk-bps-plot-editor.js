/*
 date: 02/02/2021
 author: Luca Porzio

 copyright: Copyright 2017 F4E | European Joint Undertaking for ITER and
 the Development of Fusion Energy ('Fusion for Energy').
 Licensed under the EUPL, Version 1.1 or - as soon they will be approved
 by the European Commission - subsequent versions of the EUPL (the "Licence")
 You may not use this work except in compliance with the Licence.
 You may obtain a copy of the Licence at: http://ec.europa.eu/idabc/eupl

 warning: Unless required by applicable law or agreed to in writing,
 software distributed under the Licence is distributed on an "AS IS"
 basis, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 or implied. See the Licence permissions and limitations under the Licence.
*/

/*
  <link rel="import" href="/libraries.html">
  <link rel="import" href="/htk-component.html">
*/

import * as Constants from './htk-constants.js'
;
import { HtkComponent } from './htk-component.js'

const template = document.createElement('template');
template.innerHTML = `
<style>
  @import url("/js/jqmath-0.4.3.css");
</style>
<input type="range" id="trange" min="1000" max="100000" value="10000" background="#4CAF50" border="1">
<input type="text" id="tinput"></input>
<canvas width="600" height="300" id="tcanvas"></canvas>
`;

      /**
 * @brief A simple filter editor where the user is allowed to specify the zeros and the poles of the filter. The transfer function is plot using chartjs.
 * @details In this implementation the data type is assumed to be a 2d array where the transfer function numerator is the first row of the array ([0][i]) and the denominator the second row of the array ([1][i]).
 */
class HtkBpsPlotEditor extends HtkComponent {

  /**
   * @brief Constructor. NOOP.
   */
  constructor() {
    super();
  }


  domLoaded() {

    var varName = "data-time1";
    var varNameId = this.getAttribute(varName);
    var htkCompArray = document._frameComponents[varNameId];
    this.t1 = htkCompArray[0];

    // this.t1.setUpdateValFun(this, 0);
    this.t1.setReadOnly(false);

    var varName = "data-time2";
    var varNameId = this.getAttribute(varName);
    var htkCompArray = document._frameComponents[varNameId];
    this.t2 = htkCompArray[0];

    // this.t2.setUpdateValFun(this, 1);
    this.t2.setReadOnly(false);

    var varName = "data-time3";
    var varNameId = this.getAttribute(varName);
    var htkCompArray = document._frameComponents[varNameId];
    this.t3 = htkCompArray[0];

    // this.t3.setUpdateValFun(this, 2);
    this.t3.setReadOnly(false);

    var varName = "data-ru1";
    var varNameId = this.getAttribute(varName);
    var htkCompArray = document._frameComponents[varNameId];
    this.ru1 = htkCompArray[0];

    // this.ru1.setUpdateValFun(this, 3);
    this.ru1.setReadOnly(false);


    var varName = "data-ru2";
    var varNameId = this.getAttribute(varName);
    var htkCompArray = document._frameComponents[varNameId];
    this.ru2 = htkCompArray[0];

    // this.ru2.setUpdateValFun(this, 4);
    this.ru2.setReadOnly(false);

    var varName = "data-ru3";
    var varNameId = this.getAttribute(varName);
    var htkCompArray = document._frameComponents[varNameId];
    this.ru3 = htkCompArray[0];

    // this.ru3.setUpdateValFun(this, 5);
    this.ru3.setReadOnly(false);

    var varName = "data-v1";
    var varNameId = this.getAttribute(varName);
    var htkCompArray = document._frameComponents[varNameId];
    this.v1 = htkCompArray[0];

    // this.v1.setUpdateValFun(this, 6);
    this.v1.setReadOnly(false);


    var varName = "data-v2";
    var varNameId = this.getAttribute(varName);
    var htkCompArray = document._frameComponents[varNameId];
    this.v2 = htkCompArray[0];

    // this.v2.setUpdateValFun(this, 7);
    this.v2.setReadOnly(false);

    var varName = "data-v3";
    var varNameId = this.getAttribute(varName);
    var htkCompArray = document._frameComponents[varNameId];
    this.v3 = htkCompArray[0];

    // this.v3.setUpdateValFun(this, 8);
    this.v3.setReadOnly(false);

    var varName = "data-rd";
    var varNameId = this.getAttribute(varName);
    var htkCompArray = document._frameComponents[varNameId];
    this.rd = htkCompArray[0];

    // this.rd.setUpdateValFun(this, 9);
    this.rd.setReadOnly(false);


    var varName = "data-pl";
    var varNameId = this.getAttribute(varName);
    var htkCompArray = document._frameComponents[varNameId];
    this.pl = htkCompArray[0];

    // this.pl.setUpdateValFun(this, 10);
    this.pl.setReadOnly(false);

    var varName = "data-pl-unit";
    var varNameId = this.getAttribute(varName);
    var htkCompArray = document._frameComponents[varNameId];
    this.plInSec = htkCompArray[0];

    // this.plInSec.setUpdateValFun(this, 11);
    this.plInSec.setReadOnly(false);



    this.rangeInput = this.shadowRoot.querySelector("#tinput");
    this.rangeInput.contentEditable = "true";
    this.rangeInput.disabled = false;


    this.rangeSlider = this.shadowRoot.querySelector("#trange");
    this.rangeSlider.onclick = function() {
      this.value = this.rangeSlider.value;
      this.rangeInput.value = this.value.toString();
      this.updateValue(true, 0);
    }.bind(this);

    this.rangeInput.addEventListener("input", function(e) {
      this.value = this.rangeInput.value;
      this.rangeSlider.value = this.value;
      this.updateValue(true, 0);
    }.bind(this));

  }

  /**
   * @brief Checks if the plot should be updated due to a value change (of the component itself or from the reference).
   * @param[in] userChanged true if the value update was triggered by a user action.
   */

  updateValue(userChanged, caller) {
    this.variablesInfoLoaded();
  }




  scheduleChanged(x) {
    this.variablesInfoLoaded();
  }


  variablesInfoLoaded() {
    this.rangeSlider.value = this.value;
    this.rangeInput.value = this.value.toString();

    var plValue = parseFloat(this.pl.value);
    if (this.plInSec.value > 0) {
      plValue *= 1000.0;
    }

    var times = [parseFloat(this.t1.value), parseFloat(this.t2.value), parseFloat(this.t3.value), plValue - (parseFloat(this.rd.value) / 1000.0)];
    var ruTimes = [parseFloat(this.ru1.value) / 1000.0, parseFloat(this.ru2.value) / 1000.0, parseFloat(this.ru3.value) / 1000.0, parseFloat(this.rd.value) / 1000.0];
    var voltag = [parseFloat(this.v1.value), parseFloat(this.v2.value), parseFloat(this.v3.value), 0];


    var plRefValue = parseFloat(this.pl.referenceValue);
    if (this.plInSec.referenceValue > 0) {
      plRefValue *= 1000.0;
    }

    var timesRef = [parseFloat(this.t1.referenceValue), parseFloat(this.t2.referenceValue), parseFloat(this.t3.referenceValue), plRefValue - (parseFloat(this.rd.referenceValue) / 1000.0)];
    var ruTimesRef = [parseFloat(this.ru1.referenceValue) / 1000.0, parseFloat(this.ru2.referenceValue) / 1000.0, parseFloat(this.ru3.referenceValue) / 1000.0, parseFloat(this.rd.referenceValue) / 1000.0];
    var voltagRef = [parseFloat(this.v1.referenceValue), parseFloat(this.v2.referenceValue), parseFloat(this.v3.referenceValue), 0];

    var plPlantValue = parseFloat(this.pl.plantValue);
    if (this.plInSec.plantValue > 0) {
      plPlantValue *= 1000.0;
    }

    var timesPlant = [parseFloat(this.t1.plantValue), parseFloat(this.t2.plantValue), parseFloat(this.t3.plantValue), plPlantValue - (parseFloat(this.rd.plantValue) / 1000.0)];
    var ruTimesPlant = [parseFloat(this.ru1.plantValue) / 1000.0, parseFloat(this.ru2.plantValue) / 1000.0, parseFloat(this.ru3.plantValue) / 1000.0, parseFloat(this.rd.plantValue) / 1000.0];
    var voltagPlant = [parseFloat(this.v1.plantValue), parseFloat(this.v2.plantValue), parseFloat(this.v3.plantValue), 0];


    this.chart.data.datasets[0].data = this.compute(times, ruTimes, voltag, plValue);
    this.chart.data.datasets[1].data = this.compute(timesRef, ruTimesRef, voltagRef, plRefValue);
    this.chart.data.datasets[2].data = this.compute(timesPlant, ruTimesPlant, voltagPlant, plPlantValue);

    this.chart.update();

  }


  /**
   * @brief Gets the transfer function filter response by evaluating the function for N frequencyStep and up to the selected maxFrequency.
   * @param[in] num the transfer function numerator polynomial.
   * @param[in] den the transfer function denominator polynomial.
   */
  compute(t, ru, v, pl) {

    var lengthX = pl;
    var nPoints = this.value;
    var yOut = [];
    var tLength = t.length;

    var dt = pl / nPoints;

    var tr = 0;
    var v_1 = 0;
    yOut[0] = {
      x: 0,
      y: 0
    };
    var n = 0;
    var time = dt;
    for (var k = 1; k < nPoints; k++) {
      if (time > tr && time < t[n]) {
        yOut[k] = {
          x: time,
          y: yOut[k - 1].y
        };
        time += dt;
      } else {
        tr = t[n] + ru[n];
        if ((time >= t[n]) && (time < tr)) {
          yOut[k] = {
            x: time,
            y: yOut[k - 1].y + ((v[n] - v_1) / ru[n]) * dt
          };
          time += dt;
          if (time >= tr) {
            yOut[k] = {
              x: time,
              y: v[n]
            };
            v_1 = v[n];
            n++;
          }
        }
      }
    }
    return yOut;
  }


  getTheCorrectValue(valueToSet) {
    if (Array.isArray(valueToSet)) {
      return valueToSet[0];
    } else {
      return valueToSet;
    }

  }


  setValue(valueToSet, updateRemote = true) {
    this.value = this.getTheCorrectValue(valueToSet);
    this.fireValueChanged(Constants.VALUE_CHANGED);
    if (updateRemote) {
      this.updateRemote(valueToSet);
    }
    this.refresh();
  }


  setReference(referenceToSet) {
    this.referenceValue = this.getTheCorrectValue(referenceToSet);
    this.refresh();
  }

  setPlantValue(plantValueToSet) {
    this.plantValue = this.getTheCorrectValue(plantValueToSet);
    this.fireValueChanged(Constants.VALUE_CHANGED);
    this.refresh();
  }


  /**
   * @brief Calls checkValues
   */
  refresh() {}

  /**
   * @brief See HtkComponent.getTemplate
   */
  getTemplate() {
    var templateContent = template.content;
    return templateContent;
  }

  /**
   * @brief See HtkComponent.connectedCallback
   */
  connectedCallback() {
    super.connectedCallback();
    window.htkHelper.addVariablesInfoLoadedListener(this);
    // window.htkHelper.addScheduleChangedListener(this);

    var ctx = this.shadowRoot.querySelector("#tcanvas");
    var chart = new Chart(ctx, {
      // The type of chart we want to create
      type: "line",

      // The data for our dataset
      data: {
        datasets: [{
            label: "Current",
            fill: "false",
            backgroundColor: "white",
            borderColor: "blue", // The main line color
            borderWidth: 2,
            pointRadius: 0
          },
          {
            label: "Reference",
            fill: "false",
            backgroundColor: "white",
            borderColor: "gray",
            borderWidth: 2,
            pointRadius: 0
          },
          {
            label: "Plant",
            fill: "false",
            backgroundColor: "white",
            borderColor: "red",
            borderWidth: 2,
            pointRadius: 0
          }
        ]
      },

      // Configuration options go here
      options: {
        scales: {
          xAxes: [{
            type: "linear",
            scaleLabel: {
              display: true,
              labelString: "Time"
            }
          }],
          yAxes: [{
            scaleLabel: {
              display: true,
              labelString: "Voltage"
            }
          }]
        },
        responsive: false
      }
    });
    this.chart = chart;

  }

  /**
   * @brief See HtkComponent.attachedCallback.
   */
  /*attachedCallback() {
    super.attachedCallback();
    var ctx = this.shadowRoot.querySelector("#tcanvas");
    var chart = new Chart(ctx, {
      // The type of chart we want to create
      type: "line",

      // The data for our dataset
      data: {
        datasets: [{
            label: "Current",
            fill: "false",
            backgroundColor: "white",
            borderColor: "blue", // The main line color
            borderWidth: 2,
            pointRadius: 0
          },
          {
            label: "Reference",
            fill: "false",
            backgroundColor: "white",
            borderColor: "gray",
            borderWidth: 2,
            pointRadius: 0
          },
          {
            label: "Plant",
            fill: "false",
            backgroundColor: "white",
            borderColor: "red",
            borderWidth: 2,
            pointRadius: 0
          }
        ]
      },

      // Configuration options go here
      options: {
        scales: {
          xAxes: [{
            type: "linear",
            scaleLabel: {
              display: true,
              labelString: "Time"
            }
          }],
          yAxes: [{
            scaleLabel: {
              display: true,
              labelString: "Voltage"
            }
          }]
        },
        responsive: false
      }
    });
    this.chart = chart;
  }*/
}

/**
 * @brief Registers the element.
 */
window.customElements.define('htk-bps-plot-editor', HtkBpsPlotEditor);
