package com.example.qrcodegeneratorexpiration.Generator;

/**  Author: Engr.Arvin Lemuel Cabunoc, CPE
 *  Date: July 12 2019
 *  Time: 2:16
 * **/

public class GeneratorDate {

    public static String yearFrom = "";
    public static String monthFrom = "";
    public static String dayFrom = "";

    public static String yearEnd = "";
    public static String monthEnd = "";
    public static String dayEnd = "";

    String globalYearFrom = "";
    String globalMonthFrom ="";
    String globalDayFrom = "";

    String globalYearEnd = "";
    String globalMonthEnd = "";
    String globalDayEnd = "";

    //Generator year from
    public void generatorYearFrom(String yearFromm)
    {
        switch (yearFromm)
        {
            case "2016":
                globalYearFrom = "mZlY";
                break;
            case "2017":
                globalYearFrom = "mZpP";
                break;
            case "2018":
                globalYearFrom = "mZkX";
                break;
            case "2019":
                globalYearFrom = "mZjW";
                break;
            case "2020":
                globalYearFrom = "mZiV";
                break;
            case "2021":
                globalYearFrom = "mZhU";
                break;
            case "2022":
                globalYearFrom = "mZgT";
                break;
            case "2023":
                globalYearFrom = "mZfS";
                break;
            case "2024":
                globalYearFrom = "mZeR";
                break;
            case "2025":
                globalYearFrom = "mZdQ";
                break;
            case "2026":
                globalYearFrom = "mZcP";
                break;
            case "2027":
                globalYearFrom = "mZbO";
                break;
            case "2028":
                globalYearFrom = "mZmA";
                break;
            case "2029":
                globalYearFrom = "zMaN";
                break;
            case "2030":
                globalYearFrom = "zMoB";
                break;
        }
        yearFrom = globalYearFrom;
    }

    //Generator Month From
    public void generatorMonthFrom(String monthFromm)
    {
        switch (monthFromm) {
            case "01":
                globalMonthFrom = "aNbO";
                break;
            case "02":
                globalMonthFrom = "bOcP";
                break;
            case "03":
                globalMonthFrom = "cPdQ";
                break;
            case "04":
                globalMonthFrom = "dQeR";
                break;
            case "05":
                globalMonthFrom = "eRfS";
                break;
            case "06":
                globalMonthFrom = "fSgT";
                break;
            case "07":
                globalMonthFrom = "gThU";
                break;
            case "08":
                globalMonthFrom = "hUiV";
                break;
            case "09":
                globalMonthFrom = "iVjW";
                break;
            case "10":
                globalMonthFrom = "jWkX";
                break;
            case "11":
                globalMonthFrom = "kXlY";
                break;
            case "12":
                globalMonthFrom = "lYaN";
                break;

        }
        monthFrom = globalMonthFrom;
    }

    //Generator Day From
    public void generatorDayFrom(String dayFromm)
    {
        switch (dayFromm) {
            case "01":
                globalDayFrom = "aN";
                break;
            case "02":
                globalDayFrom = "bO";
                break;
            case "03":
                globalDayFrom = "cP";
                break;
            case "04":
                globalDayFrom = "dQ";
                break;
            case "05":
                globalDayFrom = "eR";
                break;
            case "06":
                globalDayFrom = "fS";
                break;
            case "07":
                globalDayFrom = "gT";
                break;
            case "08":
                globalDayFrom = "hU";
                break;
            case "09":
                globalDayFrom = "iV";
                break;
            case "10":
                globalDayFrom = "jW";
                break;
            case "11":
                globalDayFrom = "kX";
                break;
            case "12":
                globalDayFrom = "lY";
                break;
            case "13":
                globalDayFrom = "mZ";
                break;
            case "14":
                globalDayFrom = "zM";
                break;
            case "15":
                globalDayFrom = "yL";
                break;
            case "16":
                globalDayFrom = "xK";
                break;
            case "17":
                globalDayFrom = "wJ";
                break;
            case "18":
                globalDayFrom = "vI";
                break;
            case "19":
                globalDayFrom = "uH";
                break;
            case "20":
                globalDayFrom = "tG";
                break;
            case "21":
                globalDayFrom = "sF";
                break;
            case "22":
                globalDayFrom = "rE";
                break;
            case "23":
                globalDayFrom = "qD";
                break;
            case "24":
                globalDayFrom = "pC";
                break;
            case "25":
                globalDayFrom = "oB";
                break;
            case "26":
                globalDayFrom = "nA";
                break;
            case "27":
                globalDayFrom = "aC";
                break;
            case "28":
                globalDayFrom = "bD";
                break;
            case "29":
                globalDayFrom = "cE";
                break;
            case "30":
                globalDayFrom = "dF";
                break;
            case "31":
                globalDayFrom = "eG";
                break;
        }
        dayFrom = globalDayFrom;
    }


