/*
 date: 11/02/2021
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
       <link rel="import" href="/htk-matrix-dropmenu-editor.html">
       <link rel="import" href="/htk-array-editor.html">
*/

import * as Constants from './htk-constants.js'
import { HtkComponent } from './htk-component.js'

const template = document.createElement('template');
template.innerHTML = `
<div id="dmatrix">
    <table border="0">
        <tr>
            <td>
                <button type="button" id="preprocessingDone">Preprocessing Done</button>
            </td>
        </tr>
        <tr>
            <td>
                <table border="1" id="fnames">
                    <tr></tr>
                </table>
            </td>
        </tr>
    </table>
</div>
`;
          /**
     * @brief Array editor component.
     */
    class LsFunctionAssignment extends HtkComponent {

      /**
       * @brief Constructor. NOOP.
       */
      constructor() {
        super();
      }

      checkValue() {
        for (var i = 0; i < this.value.length; i++) {
          var myCell = this.fnames.rows[0].cells[i];
          myCell.style.color = Constants.STANDARD_FCOLOR;

          if (this.getInitialValue() !== undefined) {
            if (this.getInitialValue()[i] !== undefined) {
              if (this.value[i] !== this.initValue[i]) {
                myCell.style.color = Constants.DIFF_INIT_CHANGED_COLOR;
              }
            }
          }

          if (this.getPlantValue() !== undefined && this.getReferenceValue() !== undefined) {
            if (this.getPlantValue()[i] !== undefined) {
              if (this.getReferenceValue()[i] !== undefined) {
                if (!this.compareWithReference(this.getValue()[i], this.getPlantValue()[i], this.getReferenceValue()[i])) {
                  myCell.style.color = Constants.PLANT_OR_REF_CHANGED_COLOR;
                }
              }
            }
          }

        }

        for (var i = 0; i < this.value.length; i++) {
          for (var j = i + 1; j < this.value.length; j++) {
            var myCell = this.fnames.rows[0].cells[j];
            if (this.value[i] === this.value[j]) {
              myCell.style.color = Constants.ERROR_BCOLOR;
              this.fnames.rows[0].cells[i].style.color = Constants.ERROR_BCOLOR;;
            }
          }
        }
      }

      updateValue(userChanged) {
        var numfun = this.fnames.rows[0].cells.length;
        for (var i = 0; i < numfun; i++) {
          this.value[i] = this.fnames.rows[0].cells[i].innerHTML;
        }
        if (userChanged) {
          this.fireValueChanged("value");
          this.updateRemote(this.getValue());
        }
      }

      domLoaded() {
        var mId = this.getAttribute("data-mId");
        var inputPreprocessId = this.getAttribute("data-inputPreprocessId");

        var htkCompArray = document._frameComponents[mId];
        this.matrix = htkCompArray[0];
        var htkCompArray = document._frameComponents[inputPreprocessId];
        this.preprocessing = htkCompArray[0];

        this.preprocessing.element = this;
        this.matrix.element = this;
        this.matrix.refreshAllCellsDimensions(this.width, this.height)
        this.matrix.addRowButton.innerHTML = "Add Input";
        this.matrix.addColButton.innerHTML = "Add Function";
        this.matrix.removeRowButton.innerHTML = "Remove Input";
        this.matrix.removeColButton.innerHTML = "Remove Function";

        this.matrix.addAddRowCallback(this);
        this.matrix.addAddColCallback(this);
        this.matrix.addRemoveRowCallback(this);
        this.matrix.addRemoveColCallback(this);
      }

      addRowCallback() {
        this.preprocessingDoneRefresh();
      }

      addColCallback() {
        this.preprocessingDoneRefresh();
      }

      removeRowCallback() {
        this.preprocessingDoneRefresh();
      }

      removeColCallback() {
        this.preprocessingDoneRefresh();
      }


      scheduleChanged(x) {
        for (var i = 0; i < this.value.length; i++) {
          var cell = this.fnames.rows[0].cells[i];
          cell.innerHTML = this.value[i];
        }

        var len = this.preprocessing.matrix1.value.length;
        var options = new Array(len + 1);
        //refresh the matrix enum
        if (this.preprocessing !== null) {
          for (var k = 0; k < len; k++) {
            options[k] = this.preprocessing.matrix1.value[k][0];
          }
        }
        options[len] = "GND";
        this.matrix.refreshEnum(options);
      }

      variablesInfoLoaded() {
        for (var i = 0; i < this.value.length; i++) {
          var cell = this.fnames.rows[0].cells[i];
          cell.innerHTML = this.value[i];
        }

        var len = this.preprocessing.matrix1.value.length;
        var options = new Array(len + 1);
        //refresh the matrix enum
        if (this.preprocessing !== null) {
          for (var k = 0; k < len; k++) {
            options[k] = this.preprocessing.matrix1.value[k][0];
          }
        }
        options[len] = "GND";
        this.matrix.refreshEnum(options);
      }


      /**
       * @brief See HtkComponent.refresh
       */
      refresh() {
        if (this.matrix !== undefined) {
          if (this.initialised && this.matrix.initialised) {
            var nFunctions = this.fnames.rows[0].cells.length;
            for (var i = nFunctions; i < this.value.length; i++) {
              var cell = this.fnames.rows[0].insertCell(i);
              cell.style.width = this.width;
              cell.style.height = this.height;
              cell.style.textAlign = "right";
              cell.setAttribute("contenteditable", "true");
              cell.innerHTML = "";
              cell.addEventListener("input", function(e) {
                this.updateValue(true);
              }.bind(this));
            }
            for (var i = nFunctions - 1; i >= this.value.length; i--) {
              this.fnames.rows[0].deleteCell(i);
            }
            for (var i = 0; i < this.value.length; i++) {
              var cell = this.fnames.rows[0].cells[i];
              cell.value = this.value[i];
            }
            this.checkValue();
          }
        }
      }

      /**
       * @brief See HtkComponent.setValue
       */
      setValue(elementsToSet, updateRemote = true) {
        if (elementsToSet.length > 0) {
          super.setValue(elementsToSet.slice(0), updateRemote);
          this.initialised = true;
        }
      }

      /**
       * @brief See HtkComponent.setInitialValue
       */
      setInitialValue(initialValueToSet) {
        if (initialValueToSet.length > 0) {
          super.setInitialValue(initialValueToSet.slice(0));
        }
      }

      /**
       * @brief See HtkComponent.setPlantValue
       */
      setPlantValue(plantValueToSet) {
        if (plantValueToSet.length > 0) {
          super.setPlantValue(plantValueToSet.slice(0));
        }
      }

      /**
       * @brief See HtkComponent.setReferenceValue
       */
      setReferenceValue(referenceValueToSet) {
        if (referenceValueToSet.length > 0) {
          super.setReferenceValue(referenceValueToSet.slice(0));
        }
      }

      /**
       * @brief See HtkComponent.setReadOnly
       */
      setReadOnly(isReadOnly) {
        //super.setReadOnly(isReadOnly);
      }

      /**
       * @brief See HtkComponent.getTemplate
       */
       getTemplate() {
         var templateContent = template.content;
         return templateContent;
       }


      preprocessingDoneRefresh() {
        var len = this.preprocessing.matrix1.value.length;
        var options = new Array(len + 1);
        for (var k = 0; k < len; k++) {
          options[k] = this.preprocessing.matrix1.value[k][0];
        }
        options[len] = "GND";
        this.matrix.refreshEnum(options)

        //add a text box
        var nCols = this.matrix.getValue()[0].length;
        var nFunctions = this.fnames.rows[0].cells.length;
        for (var i = nFunctions; i < nCols; i++) {
          var cell = this.fnames.rows[0].insertCell(i);
          cell.style.width = this.width;
          cell.style.height = this.height;
          cell.style.textAlign = "right";
          cell.setAttribute("contenteditable", "true");
          cell.innerHTML = "";
          cell.addEventListener("input", function(e) {
            this.updateValue(true);
          }.bind(this));
        }

        for (var i = nFunctions - 1; i >= nCols; i--) {
          this.fnames.rows[0].deleteCell(i);
        }

      }




      /**
       * @brief See HtkComponent.connectedCallback
       */
      connectedCallback() {
        super.connectedCallback();
        this.initialised = false;
        this.numberOfElements = 0;
        this.width = "200px";
        this.height = "25px";

        window.htkHelper.addVariablesInfoLoadedListener(this);
        window.htkHelper.addScheduleChangedListener(this);
        this.fnames = this.shadowRoot.querySelector("#fnames");
        this.preProcessButton = this.shadowRoot.querySelector("#preprocessingDone");
        this.preProcessButton.onclick = function() {
          this.preprocessingDoneRefresh()
        }.bind(this);
      }
    }

    /**
     * @brief Registers the element.
     */
     window.customElements.define('ls-function-assignment', LsFunctionAssignment);
