package aulas.trabalhandoComDatas.javaCalendar;

import java.util.Calendar;

/**
 *  Exemplo de utilização da classe Calendar
 */
public class Exemplo005 {
    public static void main(String[] args) {

        Calendar agora = Calendar.getInstance();

        System.out.println(agora);
        /*  java.util.GregorianCalendar[
                time=1563147161361,
                areFieldsSet=true,
                areAllFieldsSet=true,
                lenient=true,
                zone=sun.util.calendar.ZoneInfo[
                    id="America/Sao_Paulo",
                    offset=-10800000,
                    dstSavings=3600000,
                    useDaylight=true,
                    transitions=129,
                    lastRule=java.util.SimpleTimeZone[
                        id=America/Sao_Paulo,
                        offset=-10800000,
                        dstSavings=3600000,
                        useDaylight=true,
                        startYear=0,
                        startMode=3,
                        startMonth=10,
                        startDay=1,
                        startDayOfWeek=1,
                        startTime=0,
                        startTimeMode=0,
                        endMode=3,
                        endMonth=1,
                        endDay=15,
                        endDayOfWeek=1,
                        endTime=0,
                        endTimeMode=0
                    ]
                ],
                firstDayOfWeek=1,
                minimalDaysInFirstWeek=1,
                ERA=1,
                YEAR=2019,
                MONTH=6,
                WEEK_OF_YEAR=29,
                WEEK_OF_MONTH=3,
                DAY_OF_MONTH=14,
                DAY_OF_YEAR=195,
                DAY_OF_WEEK=1,
                DAY_OF_WEEK_IN_MONTH=2,
                AM_PM=1,
                HOUR=8,
                HOUR_OF_DAY=20,
                MINUTE=32,
                SECOND=41,
                MILLISECOND=361,
                ZONE_OFFSET=-10800000,
                DST_OFFSET=0
             ]
        */
    }
}