    //Generator year end
    public void generatorYearEnd(String yearEnnd)
    {
        switch (yearEnnd)
        {
            case "2016":
                globalYearEnd = "mZlY";
                break;
            case "2017":
                globalYearEnd = "mZpP";
                break;
            case "2018":
                globalYearEnd = "mZkX";
                break;
            case "2019":
                globalYearEnd = "mZjW";
                break;
            case "2020":
                globalYearEnd = "mZiV";
                break;
            case "2021":
                globalYearEnd = "mZhU";
                break;
            case "2022":
                globalYearEnd = "mZgT";
                break;
            case "2023":
                globalYearEnd = "mZfS";
                break;
            case "2024":
                globalYearEnd = "mZeR";
                break;
            case "2025":
                globalYearEnd = "mZdQ";
                break;
            case "2026":
                globalYearEnd = "mZcP";
                break;
            case "2027":
                globalYearEnd = "mZbO";
                break;
            case "2028":
                globalYearEnd = "mZmA";
                break;
            case "2029":
                globalYearEnd = "zMaN";
                break;
            case "2030":
                globalYearEnd = "zMoB";
                break;
        }
        yearEnd = globalYearEnd;
    }

    //Generator Month End
    public void generatorMonthEnd(String monthEndd)
    {
        switch (monthEndd) {
            case "01":
                globalMonthEnd = "aNbO";
                break;
            case "02":
                globalMonthEnd = "bOcP";
                break;
            case "03":
                globalMonthEnd = "cPdQ";
                break;
            case "04":
                globalMonthEnd = "dQeR";
                break;
            case "05":
                globalMonthEnd = "eRfS";
                break;
            case "06":
                globalMonthEnd = "fSgT";
                break;
            case "07":
                globalMonthEnd = "gThU";
                break;
            case "08":
                globalMonthEnd = "hUiV";
                break;
            case "09":
                globalMonthEnd = "iVjW";
                break;
            case "10":
                globalMonthEnd = "jWkX";
                break;
            case "11":
                globalMonthEnd = "kXlY";
                break;
            case "12":
                globalMonthEnd = "lYaN";
                break;

        }
        monthEnd = globalMonthEnd;
    }

    //Generator Day End
    public void generatorDayEnd(String dayEndd)
    {
        switch (dayEndd) {
            case "01":
                globalDayEnd = "aN";
                break;
            case "02":
                globalDayEnd = "bO";
                break;
            case "03":
                globalDayEnd = "cP";
                break;
            case "04":
                globalDayEnd = "dQ";
                break;
            case "05":
                globalDayEnd = "eR";
                break;
            case "06":
                globalDayEnd = "fS";
                break;
            case "07":
                globalDayEnd = "gT";
                break;
            case "08":
                globalDayEnd = "hU";
                break;
            case "09":
                globalDayEnd = "iV";
                break;
            case "10":
                globalDayEnd = "jW";
                break;
            case "11":
                globalDayEnd = "kX";
                break;
            case "12":
                globalDayEnd = "lY";
                break;
            case "13":
                globalDayEnd = "mZ";
                break;
            case "14":
                globalDayEnd = "zM";
                break;
            case "15":
                globalDayEnd = "yL";
                break;
            case "16":
                globalDayEnd = "xK";
                break;
            case "17":
                globalDayEnd = "wJ";
                break;
            case "18":
                globalDayEnd = "vI";
                break;
            case "19":
                globalDayEnd = "uH";
                break;
            case "20":
                globalDayEnd = "tG";
                break;
            case "21":
                globalDayEnd = "sF";
                break;
            case "22":
                globalDayEnd = "rE";
                break;
            case "23":
                globalDayEnd = "qD";
                break;
            case "24":
                globalDayEnd = "pC";
                break;
            case "25":
                globalDayEnd = "oB";
                break;
            case "26":
                globalDayEnd = "nA";
                break;
            case "27":
                globalDayEnd = "aC";
                break;
            case "28":
                globalDayEnd = "bD";
                break;
            case "29":
                globalDayEnd = "cE";
                break;
            case "30":
                globalDayEnd = "dF";
                break;
            case "31":
                globalDayEnd = "eG";
                break;
        }
        dayEnd = globalDayEnd;
    }



}
