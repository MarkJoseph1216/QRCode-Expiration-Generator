package com.example.qrcodegeneratorexpiration.Generator;

/**  Author: Engr.Arvin Lemuel Cabunoc, CPE
 *  Date: July 12 2019
 *  Time: 2:16
 * **/

public class GeneratorTime {

    public static String hrFrom = "";
    public static String minFrom = "";

    public static String hrEnd = "";
    public static String minEnd = "";

    public static String aX ="12";
    public static String xA = "11";
    public static String bX = "13";
    public static String xB = "17";
    public static String cX = "14";
    public static String xC = "18";
    public static String dX = "19";
    public static String xD = "16";
    public static String eX = "15";

    String globalHrFrom = "";
    String globalMinFrom = "";

    String globalHrEnd = "";
    String globalMinEnd = "";

    // GENERATOR OF HR FROM
    public void generatorHrFrom(String hrs)
    {
        switch (hrs)
        {
            case "01":
                globalHrFrom = "aZ";
                break;
            case "02":
                globalHrFrom = "bY";
                break;
            case "03":
                globalHrFrom = "cX";
                break;
            case "04":
                globalHrFrom = "dW";
                break;
            case "05":
                globalHrFrom = "eV";
                break;
            case "06":
                globalHrFrom = "fU";
                break;
            case "07":
                globalHrFrom = "gT";
                break;
            case "08":
                globalHrFrom = "hS";
                break;
            case "09":
                globalHrFrom = "iR";
                break;
            case "10":
                globalHrFrom = "jQ";
                break;
            case "11":
                globalHrFrom = "kP";
                break;
            case "12":
                globalHrFrom = "lO";
                break;
            case "13":
                globalHrFrom = "mN";
                break;
            case "14":
                globalHrFrom = "nM";
                break;
            case "15":
                globalHrFrom = "oL";
                break;
            case "16":
                globalHrFrom = "pK";
                break;
            case "17":
                globalHrFrom = "qJ";
                break;
            case "18":
                globalHrFrom = "rI";
                break;
            case "19":
                globalHrFrom = "sH";
                break;
            case "20":
                globalHrFrom = "tG";
                break;
            case "21":
                globalHrFrom = "uF";
                break;
            case "22":
                globalHrFrom = "vE";
                break;
            case "23":
                globalHrFrom = "wD";
                break;
            case "00":
                globalHrFrom = "xC";
                break;
        }
        hrFrom = globalHrFrom;
    }

