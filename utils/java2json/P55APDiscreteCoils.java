import java.util.Arrays;
import java.util.Vector;

class P55APDiscreteCoils extends PMCVariable {

    public P55APDiscreteCoils() {
        super("AP", "55 AP discrete sensors", new Vector(), "", new int[]{1}, true, false, null);
    }

    PMCDiscreteCoil M1101 = new PMCDiscreteCoil("M1101", "55.AP.00-MRG-1101", false, 3.59739,-2.16744,180);
    PMCDiscreteCoil M1102 = new PMCDiscreteCoil("M1102", "55.AP.00-MRG-1102", false, 3.59739,-1.85702,0);
    PMCDiscreteCoil M1103 = new PMCDiscreteCoil("M1103", "55.AP.00-MRG-1103", false, 3.59739,-1.15106,180);
    PMCDiscreteCoil M1104 = new PMCDiscreteCoil("M1104", "55.AP.00-MRG-1104", false, 3.59739,-0.84063,0);
    PMCDiscreteCoil M1105 = new PMCDiscreteCoil("M1105", "55.AP.00-MRG-1105", false, 3.59739,-0.13467,180);
    PMCDiscreteCoil M1106 = new PMCDiscreteCoil("M1106", "55.AP.00-MRG-1106", false, 3.59739,0.17575,0);
    PMCDiscreteCoil M1107 = new PMCDiscreteCoil("M1107", "55.AP.00-MRG-1107", false, 3.59739,0.88171,180);
    PMCDiscreteCoil M1108 = new PMCDiscreteCoil("M1108", "55.AP.00-MRG-1108", false, 3.59739,1.19213,0);
    PMCDiscreteCoil M1109 = new PMCDiscreteCoil("M1109", "55.AP.00-MRG-1109", false, 3.59739,1.89809,180);
    PMCDiscreteCoil M1110 = new PMCDiscreteCoil("M1110", "55.AP.00-MRG-1110", false, 3.59739,2.20851,0);
    PMCDiscreteCoil M1111 = new PMCDiscreteCoil("M1111", "55.AP.00-MRG-1111", false, 3.59739,2.91448,180);
    PMCDiscreteCoil M1112 = new PMCDiscreteCoil("M1112", "55.AP.00-MRG-1112", false, 3.59739,3.2249,0);
    PMCDiscreteCoil M1113 = new PMCDiscreteCoil("M1113", "55.AP.00-MRG-1113", false, 3.67528,4.01012,-138);
    PMCDiscreteCoil M1114 = new PMCDiscreteCoil("M1114", "55.AP.00-MRG-1114", false, 3.79996,4.32465,42);
    PMCDiscreteCoil M1115 = new PMCDiscreteCoil("M1115", "55.AP.00-MRG-1115", false, 4.23953,4.81471,-138);
    PMCDiscreteCoil M1116 = new PMCDiscreteCoil("M1116", "55.AP.00-MRG-1116", false, 4.53491,4.97857,42);
    PMCDiscreteCoil M1117 = new PMCDiscreteCoil("M1117", "55.AP.00-MRG-1117", false, 5.29755,5.12356,-82);
    PMCDiscreteCoil M1118 = new PMCDiscreteCoil("M1118", "55.AP.00-MRG-1118", false, 5.61407,5.07792,98);
    PMCDiscreteCoil M1219 = new PMCDiscreteCoil("M1219", "55.AP.00-MRG-1219", false, 6.35272,4.65644,-47);
    PMCDiscreteCoil M1220 = new PMCDiscreteCoil("M1220", "55.AP.00-MRG-1220", false, 6.60819,4.45833,133);
    PMCDiscreteCoil M1221 = new PMCDiscreteCoil("M1221", "55.AP.00-MRG-1221", false, 7.18739,4.05656,-47);
    PMCDiscreteCoil M1222 = new PMCDiscreteCoil("M1222", "55.AP.00-MRG-1222", false, 7.41655,3.8327,133);
    PMCDiscreteCoil M1223 = new PMCDiscreteCoil("M1223", "55.AP.00-MRG-1223", false, 8.01131,3.18927,-30);
    PMCDiscreteCoil M1224 = new PMCDiscreteCoil("M1224", "55.AP.00-MRG-1224", false, 8.17865,2.91716,150);
    PMCDiscreteCoil M1225 = new PMCDiscreteCoil("M1225", "55.AP.00-MRG-1225", false, 8.48438,2.4167,-30);
    PMCDiscreteCoil M1226 = new PMCDiscreteCoil("M1226", "55.AP.00-MRG-1226", false, 8.60169,2.11609,150);
    PMCDiscreteCoil M1227 = new PMCDiscreteCoil("M1227", "55.AP.00-MRG-1227", false, 8.8693,1.29669,0);
    PMCDiscreteCoil M1228 = new PMCDiscreteCoil("M1228", "55.AP.00-MRG-1228", false, 8.91006,0.97625,180);
    PMCDiscreteCoil M1229 = new PMCDiscreteCoil("M1229", "55.AP.00-MRG-1229", false, 8.92652,0.26375,0);
    PMCDiscreteCoil M1230 = new PMCDiscreteCoil("M1230", "55.AP.00-MRG-1230", false, 8.90201,-0.05669,180);
    PMCDiscreteCoil M1231 = new PMCDiscreteCoil("M1231", "55.AP.00-MRG-1231", false, 8.59265,-0.99259,30);
    PMCDiscreteCoil M1232 = new PMCDiscreteCoil("M1232", "55.AP.00-MRG-1232", false, 8.45669,-1.28977,-150);
    PMCDiscreteCoil M1233 = new PMCDiscreteCoil("M1233", "55.AP.00-MRG-1233", false, 8.13179,-1.86534,30);
    PMCDiscreteCoil M1234 = new PMCDiscreteCoil("M1234", "55.AP.00-MRG-1234", false, 7.94991,-2.12915,-150);
    PMCDiscreteCoil M1235 = new PMCDiscreteCoil("M1235", "55.AP.00-MRG-1235", false, 7.24645,-2.79818,52);
    PMCDiscreteCoil M1236 = new PMCDiscreteCoil("M1236", "55.AP.00-MRG-1236", false, 6.99313,-2.99442,-128);
    PMCDiscreteCoil M1301 = new PMCDiscreteCoil("M1301", "55.AP.00-MRG-1301", false, 3.5974,-2.16744,180);
    PMCDiscreteCoil M1302 = new PMCDiscreteCoil("M1302", "55.AP.00-MRG-1302", false, 3.5974,-1.85702,0);
    PMCDiscreteCoil M1311 = new PMCDiscreteCoil("M1311", "55.AP.00-MRG-1311", false, 3.5974,2.91448,180);
    PMCDiscreteCoil M1312 = new PMCDiscreteCoil("M1312", "55.AP.00-MRG-1312", false, 3.5974,3.2249,0);
    PMCDiscreteCoil M1419 = new PMCDiscreteCoil("M1419", "55.AP.00-MRG-1419", false, 6.35272,4.65644,-47);
    PMCDiscreteCoil M1420 = new PMCDiscreteCoil("M1420", "55.AP.00-MRG-1420", false, 6.60819,4.45833,133);
    PMCDiscreteCoil M1421 = new PMCDiscreteCoil("M1421", "55.AP.00-MRG-1421", false, 7.18739,4.05656,-47);
    PMCDiscreteCoil M1422 = new PMCDiscreteCoil("M1422", "55.AP.00-MRG-1422", false, 7.41655,3.8327,133);
    PMCDiscreteCoil M1433 = new PMCDiscreteCoil("M1433", "55.AP.00-MRG-1433", false, 8.13179,-1.86534,30);
    PMCDiscreteCoil M1434 = new PMCDiscreteCoil("M1434", "55.AP.00-MRG-1434", false, 7.9499,-2.12915,-150);
    PMCDiscreteCoil M1435 = new PMCDiscreteCoil("M1435", "55.AP.00-MRG-1435", false, 7.24645,-2.79818,52);
    PMCDiscreteCoil M1436 = new PMCDiscreteCoil("M1436", "55.AP.00-MRG-1436", false, 6.99312,-2.99442,-128);
    PMCDiscreteCoil M2101 = new PMCDiscreteCoil("M2101", "55.AP.00-MRG-2101", false, 3.59739,-2.16744,-180);
    PMCDiscreteCoil M2102 = new PMCDiscreteCoil("M2102", "55.AP.00-MRG-2102", false, 3.59739,-1.85702,0);
    PMCDiscreteCoil M2111 = new PMCDiscreteCoil("M2111", "55.AP.00-MRG-2111", false, 3.59739,2.91448,-180);
    PMCDiscreteCoil M2112 = new PMCDiscreteCoil("M2112", "55.AP.00-MRG-2112", false, 3.59739,3.2249,0);
    PMCDiscreteCoil M2219 = new PMCDiscreteCoil("M2219", "55.AP.00-MRG-2219", false, 6.35272,4.65644,-47);
    PMCDiscreteCoil M2220 = new PMCDiscreteCoil("M2220", "55.AP.00-MRG-2220", false, 6.6082,4.45833,133);
    PMCDiscreteCoil M2221 = new PMCDiscreteCoil("M2221", "55.AP.00-MRG-2221", false, 7.1874,4.05656,-47);
    PMCDiscreteCoil M2222 = new PMCDiscreteCoil("M2222", "55.AP.00-MRG-2222", false, 7.41655,3.8327,133);
    PMCDiscreteCoil M2233 = new PMCDiscreteCoil("M2233", "55.AP.00-MRG-2233", false, 8.13179,-1.86534,30);
    PMCDiscreteCoil M2234 = new PMCDiscreteCoil("M2234", "55.AP.00-MRG-2234", false, 7.9499,-2.12915,-150);
    PMCDiscreteCoil M2235 = new PMCDiscreteCoil("M2235", "55.AP.00-MRG-2235", false, 7.24645,-2.79818,52);
    PMCDiscreteCoil M2236 = new PMCDiscreteCoil("M2236", "55.AP.00-MRG-2236", false, 6.99312,-2.99442,-128);
    PMCDiscreteCoil M2301 = new PMCDiscreteCoil("M2301", "55.AP.00-MRG-2301", false, 3.5974,-2.16744,-180);
    PMCDiscreteCoil M2302 = new PMCDiscreteCoil("M2302", "55.AP.00-MRG-2302", false, 3.5974,-1.85702,0);
    PMCDiscreteCoil M2303 = new PMCDiscreteCoil("M2303", "55.AP.00-MRG-2303", false, 3.5974,-1.15106,-180);
    PMCDiscreteCoil M2304 = new PMCDiscreteCoil("M2304", "55.AP.00-MRG-2304", false, 3.5974,-0.84063,0);
    PMCDiscreteCoil M2305 = new PMCDiscreteCoil("M2305", "55.AP.00-MRG-2305", false, 3.5974,-0.13467,-180);
    PMCDiscreteCoil M2306 = new PMCDiscreteCoil("M2306", "55.AP.00-MRG-2306", false, 3.5974,0.17575,0);
    PMCDiscreteCoil M2307 = new PMCDiscreteCoil("M2307", "55.AP.00-MRG-2307", false, 3.5974,0.88171,-180);
    PMCDiscreteCoil M2308 = new PMCDiscreteCoil("M2308", "55.AP.00-MRG-2308", false, 3.5974,1.19213,0);
    PMCDiscreteCoil M2309 = new PMCDiscreteCoil("M2309", "55.AP.00-MRG-2309", false, 3.5974,1.89809,-180);
    PMCDiscreteCoil M2310 = new PMCDiscreteCoil("M2310", "55.AP.00-MRG-2310", false, 3.5974,2.20851,0);
    PMCDiscreteCoil M2311 = new PMCDiscreteCoil("M2311", "55.AP.00-MRG-2311", false, 3.5974,2.91448,-180);
    PMCDiscreteCoil M2312 = new PMCDiscreteCoil("M2312", "55.AP.00-MRG-2312", false, 3.5974,3.2249,0);
    PMCDiscreteCoil M2313 = new PMCDiscreteCoil("M2313", "55.AP.00-MRG-2313", false, 3.67528,4.01012,-138);
    PMCDiscreteCoil M2314 = new PMCDiscreteCoil("M2314", "55.AP.00-MRG-2314", false, 3.79997,4.32465,42);
    PMCDiscreteCoil M2315 = new PMCDiscreteCoil("M2315", "55.AP.00-MRG-2315", false, 4.23954,4.81471,-138);
    PMCDiscreteCoil M2316 = new PMCDiscreteCoil("M2316", "55.AP.00-MRG-2316", false, 4.53492,4.97857,42);
    PMCDiscreteCoil M2317 = new PMCDiscreteCoil("M2317", "55.AP.00-MRG-2317", false, 5.29755,5.12356,-82);
    PMCDiscreteCoil M2318 = new PMCDiscreteCoil("M2318", "55.AP.00-MRG-2318", false, 5.61407,5.07792,98);
    PMCDiscreteCoil M2419 = new PMCDiscreteCoil("M2419", "55.AP.00-MRG-2419", false, 6.35273,4.65644,-47);
    PMCDiscreteCoil M2420 = new PMCDiscreteCoil("M2420", "55.AP.00-MRG-2420", false, 6.60819,4.45833,133);
    PMCDiscreteCoil M2421 = new PMCDiscreteCoil("M2421", "55.AP.00-MRG-2421", false, 7.1874,4.05656,-47);
    PMCDiscreteCoil M2422 = new PMCDiscreteCoil("M2422", "55.AP.00-MRG-2422", false, 7.41654,3.8327,133);
    PMCDiscreteCoil M2423 = new PMCDiscreteCoil("M2423", "55.AP.00-MRG-2423", false, 8.0113,3.18927,-30);
    PMCDiscreteCoil M2424 = new PMCDiscreteCoil("M2424", "55.AP.00-MRG-2424", false, 8.17864,2.91716,150);
    PMCDiscreteCoil M2425 = new PMCDiscreteCoil("M2425", "55.AP.00-MRG-2425", false, 8.48438,2.4167,-30);
    PMCDiscreteCoil M2426 = new PMCDiscreteCoil("M2426", "55.AP.00-MRG-2426", false, 8.60169,2.11609,150);
    PMCDiscreteCoil M2427 = new PMCDiscreteCoil("M2427", "55.AP.00-MRG-2427", false, 8.86929,1.29669,0);
    PMCDiscreteCoil M2428 = new PMCDiscreteCoil("M2428", "55.AP.00-MRG-2428", false, 8.91006,0.97625,-180);
    PMCDiscreteCoil M2431 = new PMCDiscreteCoil("M2431", "55.AP.00-MRG-2431", false, 8.59265,-0.99259,30);
    PMCDiscreteCoil M2432 = new PMCDiscreteCoil("M2432", "55.AP.00-MRG-2432", false, 8.45669,-1.28977,-150);
    PMCDiscreteCoil M2433 = new PMCDiscreteCoil("M2433", "55.AP.00-MRG-2433", false, 8.13179,-1.86534,30);
    PMCDiscreteCoil M2434 = new PMCDiscreteCoil("M2434", "55.AP.00-MRG-2434", false, 7.9499,-2.12915,-150);
    PMCDiscreteCoil M2435 = new PMCDiscreteCoil("M2435", "55.AP.00-MRG-2435", false, 7.24645,-2.79818,52);
    PMCDiscreteCoil M2436 = new PMCDiscreteCoil("M2436", "55.AP.00-MRG-2436", false, 6.99312,-2.99442,-128);
    PMCDiscreteCoil M3101 = new PMCDiscreteCoil("M3101", "55.AP.00-MRG-3101", false, 3.5974,-2.16744,-180);
    PMCDiscreteCoil M3102 = new PMCDiscreteCoil("M3102", "55.AP.00-MRG-3102", false, 3.5974,-1.85702,0);
    PMCDiscreteCoil M3111 = new PMCDiscreteCoil("M3111", "55.AP.00-MRG-3111", false, 3.5974,2.91448,-180);
    PMCDiscreteCoil M3112 = new PMCDiscreteCoil("M3112", "55.AP.00-MRG-3112", false, 3.5974,3.2249,0);
    PMCDiscreteCoil M3219 = new PMCDiscreteCoil("M3219", "55.AP.00-MRG-3219", false, 6.35273,4.65644,-47);
    PMCDiscreteCoil M3220 = new PMCDiscreteCoil("M3220", "55.AP.00-MRG-3220", false, 6.60819,4.45833,133);
    PMCDiscreteCoil M3221 = new PMCDiscreteCoil("M3221", "55.AP.00-MRG-3221", false, 7.1874,4.05656,-47);
    PMCDiscreteCoil M3222 = new PMCDiscreteCoil("M3222", "55.AP.00-MRG-3222", false, 7.41654,3.8327,133);
    PMCDiscreteCoil M3233 = new PMCDiscreteCoil("M3233", "55.AP.00-MRG-3233", false, 8.13179,-1.86534,30);
    PMCDiscreteCoil M3234 = new PMCDiscreteCoil("M3234", "55.AP.00-MRG-3234", false, 7.9499,-2.12915,-150);
    PMCDiscreteCoil M3235 = new PMCDiscreteCoil("M3235", "55.AP.00-MRG-3235", false, 7.24645,-2.79818,52);
    PMCDiscreteCoil M3236 = new PMCDiscreteCoil("M3236", "55.AP.00-MRG-3236", false, 6.99312,-2.99442,-128);
    PMCDiscreteCoil M3301 = new PMCDiscreteCoil("M3301", "55.AP.00-MRG-3301", false, 3.5974,-2.16744,-180);
    PMCDiscreteCoil M3302 = new PMCDiscreteCoil("M3302", "55.AP.00-MRG-3302", false, 3.5974,-1.85702,0);
    PMCDiscreteCoil M3311 = new PMCDiscreteCoil("M3311", "55.AP.00-MRG-3311", false, 3.5974,2.91448,-180);
    PMCDiscreteCoil M3312 = new PMCDiscreteCoil("M3312", "55.AP.00-MRG-3312", false, 3.5974,3.2249,0);
    PMCDiscreteCoil M3419 = new PMCDiscreteCoil("M3419", "55.AP.00-MRG-3419", false, 6.35272,4.65644,-47);
    PMCDiscreteCoil M3420 = new PMCDiscreteCoil("M3420", "55.AP.00-MRG-3420", false, 6.6082,4.45833,133);
    PMCDiscreteCoil M3421 = new PMCDiscreteCoil("M3421", "55.AP.00-MRG-3421", false, 7.1874,4.05656,-47);
    PMCDiscreteCoil M3422 = new PMCDiscreteCoil("M3422", "55.AP.00-MRG-3422", false, 7.41655,3.8327,133);
    PMCDiscreteCoil M3433 = new PMCDiscreteCoil("M3433", "55.AP.00-MRG-3433", false, 8.13179,-1.86534,30);
    PMCDiscreteCoil M3434 = new PMCDiscreteCoil("M3434", "55.AP.00-MRG-3434", false, 7.9499,-2.12915,-150);
    PMCDiscreteCoil M3435 = new PMCDiscreteCoil("M3435", "55.AP.00-MRG-3435", false, 7.24645,-2.79818,52);
    PMCDiscreteCoil M3436 = new PMCDiscreteCoil("M3436", "55.AP.00-MRG-3436", false, 6.99312,-2.99442,-128);
    PMCDiscreteCoil M4101 = new PMCDiscreteCoil("M4101", "55.AP.00-MRG-4101", false, 3.59739,-2.16744,-180);
    PMCDiscreteCoil M4102 = new PMCDiscreteCoil("M4102", "55.AP.00-MRG-4102", false, 3.59739,-1.85702,0);
    PMCDiscreteCoil M4103 = new PMCDiscreteCoil("M4103", "55.AP.00-MRG-4103", false, 3.59739,-1.15106,-180);
    PMCDiscreteCoil M4104 = new PMCDiscreteCoil("M4104", "55.AP.00-MRG-4104", false, 3.59739,-0.84063,0);
    PMCDiscreteCoil M4105 = new PMCDiscreteCoil("M4105", "55.AP.00-MRG-4105", false, 3.59739,-0.13467,-180);
    PMCDiscreteCoil M4106 = new PMCDiscreteCoil("M4106", "55.AP.00-MRG-4106", false, 3.59739,0.17575,0);
    PMCDiscreteCoil M4107 = new PMCDiscreteCoil("M4107", "55.AP.00-MRG-4107", false, 3.59739,0.88171,-180);
    PMCDiscreteCoil M4108 = new PMCDiscreteCoil("M4108", "55.AP.00-MRG-4108", false, 3.59739,1.19213,0);
    PMCDiscreteCoil M4109 = new PMCDiscreteCoil("M4109", "55.AP.00-MRG-4109", false, 3.59739,1.89809,-180);
    PMCDiscreteCoil M4110 = new PMCDiscreteCoil("M4110", "55.AP.00-MRG-4110", false, 3.59739,2.20851,0);
    PMCDiscreteCoil M4111 = new PMCDiscreteCoil("M4111", "55.AP.00-MRG-4111", false, 3.59739,2.91448,-180);
    PMCDiscreteCoil M4112 = new PMCDiscreteCoil("M4112", "55.AP.00-MRG-4112", false, 3.59739,3.2249,0);
    PMCDiscreteCoil M4113 = new PMCDiscreteCoil("M4113", "55.AP.00-MRG-4113", false, 3.67528,4.01012,-138);
    PMCDiscreteCoil M4114 = new PMCDiscreteCoil("M4114", "55.AP.00-MRG-4114", false, 3.79997,4.32465,42);
    PMCDiscreteCoil M4115 = new PMCDiscreteCoil("M4115", "55.AP.00-MRG-4115", false, 4.23953,4.81471,-138);
    PMCDiscreteCoil M4116 = new PMCDiscreteCoil("M4116", "55.AP.00-MRG-4116", false, 4.53492,4.97857,42);
    PMCDiscreteCoil M4117 = new PMCDiscreteCoil("M4117", "55.AP.00-MRG-4117", false, 5.29756,5.12356,-82);
    PMCDiscreteCoil M4118 = new PMCDiscreteCoil("M4118", "55.AP.00-MRG-4118", false, 5.61407,5.07792,98);
    PMCDiscreteCoil M4219 = new PMCDiscreteCoil("M4219", "55.AP.00-MRG-4219", false, 6.35272,4.65644,-47);
    PMCDiscreteCoil M4220 = new PMCDiscreteCoil("M4220", "55.AP.00-MRG-4220", false, 6.60819,4.45833,133);
    PMCDiscreteCoil M4221 = new PMCDiscreteCoil("M4221", "55.AP.00-MRG-4221", false, 7.18739,4.05656,-47);
    PMCDiscreteCoil M4222 = new PMCDiscreteCoil("M4222", "55.AP.00-MRG-4222", false, 7.41655,3.8327,133);
    PMCDiscreteCoil M4223 = new PMCDiscreteCoil("M4223", "55.AP.00-MRG-4223", false, 8.0113,3.18927,-30);
    PMCDiscreteCoil M4224 = new PMCDiscreteCoil("M4224", "55.AP.00-MRG-4224", false, 8.17865,2.91716,150);
    PMCDiscreteCoil M4225 = new PMCDiscreteCoil("M4225", "55.AP.00-MRG-4225", false, 8.48438,2.4167,-30);
    PMCDiscreteCoil M4226 = new PMCDiscreteCoil("M4226", "55.AP.00-MRG-4226", false, 8.60169,2.11609,150);
    PMCDiscreteCoil M4227 = new PMCDiscreteCoil("M4227", "55.AP.00-MRG-4227", false, 8.86929,1.29669,0);
    PMCDiscreteCoil M4228 = new PMCDiscreteCoil("M4228", "55.AP.00-MRG-4228", false, 8.91007,0.97625,-180);
    PMCDiscreteCoil M4229 = new PMCDiscreteCoil("M4229", "55.AP.00-MRG-4229", false, 8.92652,0.26375,0);
    PMCDiscreteCoil M4230 = new PMCDiscreteCoil("M4230", "55.AP.00-MRG-4230", false, 8.902,-0.05669,-180);
    PMCDiscreteCoil M4231 = new PMCDiscreteCoil("M4231", "55.AP.00-MRG-4231", false, 8.59265,-0.99259,30);
    PMCDiscreteCoil M4232 = new PMCDiscreteCoil("M4232", "55.AP.00-MRG-4232", false, 8.45669,-1.28977,-150);
    PMCDiscreteCoil M4233 = new PMCDiscreteCoil("M4233", "55.AP.00-MRG-4233", false, 8.13179,-1.86534,30);
    PMCDiscreteCoil M4234 = new PMCDiscreteCoil("M4234", "55.AP.00-MRG-4234", false, 7.9499,-2.12915,-150);
    PMCDiscreteCoil M4235 = new PMCDiscreteCoil("M4235", "55.AP.00-MRG-4235", false, 7.24645,-2.79818,52);
    PMCDiscreteCoil M4236 = new PMCDiscreteCoil("M4236", "55.AP.00-MRG-4236", false, 6.99312,-2.99442,-128);
    PMCDiscreteCoil M4301 = new PMCDiscreteCoil("M4301", "55.AP.00-MRG-4301", false, 3.5974,-2.16744,180);
    PMCDiscreteCoil M4302 = new PMCDiscreteCoil("M4302", "55.AP.00-MRG-4302", false, 3.5974,-1.85702,0);
    PMCDiscreteCoil M4311 = new PMCDiscreteCoil("M4311", "55.AP.00-MRG-4311", false, 3.5974,2.91448,180);
    PMCDiscreteCoil M4312 = new PMCDiscreteCoil("M4312", "55.AP.00-MRG-4312", false, 3.5974,3.2249,0);
    PMCDiscreteCoil M4419 = new PMCDiscreteCoil("M4419", "55.AP.00-MRG-4419", false, 6.35272,4.65644,-47);
    PMCDiscreteCoil M4420 = new PMCDiscreteCoil("M4420", "55.AP.00-MRG-4420", false, 6.60819,4.45833,133);
    PMCDiscreteCoil M4421 = new PMCDiscreteCoil("M4421", "55.AP.00-MRG-4421", false, 7.18739,4.05656,-47);
    PMCDiscreteCoil M4422 = new PMCDiscreteCoil("M4422", "55.AP.00-MRG-4422", false, 7.41655,3.8327,133);
    PMCDiscreteCoil M4433 = new PMCDiscreteCoil("M4433", "55.AP.00-MRG-4433", false, 8.13179,-1.86534,30);
    PMCDiscreteCoil M4434 = new PMCDiscreteCoil("M4434", "55.AP.00-MRG-4434", false, 7.94991,-2.12915,-150);
    PMCDiscreteCoil M4435 = new PMCDiscreteCoil("M4435", "55.AP.00-MRG-4435", false, 7.24645,-2.79818,52);
    PMCDiscreteCoil M4436 = new PMCDiscreteCoil("M4436", "55.AP.00-MRG-4436", false, 6.99313,-2.99442,-128);
    PMCDiscreteCoil M5101 = new PMCDiscreteCoil("M5101", "55.AP.00-MRG-5101", false, 3.59739,-2.16744,180);
    PMCDiscreteCoil M5102 = new PMCDiscreteCoil("M5102", "55.AP.00-MRG-5102", false, 3.59739,-1.85702,0);
    PMCDiscreteCoil M5111 = new PMCDiscreteCoil("M5111", "55.AP.00-MRG-5111", false, 3.59739,2.91448,180);
    PMCDiscreteCoil M5112 = new PMCDiscreteCoil("M5112", "55.AP.00-MRG-5112", false, 3.59739,3.2249,0);
    PMCDiscreteCoil M5219 = new PMCDiscreteCoil("M5219", "55.AP.00-MRG-5219", false, 6.35273,4.65644,-47);
    PMCDiscreteCoil M5220 = new PMCDiscreteCoil("M5220", "55.AP.00-MRG-5220", false, 6.60819,4.45833,133);
    PMCDiscreteCoil M5221 = new PMCDiscreteCoil("M5221", "55.AP.00-MRG-5221", false, 7.18739,4.05656,-47);
    PMCDiscreteCoil M5222 = new PMCDiscreteCoil("M5222", "55.AP.00-MRG-5222", false, 7.41654,3.8327,133);
    PMCDiscreteCoil M5233 = new PMCDiscreteCoil("M5233", "55.AP.00-MRG-5233", false, 8.13179,-1.86534,30);
    PMCDiscreteCoil M5234 = new PMCDiscreteCoil("M5234", "55.AP.00-MRG-5234", false, 7.9499,-2.12915,-150);
    PMCDiscreteCoil M5235 = new PMCDiscreteCoil("M5235", "55.AP.00-MRG-5235", false, 7.24645,-2.79818,52);
    PMCDiscreteCoil M5236 = new PMCDiscreteCoil("M5236", "55.AP.00-MRG-5236", false, 6.99313,-2.99442,-128);
    PMCDiscreteCoil M5301 = new PMCDiscreteCoil("M5301", "55.AP.00-MRG-5301", false, 3.59739,-2.16744,180);
    PMCDiscreteCoil M5302 = new PMCDiscreteCoil("M5302", "55.AP.00-MRG-5302", false, 3.59739,-1.85702,0);
    PMCDiscreteCoil M5303 = new PMCDiscreteCoil("M5303", "55.AP.00-MRG-5303", false, 3.59739,-1.15106,180);
    PMCDiscreteCoil M5304 = new PMCDiscreteCoil("M5304", "55.AP.00-MRG-5304", false, 3.59739,-0.84063,0);
    PMCDiscreteCoil M5305 = new PMCDiscreteCoil("M5305", "55.AP.00-MRG-5305", false, 3.59739,-0.13467,180);
    PMCDiscreteCoil M5306 = new PMCDiscreteCoil("M5306", "55.AP.00-MRG-5306", false, 3.59739,0.17575,0);
    PMCDiscreteCoil M5307 = new PMCDiscreteCoil("M5307", "55.AP.00-MRG-5307", false, 3.59739,0.88171,180);
    PMCDiscreteCoil M5308 = new PMCDiscreteCoil("M5308", "55.AP.00-MRG-5308", false, 3.59739,1.19213,0);
    PMCDiscreteCoil M5309 = new PMCDiscreteCoil("M5309", "55.AP.00-MRG-5309", false, 3.59739,1.89809,180);
    PMCDiscreteCoil M5310 = new PMCDiscreteCoil("M5310", "55.AP.00-MRG-5310", false, 3.59739,2.20851,0);
    PMCDiscreteCoil M5311 = new PMCDiscreteCoil("M5311", "55.AP.00-MRG-5311", false, 3.59739,2.91448,180);
    PMCDiscreteCoil M5312 = new PMCDiscreteCoil("M5312", "55.AP.00-MRG-5312", false, 3.59739,3.2249,0);
    PMCDiscreteCoil M5313 = new PMCDiscreteCoil("M5313", "55.AP.00-MRG-5313", false, 3.67528,4.01012,-138);
    PMCDiscreteCoil M5314 = new PMCDiscreteCoil("M5314", "55.AP.00-MRG-5314", false, 3.79996,4.32465,42);
    PMCDiscreteCoil M5315 = new PMCDiscreteCoil("M5315", "55.AP.00-MRG-5315", false, 4.23953,4.81471,-138);
    PMCDiscreteCoil M5316 = new PMCDiscreteCoil("M5316", "55.AP.00-MRG-5316", false, 4.53491,4.97857,42);
    PMCDiscreteCoil M5317 = new PMCDiscreteCoil("M5317", "55.AP.00-MRG-5317", false, 5.29755,5.12356,-82);
    PMCDiscreteCoil M5318 = new PMCDiscreteCoil("M5318", "55.AP.00-MRG-5318", false, 5.61407,5.07792,98);
    PMCDiscreteCoil M5419 = new PMCDiscreteCoil("M5419", "55.AP.00-MRG-5419", false, 6.35272,4.65644,-47);
    PMCDiscreteCoil M5420 = new PMCDiscreteCoil("M5420", "55.AP.00-MRG-5420", false, 6.60819,4.45833,133);
    PMCDiscreteCoil M5421 = new PMCDiscreteCoil("M5421", "55.AP.00-MRG-5421", false, 7.18739,4.05656,-47);
    PMCDiscreteCoil M5422 = new PMCDiscreteCoil("M5422", "55.AP.00-MRG-5422", false, 7.41655,3.8327,133);
    PMCDiscreteCoil M5423 = new PMCDiscreteCoil("M5423", "55.AP.00-MRG-5423", false, 8.01131,3.18927,-30);
    PMCDiscreteCoil M5424 = new PMCDiscreteCoil("M5424", "55.AP.00-MRG-5424", false, 8.17865,2.91716,150);
    PMCDiscreteCoil M5425 = new PMCDiscreteCoil("M5425", "55.AP.00-MRG-5425", false, 8.48438,2.4167,-30);
    PMCDiscreteCoil M5426 = new PMCDiscreteCoil("M5426", "55.AP.00-MRG-5426", false, 8.60169,2.11609,150);
    PMCDiscreteCoil M5427 = new PMCDiscreteCoil("M5427", "55.AP.00-MRG-5427", false, 8.8693,1.29669,0);
    PMCDiscreteCoil M5428 = new PMCDiscreteCoil("M5428", "55.AP.00-MRG-5428", false, 8.91006,0.97625,180);
    PMCDiscreteCoil M5429 = new PMCDiscreteCoil("M5429", "55.AP.00-MRG-5429", false, 8.92652,0.26375,0);
    PMCDiscreteCoil M5430 = new PMCDiscreteCoil("M5430", "55.AP.00-MRG-5430", false, 8.90201,-0.05669,180);
    PMCDiscreteCoil M5431 = new PMCDiscreteCoil("M5431", "55.AP.00-MRG-5431", false, 8.59265,-0.99259,30);
    PMCDiscreteCoil M5432 = new PMCDiscreteCoil("M5432", "55.AP.00-MRG-5432", false, 8.45669,-1.28977,-150);
    PMCDiscreteCoil M5433 = new PMCDiscreteCoil("M5433", "55.AP.00-MRG-5433", false, 8.13179,-1.86534,30);
    PMCDiscreteCoil M5434 = new PMCDiscreteCoil("M5434", "55.AP.00-MRG-5434", false, 7.94991,-2.12915,-150);
    PMCDiscreteCoil M5435 = new PMCDiscreteCoil("M5435", "55.AP.00-MRG-5435", false, 7.24645,-2.79818,52);
    PMCDiscreteCoil M5436 = new PMCDiscreteCoil("M5436", "55.AP.00-MRG-5436", false, 6.99313,-2.99442,-128);
    PMCDiscreteCoil M6101 = new PMCDiscreteCoil("M6101", "55.AP.00-MRG-6101", false, 3.5974,-2.16744,180);
    PMCDiscreteCoil M6102 = new PMCDiscreteCoil("M6102", "55.AP.00-MRG-6102", false, 3.5974,-1.85702,0);
    PMCDiscreteCoil M6111 = new PMCDiscreteCoil("M6111", "55.AP.00-MRG-6111", false, 3.5974,2.91448,180);
    PMCDiscreteCoil M6112 = new PMCDiscreteCoil("M6112", "55.AP.00-MRG-6112", false, 3.5974,3.2249,0);
    PMCDiscreteCoil M6219 = new PMCDiscreteCoil("M6219", "55.AP.00-MRG-6219", false, 6.35272,4.65644,-47);
    PMCDiscreteCoil M6220 = new PMCDiscreteCoil("M6220", "55.AP.00-MRG-6220", false, 6.60819,4.45833,133);
    PMCDiscreteCoil M6221 = new PMCDiscreteCoil("M6221", "55.AP.00-MRG-6221", false, 7.18739,4.05656,-47);
    PMCDiscreteCoil M6222 = new PMCDiscreteCoil("M6222", "55.AP.00-MRG-6222", false, 7.41655,3.8327,133);
    PMCDiscreteCoil M6233 = new PMCDiscreteCoil("M6233", "55.AP.00-MRG-6233", false, 8.13179,-1.86534,30);
    PMCDiscreteCoil M6234 = new PMCDiscreteCoil("M6234", "55.AP.00-MRG-6234", false, 7.9499,-2.12915,-150);
    PMCDiscreteCoil M6235 = new PMCDiscreteCoil("M6235", "55.AP.00-MRG-6235", false, 7.24645,-2.79818,52);
    PMCDiscreteCoil M6236 = new PMCDiscreteCoil("M6236", "55.AP.00-MRG-6236", false, 6.99312,-2.99442,-128);
    PMCDiscreteCoil M6301 = new PMCDiscreteCoil("M6301", "55.AP.00-MRG-6301", false, 3.59739,-2.16744,180);
    PMCDiscreteCoil M6302 = new PMCDiscreteCoil("M6302", "55.AP.00-MRG-6302", false, 3.59739,-1.85702,0);
    PMCDiscreteCoil M6311 = new PMCDiscreteCoil("M6311", "55.AP.00-MRG-6311", false, 3.59739,2.91448,180);
    PMCDiscreteCoil M6312 = new PMCDiscreteCoil("M6312", "55.AP.00-MRG-6312", false, 3.59739,3.2249,0);
    PMCDiscreteCoil M6419 = new PMCDiscreteCoil("M6419", "55.AP.00-MRG-6419", false, 6.35272,4.65644,-47);
    PMCDiscreteCoil M6420 = new PMCDiscreteCoil("M6420", "55.AP.00-MRG-6420", false, 6.6082,4.45833,133);
    PMCDiscreteCoil M6421 = new PMCDiscreteCoil("M6421", "55.AP.00-MRG-6421", false, 7.1874,4.05656,-47);
    PMCDiscreteCoil M6422 = new PMCDiscreteCoil("M6422", "55.AP.00-MRG-6422", false, 7.41655,3.8327,133);
    PMCDiscreteCoil M6433 = new PMCDiscreteCoil("M6433", "55.AP.00-MRG-6433", false, 8.13179,-1.86534,30);
    PMCDiscreteCoil M6434 = new PMCDiscreteCoil("M6434", "55.AP.00-MRG-6434", false, 7.9499,-2.12915,-150);
    PMCDiscreteCoil M6435 = new PMCDiscreteCoil("M6435", "55.AP.00-MRG-6435", false, 7.24645,-2.79818,52);
    PMCDiscreteCoil M6436 = new PMCDiscreteCoil("M6436", "55.AP.00-MRG-6436", false, 6.99312,-2.99442,-128);
    PMCDiscreteCoil M7101 = new PMCDiscreteCoil("M7101", "55.AP.00-MRG-7101", false, 3.5974,-2.16744,180);
    PMCDiscreteCoil M7102 = new PMCDiscreteCoil("M7102", "55.AP.00-MRG-7102", false, 3.5974,-1.85702,0);
    PMCDiscreteCoil M7103 = new PMCDiscreteCoil("M7103", "55.AP.00-MRG-7103", false, 3.5974,-1.15106,180);
    PMCDiscreteCoil M7104 = new PMCDiscreteCoil("M7104", "55.AP.00-MRG-7104", false, 3.5974,-0.84063,0);
    PMCDiscreteCoil M7105 = new PMCDiscreteCoil("M7105", "55.AP.00-MRG-7105", false, 3.5974,-0.13467,180);
    PMCDiscreteCoil M7106 = new PMCDiscreteCoil("M7106", "55.AP.00-MRG-7106", false, 3.5974,0.17575,0);
    PMCDiscreteCoil M7107 = new PMCDiscreteCoil("M7107", "55.AP.00-MRG-7107", false, 3.5974,0.88171,180);
    PMCDiscreteCoil M7108 = new PMCDiscreteCoil("M7108", "55.AP.00-MRG-7108", false, 3.5974,1.19213,0);
    PMCDiscreteCoil M7109 = new PMCDiscreteCoil("M7109", "55.AP.00-MRG-7109", false, 3.5974,1.89809,180);
    PMCDiscreteCoil M7110 = new PMCDiscreteCoil("M7110", "55.AP.00-MRG-7110", false, 3.5974,2.20851,0);
    PMCDiscreteCoil M7111 = new PMCDiscreteCoil("M7111", "55.AP.00-MRG-7111", false, 3.5974,2.91448,180);
    PMCDiscreteCoil M7112 = new PMCDiscreteCoil("M7112", "55.AP.00-MRG-7112", false, 3.5974,3.2249,0);
    PMCDiscreteCoil M7113 = new PMCDiscreteCoil("M7113", "55.AP.00-MRG-7113", false, 3.67528,4.01012,-138);
    PMCDiscreteCoil M7114 = new PMCDiscreteCoil("M7114", "55.AP.00-MRG-7114", false, 3.79997,4.32465,42);
    PMCDiscreteCoil M7115 = new PMCDiscreteCoil("M7115", "55.AP.00-MRG-7115", false, 4.23954,4.81471,-138);
    PMCDiscreteCoil M7116 = new PMCDiscreteCoil("M7116", "55.AP.00-MRG-7116", false, 4.53492,4.97857,42);
    PMCDiscreteCoil M7117 = new PMCDiscreteCoil("M7117", "55.AP.00-MRG-7117", false, 5.29755,5.12356,-82);
    PMCDiscreteCoil M7118 = new PMCDiscreteCoil("M7118", "55.AP.00-MRG-7118", false, 5.61407,5.07792,98);
    PMCDiscreteCoil M7219 = new PMCDiscreteCoil("M7219", "55.AP.00-MRG-7219", false, 6.35273,4.65644,-47);
    PMCDiscreteCoil M7220 = new PMCDiscreteCoil("M7220", "55.AP.00-MRG-7220", false, 6.60819,4.45833,133);
    PMCDiscreteCoil M7221 = new PMCDiscreteCoil("M7221", "55.AP.00-MRG-7221", false, 7.1874,4.05656,-47);
    PMCDiscreteCoil M7222 = new PMCDiscreteCoil("M7222", "55.AP.00-MRG-7222", false, 7.41654,3.8327,133);
    PMCDiscreteCoil M7223 = new PMCDiscreteCoil("M7223", "55.AP.00-MRG-7223", false, 8.0113,3.18927,-30);
    PMCDiscreteCoil M7224 = new PMCDiscreteCoil("M7224", "55.AP.00-MRG-7224", false, 8.17864,2.91716,150);
    PMCDiscreteCoil M7225 = new PMCDiscreteCoil("M7225", "55.AP.00-MRG-7225", false, 8.48438,2.4167,-30);
    PMCDiscreteCoil M7226 = new PMCDiscreteCoil("M7226", "55.AP.00-MRG-7226", false, 8.60169,2.11609,150);
    PMCDiscreteCoil M7227 = new PMCDiscreteCoil("M7227", "55.AP.00-MRG-7227", false, 8.86929,1.29669,0);
    PMCDiscreteCoil M7228 = new PMCDiscreteCoil("M7228", "55.AP.00-MRG-7228", false, 8.91006,0.97625,180);
    PMCDiscreteCoil M7229 = new PMCDiscreteCoil("M7229", "55.AP.00-MRG-7229", false, 8.92652,0.26375,0);
    PMCDiscreteCoil M7230 = new PMCDiscreteCoil("M7230", "55.AP.00-MRG-7230", false, 8.90201,-0.05669,180);
    PMCDiscreteCoil M7231 = new PMCDiscreteCoil("M7231", "55.AP.00-MRG-7231", false, 8.59265,-0.99259,30);
    PMCDiscreteCoil M7232 = new PMCDiscreteCoil("M7232", "55.AP.00-MRG-7232", false, 8.45669,-1.28977,-150);
    PMCDiscreteCoil M7233 = new PMCDiscreteCoil("M7233", "55.AP.00-MRG-7233", false, 8.13179,-1.86534,30);
    PMCDiscreteCoil M7234 = new PMCDiscreteCoil("M7234", "55.AP.00-MRG-7234", false, 7.9499,-2.12915,-150);
    PMCDiscreteCoil M7235 = new PMCDiscreteCoil("M7235", "55.AP.00-MRG-7235", false, 7.24645,-2.79818,52);
    PMCDiscreteCoil M7236 = new PMCDiscreteCoil("M7236", "55.AP.00-MRG-7236", false, 6.99312,-2.99442,-128);
    PMCDiscreteCoil M7301 = new PMCDiscreteCoil("M7301", "55.AP.00-MRG-7301", false, 3.5974,-2.16744,180);
    PMCDiscreteCoil M7302 = new PMCDiscreteCoil("M7302", "55.AP.00-MRG-7302", false, 3.5974,-1.85702,0);
    PMCDiscreteCoil M7311 = new PMCDiscreteCoil("M7311", "55.AP.00-MRG-7311", false, 3.5974,2.91448,180);
    PMCDiscreteCoil M7312 = new PMCDiscreteCoil("M7312", "55.AP.00-MRG-7312", false, 3.5974,3.2249,0);
    PMCDiscreteCoil M7419 = new PMCDiscreteCoil("M7419", "55.AP.00-MRG-7419", false, 6.35273,4.65644,-47);
    PMCDiscreteCoil M7420 = new PMCDiscreteCoil("M7420", "55.AP.00-MRG-7420", false, 6.60819,4.45833,133);
    PMCDiscreteCoil M7421 = new PMCDiscreteCoil("M7421", "55.AP.00-MRG-7421", false, 7.1874,4.05656,-47);
    PMCDiscreteCoil M7422 = new PMCDiscreteCoil("M7422", "55.AP.00-MRG-7422", false, 7.41654,3.8327,133);
    PMCDiscreteCoil M7433 = new PMCDiscreteCoil("M7433", "55.AP.00-MRG-7433", false, 8.13179,-1.86534,30);
    PMCDiscreteCoil M7434 = new PMCDiscreteCoil("M7434", "55.AP.00-MRG-7434", false, 7.9499,-2.12915,-150);
    PMCDiscreteCoil M7435 = new PMCDiscreteCoil("M7435", "55.AP.00-MRG-7435", false, 7.24645,-2.79818,52);
    PMCDiscreteCoil M7436 = new PMCDiscreteCoil("M7436", "55.AP.00-MRG-7436", false, 6.99312,-2.99442,-128);
    PMCDiscreteCoil M8101 = new PMCDiscreteCoil("M8101", "55.AP.00-MRG-8101", false, 3.5974,-2.16744,180);
    PMCDiscreteCoil M8102 = new PMCDiscreteCoil("M8102", "55.AP.00-MRG-8102", false, 3.5974,-1.85702,0);
    PMCDiscreteCoil M8111 = new PMCDiscreteCoil("M8111", "55.AP.00-MRG-8111", false, 3.5974,2.91448,180);
    PMCDiscreteCoil M8112 = new PMCDiscreteCoil("M8112", "55.AP.00-MRG-8112", false, 3.5974,3.2249,0);
    PMCDiscreteCoil M8219 = new PMCDiscreteCoil("M8219", "55.AP.00-MRG-8219", false, 6.35272,4.65644,-47);
    PMCDiscreteCoil M8220 = new PMCDiscreteCoil("M8220", "55.AP.00-MRG-8220", false, 6.6082,4.45833,133);
    PMCDiscreteCoil M8221 = new PMCDiscreteCoil("M8221", "55.AP.00-MRG-8221", false, 7.1874,4.05656,-47);
    PMCDiscreteCoil M8222 = new PMCDiscreteCoil("M8222", "55.AP.00-MRG-8222", false, 7.41655,3.8327,133);
    PMCDiscreteCoil M8233 = new PMCDiscreteCoil("M8233", "55.AP.00-MRG-8233", false, 8.13179,-1.86534,30);
    PMCDiscreteCoil M8234 = new PMCDiscreteCoil("M8234", "55.AP.00-MRG-8234", false, 7.9499,-2.12915,-150);
    PMCDiscreteCoil M8235 = new PMCDiscreteCoil("M8235", "55.AP.00-MRG-8235", false, 7.24645,-2.79818,52);
    PMCDiscreteCoil M8236 = new PMCDiscreteCoil("M8236", "55.AP.00-MRG-8236", false, 6.99312,-2.99442,-128);
    PMCDiscreteCoil M8301 = new PMCDiscreteCoil("M8301", "55.AP.00-MRG-8301", false, 3.59739,-2.16744,180);
    PMCDiscreteCoil M8302 = new PMCDiscreteCoil("M8302", "55.AP.00-MRG-8302", false, 3.59739,-1.85702,0);
    PMCDiscreteCoil M8303 = new PMCDiscreteCoil("M8303", "55.AP.00-MRG-8303", false, 3.59739,-1.15106,180);
    PMCDiscreteCoil M8304 = new PMCDiscreteCoil("M8304", "55.AP.00-MRG-8304", false, 3.59739,-0.84063,0);
    PMCDiscreteCoil M8305 = new PMCDiscreteCoil("M8305", "55.AP.00-MRG-8305", false, 3.59739,-0.13467,180);
    PMCDiscreteCoil M8306 = new PMCDiscreteCoil("M8306", "55.AP.00-MRG-8306", false, 3.59739,0.17575,0);
    PMCDiscreteCoil M8307 = new PMCDiscreteCoil("M8307", "55.AP.00-MRG-8307", false, 3.59739,0.88171,180);
    PMCDiscreteCoil M8308 = new PMCDiscreteCoil("M8308", "55.AP.00-MRG-8308", false, 3.59739,1.19213,0);
    PMCDiscreteCoil M8309 = new PMCDiscreteCoil("M8309", "55.AP.00-MRG-8309", false, 3.59739,1.89809,180);
    PMCDiscreteCoil M8310 = new PMCDiscreteCoil("M8310", "55.AP.00-MRG-8310", false, 3.59739,2.20851,0);
    PMCDiscreteCoil M8311 = new PMCDiscreteCoil("M8311", "55.AP.00-MRG-8311", false, 3.59739,2.91448,180);
    PMCDiscreteCoil M8312 = new PMCDiscreteCoil("M8312", "55.AP.00-MRG-8312", false, 3.59739,3.2249,0);
    PMCDiscreteCoil M8313 = new PMCDiscreteCoil("M8313", "55.AP.00-MRG-8313", false, 3.67528,4.01012,-138);
    PMCDiscreteCoil M8314 = new PMCDiscreteCoil("M8314", "55.AP.00-MRG-8314", false, 3.79997,4.32465,42);
    PMCDiscreteCoil M8315 = new PMCDiscreteCoil("M8315", "55.AP.00-MRG-8315", false, 4.23953,4.81471,-138);
    PMCDiscreteCoil M8316 = new PMCDiscreteCoil("M8316", "55.AP.00-MRG-8316", false, 4.53492,4.97857,42);
    PMCDiscreteCoil M8317 = new PMCDiscreteCoil("M8317", "55.AP.00-MRG-8317", false, 5.29756,5.12356,-82);
    PMCDiscreteCoil M8318 = new PMCDiscreteCoil("M8318", "55.AP.00-MRG-8318", false, 5.61407,5.07792,98);
    PMCDiscreteCoil M8419 = new PMCDiscreteCoil("M8419", "55.AP.00-MRG-8419", false, 6.35272,4.65644,-47);
    PMCDiscreteCoil M8420 = new PMCDiscreteCoil("M8420", "55.AP.00-MRG-8420", false, 6.60819,4.45833,133);
    PMCDiscreteCoil M8421 = new PMCDiscreteCoil("M8421", "55.AP.00-MRG-8421", false, 7.18739,4.05656,-47);
    PMCDiscreteCoil M8422 = new PMCDiscreteCoil("M8422", "55.AP.00-MRG-8422", false, 7.41655,3.8327,133);
    PMCDiscreteCoil M8423 = new PMCDiscreteCoil("M8423", "55.AP.00-MRG-8423", false, 8.0113,3.18927,-30);
    PMCDiscreteCoil M8424 = new PMCDiscreteCoil("M8424", "55.AP.00-MRG-8424", false, 8.17865,2.91716,150);
    PMCDiscreteCoil M8425 = new PMCDiscreteCoil("M8425", "55.AP.00-MRG-8425", false, 8.48438,2.4167,-30);
    PMCDiscreteCoil M8426 = new PMCDiscreteCoil("M8426", "55.AP.00-MRG-8426", false, 8.60169,2.11609,150);
    PMCDiscreteCoil M8427 = new PMCDiscreteCoil("M8427", "55.AP.00-MRG-8427", false, 8.86929,1.29669,0);
    PMCDiscreteCoil M8428 = new PMCDiscreteCoil("M8428", "55.AP.00-MRG-8428", false, 8.91007,0.97625,180);
    PMCDiscreteCoil M8429 = new PMCDiscreteCoil("M8429", "55.AP.00-MRG-8429", false, 8.92652,0.26375,0);
    PMCDiscreteCoil M8430 = new PMCDiscreteCoil("M8430", "55.AP.00-MRG-8430", false, 8.902,-0.05669,180);
    PMCDiscreteCoil M8431 = new PMCDiscreteCoil("M8431", "55.AP.00-MRG-8431", false, 8.59265,-0.99259,30);
    PMCDiscreteCoil M8432 = new PMCDiscreteCoil("M8432", "55.AP.00-MRG-8432", false, 8.45669,-1.28977,-150);
    PMCDiscreteCoil M8433 = new PMCDiscreteCoil("M8433", "55.AP.00-MRG-8433", false, 8.13179,-1.86534,30);
    PMCDiscreteCoil M8434 = new PMCDiscreteCoil("M8434", "55.AP.00-MRG-8434", false, 7.9499,-2.12915,-150);
    PMCDiscreteCoil M8435 = new PMCDiscreteCoil("M8435", "55.AP.00-MRG-8435", false, 7.24645,-2.79818,52);
    PMCDiscreteCoil M8436 = new PMCDiscreteCoil("M8436", "55.AP.00-MRG-8436", false, 6.99312,-2.99442,-128);
    PMCDiscreteCoil M9101 = new PMCDiscreteCoil("M9101", "55.AP.00-MRG-9101", false, 3.5974,-2.16744,180);
    PMCDiscreteCoil M9102 = new PMCDiscreteCoil("M9102", "55.AP.00-MRG-9102", false, 3.5974,-1.85702,0);
    PMCDiscreteCoil M9111 = new PMCDiscreteCoil("M9111", "55.AP.00-MRG-9111", false, 3.5974,2.91448,180);
    PMCDiscreteCoil M9112 = new PMCDiscreteCoil("M9112", "55.AP.00-MRG-9112", false, 3.5974,3.2249,0);
    PMCDiscreteCoil M9219 = new PMCDiscreteCoil("M9219", "55.AP.00-MRG-9219", false, 6.35272,4.65644,-47);
    PMCDiscreteCoil M9220 = new PMCDiscreteCoil("M9220", "55.AP.00-MRG-9220", false, 6.60819,4.45833,133);
    PMCDiscreteCoil M9221 = new PMCDiscreteCoil("M9221", "55.AP.00-MRG-9221", false, 7.18739,4.05656,-47);
    PMCDiscreteCoil M9222 = new PMCDiscreteCoil("M9222", "55.AP.00-MRG-9222", false, 7.41655,3.8327,133);
    PMCDiscreteCoil M9233 = new PMCDiscreteCoil("M9233", "55.AP.00-MRG-9233", false, 8.13179,-1.86534,30);
    PMCDiscreteCoil M9234 = new PMCDiscreteCoil("M9234", "55.AP.00-MRG-9234", false, 7.94991,-2.12915,-150);
    PMCDiscreteCoil M9235 = new PMCDiscreteCoil("M9235", "55.AP.00-MRG-9235", false, 7.24645,-2.79818,52);
    PMCDiscreteCoil M9236 = new PMCDiscreteCoil("M9236", "55.AP.00-MRG-9236", false, 6.99313,-2.99442,-128);
    PMCDiscreteCoil M9301 = new PMCDiscreteCoil("M9301", "55.AP.00-MRG-9301", false, 3.59739,-2.16744,180);
    PMCDiscreteCoil M9302 = new PMCDiscreteCoil("M9302", "55.AP.00-MRG-9302", false, 3.59739,-1.85702,0);
    PMCDiscreteCoil M9311 = new PMCDiscreteCoil("M9311", "55.AP.00-MRG-9311", false, 3.59739,2.91448,180);
    PMCDiscreteCoil M9312 = new PMCDiscreteCoil("M9312", "55.AP.00-MRG-9312", false, 3.59739,3.2249,0);
    PMCDiscreteCoil M9419 = new PMCDiscreteCoil("M9419", "55.AP.00-MRG-9419", false, 6.35273,4.65644,-47);
    PMCDiscreteCoil M9420 = new PMCDiscreteCoil("M9420", "55.AP.00-MRG-9420", false, 6.60819,4.45833,133);
    PMCDiscreteCoil M9421 = new PMCDiscreteCoil("M9421", "55.AP.00-MRG-9421", false, 7.18739,4.05656,-47);
    PMCDiscreteCoil M9422 = new PMCDiscreteCoil("M9422", "55.AP.00-MRG-9422", false, 7.41654,3.8327,133);
    PMCDiscreteCoil M9433 = new PMCDiscreteCoil("M9433", "55.AP.00-MRG-9433", false, 8.13179,-1.86534,30);
    PMCDiscreteCoil M9434 = new PMCDiscreteCoil("M9434", "55.AP.00-MRG-9434", false, 7.9499,-2.12915,-150);
    PMCDiscreteCoil M9435 = new PMCDiscreteCoil("M9435", "55.AP.00-MRG-9435", false, 7.24645,-2.79818,52);
    PMCDiscreteCoil M9436 = new PMCDiscreteCoil("M9436", "55.AP.00-MRG-9436", false, 6.99313,-2.99442,-128);
}
