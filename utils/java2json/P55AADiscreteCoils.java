import java.util.Arrays;
import java.util.Vector;

class P55AADiscreteCoils extends PMCVariable {

    public P55AADiscreteCoils() {
        super("AA", "55 AA discrete coils", new Vector(), "", new int[]{1}, true, false, null);
    }

    PMCDiscreteCoil M1001 = new PMCDiscreteCoil("M1001", "55.AA.00-MLF-1001", false, 3.6049,-1.94356,-90);
    PMCDiscreteCoil M1002 = new PMCDiscreteCoil("M1002", "55.AA.00-MLF-1002", false, 3.6049,-0.91716,-90);
    PMCDiscreteCoil M1003 = new PMCDiscreteCoil("M1003", "55.AA.00-MLF-1003", false, 3.6049,0.10924,-90);
    PMCDiscreteCoil M1004 = new PMCDiscreteCoil("M1004", "55.AA.00-MLF-1004", false, 3.6049,1.12061,-90);
    PMCDiscreteCoil M1005 = new PMCDiscreteCoil("M1005", "55.AA.00-MLF-1005", false, 3.6049,2.137,-90);
    PMCDiscreteCoil M1006 = new PMCDiscreteCoil("M1006", "55.AA.00-MLF-1006", false, 3.6049,3.16339,-90);
    PMCDiscreteCoil M1007 = new PMCDiscreteCoil("M1007", "55.AA.00-MLF-1007", false, 3.69453,4.09243,-109);
    PMCDiscreteCoil M1008 = new PMCDiscreteCoil("M1008", "55.AA.00-MLF-1008", false, 4.38077,4.92212,-150);
    PMCDiscreteCoil M1009 = new PMCDiscreteCoil("M1009", "55.AA.00-MLF-1009", false, 5.41282,5.11554,171);
    PMCDiscreteCoil M1010 = new PMCDiscreteCoil("M1010", "55.AA.00-MLF-1010", false, 6.53153,4.52816,145);
    PMCDiscreteCoil M1011 = new PMCDiscreteCoil("M1011", "55.AA.00-MLF-1011", false, 7.17122,4.06452,141);
    PMCDiscreteCoil M1012 = new PMCDiscreteCoil("M1012", "55.AA.00-MLF-1012", false, 8.02898,3.15537,126);
    PMCDiscreteCoil M1013 = new PMCDiscreteCoil("M1013", "55.AA.00-MLF-1013", false, 8.49892,2.37042,116);
    PMCDiscreteCoil M1014 = new PMCDiscreteCoil("M1014", "55.AA.00-MLF-1014", false, 8.85275,1.33386,100);
    PMCDiscreteCoil M1015 = new PMCDiscreteCoil("M1015", "55.AA.00-MLF-1015", false, 8.89025,-0.05166,84);
    PMCDiscreteCoil M1016 = new PMCDiscreteCoil("M1016", "55.AA.00-MLF-1016", false, 8.4899,-1.17629,65);
    PMCDiscreteCoil M1017 = new PMCDiscreteCoil("M1017", "55.AA.00-MLF-1017", false, 8.07759,-2.07751,65);
    PMCDiscreteCoil M1018 = new PMCDiscreteCoil("M1018", "55.AA.00-MLF-1018", false, 7.05132,-2.92406,38);
    PMCDiscreteCoil M1020 = new PMCDiscreteCoil("M1020", "55.AA.00-MLF-1020", false, 6.61544,-4.56602,37);
    PMCDiscreteCoil M1021 = new PMCDiscreteCoil("M1021", "55.AA.00-MLF-1021", false, 5.83793,-4.9603,17);
    PMCDiscreteCoil M1022 = new PMCDiscreteCoil("M1022", "55.AA.00-MLF-1022", false, 5.03206,-5.05892,-4);
    PMCDiscreteCoil M1023 = new PMCDiscreteCoil("M1023", "55.AA.00-MLF-1023", false, 4.26827,-4.78545,-35);
    PMCDiscreteCoil M1024 = new PMCDiscreteCoil("M1024", "55.AA.00-MLF-1024", false, 3.75692,-4.17993,-65);
    PMCDiscreteCoil M1025 = new PMCDiscreteCoil("M1025", "55.AA.00-MLF-1025", false, 3.61377,-3.64278,-85);
    PMCDiscreteCoil M2001 = new PMCDiscreteCoil("M2001", "55.AA.00-MLF-2001", false, 3.60491,-1.94356,-90);
    PMCDiscreteCoil M2002 = new PMCDiscreteCoil("M2002", "55.AA.00-MLF-2002", false, 3.60491,-0.91716,-90);
    PMCDiscreteCoil M2003 = new PMCDiscreteCoil("M2003", "55.AA.00-MLF-2003", false, 3.60491,0.10924,-90);
    PMCDiscreteCoil M2004 = new PMCDiscreteCoil("M2004", "55.AA.00-MLF-2004", false, 3.60491,1.12061,-90);
    PMCDiscreteCoil M2005 = new PMCDiscreteCoil("M2005", "55.AA.00-MLF-2005", false, 3.60491,2.137,-90);
    PMCDiscreteCoil M2006 = new PMCDiscreteCoil("M2006", "55.AA.00-MLF-2006", false, 3.60491,3.16339,-90);
    PMCDiscreteCoil M2007 = new PMCDiscreteCoil("M2007", "55.AA.00-MLF-2007", false, 3.69454,4.09243,-109);
    PMCDiscreteCoil M2008 = new PMCDiscreteCoil("M2008", "55.AA.00-MLF-2008", false, 4.38078,4.92212,-150);
    PMCDiscreteCoil M2009 = new PMCDiscreteCoil("M2009", "55.AA.00-MLF-2009", false, 5.41282,5.11554,171);
    PMCDiscreteCoil M2010 = new PMCDiscreteCoil("M2010", "55.AA.00-MLF-2010", false, 6.53153,4.52816,145);
    PMCDiscreteCoil M2011 = new PMCDiscreteCoil("M2011", "55.AA.00-MLF-2011", false, 7.17123,4.06452,141);
    PMCDiscreteCoil M2012 = new PMCDiscreteCoil("M2012", "55.AA.00-MLF-2012", false, 8.02897,3.15537,126);
    PMCDiscreteCoil M2013 = new PMCDiscreteCoil("M2013", "55.AA.00-MLF-2013", false, 8.49893,2.37042,116);
    PMCDiscreteCoil M2014 = new PMCDiscreteCoil("M2014", "55.AA.00-MLF-2014", false, 8.85276,1.33386,100);
    PMCDiscreteCoil M2015 = new PMCDiscreteCoil("M2015", "55.AA.00-MLF-2015", false, 8.89026,-0.05166,84);
    PMCDiscreteCoil M2016 = new PMCDiscreteCoil("M2016", "55.AA.00-MLF-2016", false, 8.4899,-1.17629,65);
    PMCDiscreteCoil M2017 = new PMCDiscreteCoil("M2017", "55.AA.00-MLF-2017", false, 8.07759,-2.07751,65);
    PMCDiscreteCoil M2018 = new PMCDiscreteCoil("M2018", "55.AA.00-MLF-2018", false, 7.05131,-2.92406,38);
    PMCDiscreteCoil M2020 = new PMCDiscreteCoil("M2020", "55.AA.00-MLF-2020", false, 6.61544,-4.56602,37);
    PMCDiscreteCoil M2021 = new PMCDiscreteCoil("M2021", "55.AA.00-MLF-2021", false, 5.83794,-4.9603,17);
    PMCDiscreteCoil M2022 = new PMCDiscreteCoil("M2022", "55.AA.00-MLF-2022", false, 5.03206,-5.05892,-4);
    PMCDiscreteCoil M2023 = new PMCDiscreteCoil("M2023", "55.AA.00-MLF-2023", false, 4.26826,-4.78545,-35);
    PMCDiscreteCoil M2024 = new PMCDiscreteCoil("M2024", "55.AA.00-MLF-2024", false, 3.75692,-4.17993,-65);
    PMCDiscreteCoil M2025 = new PMCDiscreteCoil("M2025", "55.AA.00-MLF-2025", false, 3.61377,-3.64278,-85);
    PMCDiscreteCoil M4001 = new PMCDiscreteCoil("M4001", "55.AA.00-MLF-4001", false, 3.6049,-1.94356,-90);
    PMCDiscreteCoil M4002 = new PMCDiscreteCoil("M4002", "55.AA.00-MLF-4002", false, 3.6049,-0.91716,-90);
    PMCDiscreteCoil M4003 = new PMCDiscreteCoil("M4003", "55.AA.00-MLF-4003", false, 3.6049,0.10924,-90);
    PMCDiscreteCoil M4004 = new PMCDiscreteCoil("M4004", "55.AA.00-MLF-4004", false, 3.6049,1.12061,-90);
    PMCDiscreteCoil M4005 = new PMCDiscreteCoil("M4005", "55.AA.00-MLF-4005", false, 3.6049,2.137,-90);
    PMCDiscreteCoil M4006 = new PMCDiscreteCoil("M4006", "55.AA.00-MLF-4006", false, 3.6049,3.16339,-90);
    PMCDiscreteCoil M4007 = new PMCDiscreteCoil("M4007", "55.AA.00-MLF-4007", false, 3.69453,4.09243,-109);
    PMCDiscreteCoil M4008 = new PMCDiscreteCoil("M4008", "55.AA.00-MLF-4008", false, 4.38077,4.92212,-150);
    PMCDiscreteCoil M4009 = new PMCDiscreteCoil("M4009", "55.AA.00-MLF-4009", false, 5.41282,5.11554,171);
    PMCDiscreteCoil M4010 = new PMCDiscreteCoil("M4010", "55.AA.00-MLF-4010", false, 6.53152,4.52816,145);
    PMCDiscreteCoil M4011 = new PMCDiscreteCoil("M4011", "55.AA.00-MLF-4011", false, 7.17123,4.06452,141);
    PMCDiscreteCoil M4012 = new PMCDiscreteCoil("M4012", "55.AA.00-MLF-4012", false, 8.02898,3.15537,126);
    PMCDiscreteCoil M4013 = new PMCDiscreteCoil("M4013", "55.AA.00-MLF-4013", false, 8.49892,2.37042,116);
    PMCDiscreteCoil M4014 = new PMCDiscreteCoil("M4014", "55.AA.00-MLF-4014", false, 8.85276,1.33386,100);
    PMCDiscreteCoil M4015 = new PMCDiscreteCoil("M4015", "55.AA.00-MLF-4015", false, 8.89026,-0.05166,84);
    PMCDiscreteCoil M4016 = new PMCDiscreteCoil("M4016", "55.AA.00-MLF-4016", false, 8.4899,-1.17629,65);
    PMCDiscreteCoil M4017 = new PMCDiscreteCoil("M4017", "55.AA.00-MLF-4017", false, 8.07759,-2.07751,65);
    PMCDiscreteCoil M4018 = new PMCDiscreteCoil("M4018", "55.AA.00-MLF-4018", false, 7.05132,-2.92406,38);
    PMCDiscreteCoil M4020 = new PMCDiscreteCoil("M4020", "55.AA.00-MLF-4020", false, 6.61544,-4.56602,37);
    PMCDiscreteCoil M4021 = new PMCDiscreteCoil("M4021", "55.AA.00-MLF-4021", false, 5.83793,-4.9603,17);
    PMCDiscreteCoil M4022 = new PMCDiscreteCoil("M4022", "55.AA.00-MLF-4022", false, 5.03206,-5.05892,-4);
    PMCDiscreteCoil M4023 = new PMCDiscreteCoil("M4023", "55.AA.00-MLF-4023", false, 4.26827,-4.78545,-35);
    PMCDiscreteCoil M4024 = new PMCDiscreteCoil("M4024", "55.AA.00-MLF-4024", false, 3.75692,-4.17993,-65);
    PMCDiscreteCoil M4025 = new PMCDiscreteCoil("M4025", "55.AA.00-MLF-4025", false, 3.61377,-3.64278,-85);
    PMCDiscreteCoil M5001 = new PMCDiscreteCoil("M5001", "55.AA.00-MLF-5001", false, 3.60491,-1.94356,-90);
    PMCDiscreteCoil M5002 = new PMCDiscreteCoil("M5002", "55.AA.00-MLF-5002", false, 3.60491,-0.91716,-90);
    PMCDiscreteCoil M5003 = new PMCDiscreteCoil("M5003", "55.AA.00-MLF-5003", false, 3.60491,0.10924,-90);
    PMCDiscreteCoil M5004 = new PMCDiscreteCoil("M5004", "55.AA.00-MLF-5004", false, 3.60491,1.12061,-90);
    PMCDiscreteCoil M5005 = new PMCDiscreteCoil("M5005", "55.AA.00-MLF-5005", false, 3.60491,2.137,-90);
    PMCDiscreteCoil M5006 = new PMCDiscreteCoil("M5006", "55.AA.00-MLF-5006", false, 3.60491,3.16339,-90);
    PMCDiscreteCoil M5007 = new PMCDiscreteCoil("M5007", "55.AA.00-MLF-5007", false, 3.69454,4.09243,-109);
    PMCDiscreteCoil M5008 = new PMCDiscreteCoil("M5008", "55.AA.00-MLF-5008", false, 4.38078,4.92212,-150);
    PMCDiscreteCoil M5009 = new PMCDiscreteCoil("M5009", "55.AA.00-MLF-5009", false, 5.41282,5.11554,171);
    PMCDiscreteCoil M5010 = new PMCDiscreteCoil("M5010", "55.AA.00-MLF-5010", false, 6.53152,4.52816,145);
    PMCDiscreteCoil M5011 = new PMCDiscreteCoil("M5011", "55.AA.00-MLF-5011", false, 7.17123,4.06452,141);
    PMCDiscreteCoil M5012 = new PMCDiscreteCoil("M5012", "55.AA.00-MLF-5012", false, 8.02898,3.15537,126);
    PMCDiscreteCoil M5013 = new PMCDiscreteCoil("M5013", "55.AA.00-MLF-5013", false, 8.49893,2.37042,116);
    PMCDiscreteCoil M5014 = new PMCDiscreteCoil("M5014", "55.AA.00-MLF-5014", false, 8.85276,1.33386,100);
    PMCDiscreteCoil M5015 = new PMCDiscreteCoil("M5015", "55.AA.00-MLF-5015", false, 8.89026,-0.05166,84);
    PMCDiscreteCoil M5016 = new PMCDiscreteCoil("M5016", "55.AA.00-MLF-5016", false, 8.4899,-1.17629,65);
    PMCDiscreteCoil M5017 = new PMCDiscreteCoil("M5017", "55.AA.00-MLF-5017", false, 8.07758,-2.07751,65);
    PMCDiscreteCoil M5018 = new PMCDiscreteCoil("M5018", "55.AA.00-MLF-5018", false, 7.05132,-2.92406,38);
    PMCDiscreteCoil M5020 = new PMCDiscreteCoil("M5020", "55.AA.00-MLF-5020", false, 6.61544,-4.56602,37);
    PMCDiscreteCoil M5021 = new PMCDiscreteCoil("M5021", "55.AA.00-MLF-5021", false, 5.83794,-4.9603,17);
    PMCDiscreteCoil M5022 = new PMCDiscreteCoil("M5022", "55.AA.00-MLF-5022", false, 5.03206,-5.05892,-4);
    PMCDiscreteCoil M5023 = new PMCDiscreteCoil("M5023", "55.AA.00-MLF-5023", false, 4.26827,-4.78545,-35);
    PMCDiscreteCoil M5024 = new PMCDiscreteCoil("M5024", "55.AA.00-MLF-5024", false, 3.75692,-4.17993,-65);
    PMCDiscreteCoil M5025 = new PMCDiscreteCoil("M5025", "55.AA.00-MLF-5025", false, 3.61377,-3.64278,-85);
    PMCDiscreteCoil M7001 = new PMCDiscreteCoil("M7001", "55.AA.00-MLF-7001", false, 3.60491,-1.94356,-90);
    PMCDiscreteCoil M7002 = new PMCDiscreteCoil("M7002", "55.AA.00-MLF-7002", false, 3.60491,-0.91716,-90);
    PMCDiscreteCoil M7003 = new PMCDiscreteCoil("M7003", "55.AA.00-MLF-7003", false, 3.60491,0.10924,-90);
    PMCDiscreteCoil M7004 = new PMCDiscreteCoil("M7004", "55.AA.00-MLF-7004", false, 3.60491,1.12061,-90);
    PMCDiscreteCoil M7005 = new PMCDiscreteCoil("M7005", "55.AA.00-MLF-7005", false, 3.60491,2.137,-90);
    PMCDiscreteCoil M7006 = new PMCDiscreteCoil("M7006", "55.AA.00-MLF-7006", false, 3.60491,3.16339,-90);
    PMCDiscreteCoil M7007 = new PMCDiscreteCoil("M7007", "55.AA.00-MLF-7007", false, 3.69454,4.09243,-109);
    PMCDiscreteCoil M7008 = new PMCDiscreteCoil("M7008", "55.AA.00-MLF-7008", false, 4.38077,4.92212,-150);
    PMCDiscreteCoil M7009 = new PMCDiscreteCoil("M7009", "55.AA.00-MLF-7009", false, 5.41282,5.11554,171);
    PMCDiscreteCoil M7010 = new PMCDiscreteCoil("M7010", "55.AA.00-MLF-7010", false, 6.53152,4.52816,145);
    PMCDiscreteCoil M7011 = new PMCDiscreteCoil("M7011", "55.AA.00-MLF-7011", false, 7.17123,4.06452,141);
    PMCDiscreteCoil M7012 = new PMCDiscreteCoil("M7012", "55.AA.00-MLF-7012", false, 8.02897,3.15537,126);
    PMCDiscreteCoil M7013 = new PMCDiscreteCoil("M7013", "55.AA.00-MLF-7013", false, 8.49892,2.37042,116);
    PMCDiscreteCoil M7014 = new PMCDiscreteCoil("M7014", "55.AA.00-MLF-7014", false, 8.85276,1.33386,100);
    PMCDiscreteCoil M7015 = new PMCDiscreteCoil("M7015", "55.AA.00-MLF-7015", false, 8.89026,-0.05166,84);
    PMCDiscreteCoil M7016 = new PMCDiscreteCoil("M7016", "55.AA.00-MLF-7016", false, 8.4899,-1.17629,65);
    PMCDiscreteCoil M7017 = new PMCDiscreteCoil("M7017", "55.AA.00-MLF-7017", false, 8.07758,-2.07751,65);
    PMCDiscreteCoil M7018 = new PMCDiscreteCoil("M7018", "55.AA.00-MLF-7018", false, 7.05132,-2.92406,38);
    PMCDiscreteCoil M7020 = new PMCDiscreteCoil("M7020", "55.AA.00-MLF-7020", false, 6.61544,-4.56602,37);
    PMCDiscreteCoil M7021 = new PMCDiscreteCoil("M7021", "55.AA.00-MLF-7021", false, 5.83793,-4.9603,17);
    PMCDiscreteCoil M7022 = new PMCDiscreteCoil("M7022", "55.AA.00-MLF-7022", false, 5.03206,-5.05892,-4);
    PMCDiscreteCoil M7023 = new PMCDiscreteCoil("M7023", "55.AA.00-MLF-7023", false, 4.26827,-4.78545,-35);
    PMCDiscreteCoil M7024 = new PMCDiscreteCoil("M7024", "55.AA.00-MLF-7024", false, 3.75692,-4.17993,-65);
    PMCDiscreteCoil M7025 = new PMCDiscreteCoil("M7025", "55.AA.00-MLF-7025", false, 3.61377,-3.64278,-85);
    PMCDiscreteCoil M8001 = new PMCDiscreteCoil("M8001", "55.AA.00-MLF-8001", false, 3.6049,-1.94356,-90);
    PMCDiscreteCoil M8002 = new PMCDiscreteCoil("M8002", "55.AA.00-MLF-8002", false, 3.6049,-0.91716,-90);
    PMCDiscreteCoil M8003 = new PMCDiscreteCoil("M8003", "55.AA.00-MLF-8003", false, 3.6049,0.10924,-90);
    PMCDiscreteCoil M8004 = new PMCDiscreteCoil("M8004", "55.AA.00-MLF-8004", false, 3.6049,1.12061,-90);
    PMCDiscreteCoil M8005 = new PMCDiscreteCoil("M8005", "55.AA.00-MLF-8005", false, 3.6049,2.137,-90);
    PMCDiscreteCoil M8006 = new PMCDiscreteCoil("M8006", "55.AA.00-MLF-8006", false, 3.6049,3.16339,-90);
    PMCDiscreteCoil M8007 = new PMCDiscreteCoil("M8007", "55.AA.00-MLF-8007", false, 3.69454,4.09243,-109);
    PMCDiscreteCoil M8008 = new PMCDiscreteCoil("M8008", "55.AA.00-MLF-8008", false, 4.38077,4.92212,-150);
    PMCDiscreteCoil M8009 = new PMCDiscreteCoil("M8009", "55.AA.00-MLF-8009", false, 5.41282,5.11554,171);
    PMCDiscreteCoil M8010 = new PMCDiscreteCoil("M8010", "55.AA.00-MLF-8010", false, 6.53152,4.52816,145);
    PMCDiscreteCoil M8011 = new PMCDiscreteCoil("M8011", "55.AA.00-MLF-8011", false, 7.17122,4.06452,141);
    PMCDiscreteCoil M8012 = new PMCDiscreteCoil("M8012", "55.AA.00-MLF-8012", false, 8.02898,3.15537,126);
    PMCDiscreteCoil M8013 = new PMCDiscreteCoil("M8013", "55.AA.00-MLF-8013", false, 8.49892,2.37042,116);
    PMCDiscreteCoil M8014 = new PMCDiscreteCoil("M8014", "55.AA.00-MLF-8014", false, 8.85275,1.33386,100);
    PMCDiscreteCoil M8015 = new PMCDiscreteCoil("M8015", "55.AA.00-MLF-8015", false, 8.89025,-0.05166,84);
    PMCDiscreteCoil M8016 = new PMCDiscreteCoil("M8016", "55.AA.00-MLF-8016", false, 8.4899,-1.17629,65);
    PMCDiscreteCoil M8017 = new PMCDiscreteCoil("M8017", "55.AA.00-MLF-8017", false, 8.07758,-2.07751,65);
    PMCDiscreteCoil M8018 = new PMCDiscreteCoil("M8018", "55.AA.00-MLF-8018", false, 7.05132,-2.92406,38);
    PMCDiscreteCoil M8020 = new PMCDiscreteCoil("M8020", "55.AA.00-MLF-8020", false, 6.61545,-4.56602,37);
    PMCDiscreteCoil M8021 = new PMCDiscreteCoil("M8021", "55.AA.00-MLF-8021", false, 5.83794,-4.9603,17);
    PMCDiscreteCoil M8022 = new PMCDiscreteCoil("M8022", "55.AA.00-MLF-8022", false, 5.03205,-5.05892,-4);
    PMCDiscreteCoil M8023 = new PMCDiscreteCoil("M8023", "55.AA.00-MLF-8023", false, 4.26826,-4.78545,-35);
    PMCDiscreteCoil M8024 = new PMCDiscreteCoil("M8024", "55.AA.00-MLF-8024", false, 3.75691,-4.17993,-65);
    PMCDiscreteCoil M8025 = new PMCDiscreteCoil("M8025", "55.AA.00-MLF-8025", false, 3.61377,-3.64278,-85);
}