    //GENERATOR Min From
    public void generatorMinFrom(String minFromm)
    {
        switch (minFromm)
        {
            case "01":
                globalMinFrom = "aN";
                break;
            case "02":
                globalMinFrom = "bO";
                break;
            case "03":
                globalMinFrom = "cP";
                break;
            case "04":
                globalMinFrom = "dQ";
                break;
            case "05":
                globalMinFrom = "eR";
                break;
            case "06":
                globalMinFrom = "fS";
                break;
            case "07":
                globalMinFrom = "gT";
                break;
            case "08":
                globalMinFrom = "hU";
                break;
            case "09":
                globalMinFrom = "iV";
                break;
            case "10":
                globalMinFrom = "jW";
                break;
            case "11":
                globalMinFrom = "kX";
                break;
            case "12":
                globalMinFrom = "lY";
                break;
            case "13":
                globalMinFrom = "mZ";
                break;
            case "14":
                globalMinFrom = "zM";
                break;
            case "15":
                globalMinFrom = "yL";
                break;
            case "16":
                globalMinFrom = "xK";
                break;
            case "17":
                globalMinFrom = "wJ";
                break;
            case "18":
                globalMinFrom = "vI";
                break;
            case "19":
                globalMinFrom = "uH";
                break;
            case "20":
                globalMinFrom = "tG";
                break;
            case "21":
                globalMinFrom = "sF";
                break;
            case "22":
                globalMinFrom = "rE";
                break;
            case "23":
                globalMinFrom = "qD";
                break;
            case "24":
                globalMinFrom = "pC";
                break;
            case "25":
                globalMinFrom = "oB";
                break;
            case "26":
                globalMinFrom = "nA";
                break;
            case "27":
                globalMinFrom = "aC";
                break;
            case "28":
                globalMinFrom = "bD";
                break;
            case "29":
                globalMinFrom = "cE";
                break;
            case "30":
                globalMinFrom = "dF";
                break;
            case "31":
                globalMinFrom = "eG";
                break;
            case "32":
                globalMinFrom = "fH";
                break;
            case "33":
                globalMinFrom = "gI";
                break;
            case "34":
                globalMinFrom = "hJ";
                break;
            case "35":
                globalMinFrom = "iK";
                break;
            case "36":
                globalMinFrom = "jL";
                break;
            case "37":
                globalMinFrom = "kM";
                break;
            case "38":
                globalMinFrom = "lN";
                break;
            case "39":
                globalMinFrom = "mO";
                break;
            case "40":
                globalMinFrom = "nP";
                break;
            case "41":
                globalMinFrom = "oQ";
                break;
            case "42":
                globalMinFrom = "pR";
                break;
            case "43":
                globalMinFrom = "qS";
                break;
            case "44":
                globalMinFrom = "rT";
                break;
            case "45":
                globalMinFrom = "sU";
                break;
            case "46":
                globalMinFrom = "tV";
                break;
            case "47":
                globalMinFrom = "uW";
                break;
            case "48":
                globalMinFrom = "vX";
                break;
            case "49":
                globalMinFrom = "wY";
                break;
            case "50":
                globalMinFrom = "xZ";
                break;
            case "51":
                globalMinFrom = "yA";
                break;
            case "52":
                globalMinFrom = "zB";
                break;
            case "53":
                globalMinFrom = "bZ";
                break;
            case "54":
                globalMinFrom = "aY";
                break;
            case "55":
                globalMinFrom = "zX";
                break;
            case "56":
                globalMinFrom = "yW";
                break;
            case "57":
                globalMinFrom = "xV";
                break;
            case "58":
                globalMinFrom = "wU";
                break;
            case "59":
                globalMinFrom = "vT";
                break;
            case "00":
                globalMinFrom = "xC";
                break;
        }
        minFrom = globalMinFrom;
    }


    //GENERATE Hr End
    public void generatorHrEnd(String hrs)
    {
        switch (hrs)
        {
            case "01":
                globalHrEnd = "aZ";
                break;
            case "02":
                globalHrEnd = "bY";
                break;
            case "03":
                globalHrEnd = "cX";
                break;
            case "04":
                globalHrEnd = "dW";
                break;
            case "05":
                globalHrEnd = "eV";
                break;
            case "06":
                globalHrEnd = "fU";
                break;
            case "07":
                globalHrEnd = "gT";
                break;
            case "08":
                globalHrEnd = "hS";
                break;
            case "09":
                globalHrEnd = "iR";
                break;
            case "10":
                globalHrEnd = "jQ";
                break;
            case "11":
                globalHrEnd = "kP";
                break;
            case "12":
                globalHrEnd = "lO";
                break;
            case "13":
                globalHrEnd = "mN";
                break;
            case "14":
                globalHrEnd = "nM";
                break;
            case "15":
                globalHrEnd = "oL";
                break;
            case "16":
                globalHrEnd = "pK";
                break;
            case "17":
                globalHrEnd = "qJ";
                break;
            case "18":
                globalHrEnd = "rI";
                break;
            case "19":
                globalHrEnd = "sH";
                break;
            case "20":
                globalHrEnd = "tG";
                break;
            case "21":
                globalHrEnd = "uF";
                break;
            case "22":
                globalHrEnd = "vE";
                break;
            case "23":
                globalHrEnd = "wD";
                break;
            case "00":
                globalHrEnd = "xC";
                break;
        }
        hrEnd = globalHrEnd;
    }

    //GENERATOR Min End
    public void generatorMinEnd(String minEndd)
    {
        switch (minEndd)
        {
            case "01":
                globalMinEnd = "aN";
                break;
            case "02":
                globalMinEnd = "bO";
                break;
            case "03":
                globalMinEnd = "cP";
                break;
            case "04":
                globalMinEnd = "dQ";
                break;
            case "05":
                globalMinEnd = "eR";
                break;
            case "06":
                globalMinEnd = "fS";
                break;
            case "07":
                globalMinEnd = "gT";
                break;
            case "08":
                globalMinEnd = "hU";
                break;
            case "09":
                globalMinEnd = "iV";
                break;
            case "10":
                globalMinEnd = "jW";
                break;
            case "11":
                globalMinEnd = "kX";
                break;
            case "12":
                globalMinEnd = "lY";
                break;
            case "13":
                globalMinEnd = "mZ";
                break;
            case "14":
                globalMinEnd = "zM";
                break;
            case "15":
                globalMinEnd = "yL";
                break;
            case "16":
                globalMinEnd = "xK";
                break;
            case "17":
                globalMinEnd = "wJ";
                break;
            case "18":
                globalMinEnd = "vI";
                break;
            case "19":
                globalMinEnd = "uH";
                break;
            case "20":
                globalMinEnd = "tG";
                break;
            case "21":
                globalMinEnd = "sF";
                break;
            case "22":
                globalMinEnd = "rE";
                break;
            case "23":
                globalMinEnd = "qD";
                break;
            case "24":
                globalMinEnd = "pC";
                break;
            case "25":
                globalMinEnd = "oB";
                break;
            case "26":
                globalMinEnd = "nA";
                break;
            case "27":
                globalMinEnd = "aC";
                break;
            case "28":
                globalMinEnd = "bD";
                break;
            case "29":
                globalMinEnd = "cE";
                break;
            case "30":
                globalMinEnd = "dF";
                break;
            case "31":
                globalMinEnd = "eG";
                break;
            case "32":
                globalMinEnd = "fH";
                break;
            case "33":
                globalMinEnd = "gI";
                break;
            case "34":
                globalMinEnd = "hJ";
                break;
            case "35":
                globalMinEnd = "iK";
                break;
            case "36":
                globalMinEnd = "jL";
                break;
            case "37":
                globalMinEnd = "kM";
                break;
            case "38":
                globalMinEnd = "lN";
                break;
            case "39":
                globalMinEnd = "mO";
                break;
            case "40":
                globalMinEnd = "nP";
                break;
            case "41":
                globalMinEnd = "oQ";
                break;
            case "42":
                globalMinEnd = "pR";
                break;
            case "43":
                globalMinEnd = "qS";
                break;
            case "44":
                globalMinEnd = "rT";
                break;
            case "45":
                globalMinEnd = "sU";
                break;
            case "46":
                globalMinEnd = "tV";
                break;
            case "47":
                globalMinEnd = "uW";
                break;
            case "48":
                globalMinEnd = "vX";
                break;
            case "49":
                globalMinEnd = "wY";
                break;
            case "50":
                globalMinEnd = "xZ";
                break;
            case "51":
                globalMinEnd = "yA";
                break;
            case "52":
                globalMinEnd = "zB";
                break;
            case "53":
                globalMinEnd = "bZ";
                break;
            case "54":
                globalMinEnd = "aY";
                break;
            case "55":
                globalMinEnd = "zX";
                break;
            case "56":
                globalMinEnd = "yW";
                break;
            case "57":
                globalMinEnd = "xV";
                break;
            case "58":
                globalMinEnd = "wU";
                break;
            case "59":
                globalMinEnd = "vT";
                break;
            case "00":
                globalMinEnd = "xC";
                break;
        }
        minEnd = globalMinEnd;
    }

}
