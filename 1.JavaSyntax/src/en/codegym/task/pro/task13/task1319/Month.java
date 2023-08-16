package en.codegym.task.pro.task13.task1319;

/* 
Months of the season
*/

import java.util.ArrayList;
import java.util.List;

public enum Month {
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER;

    public static Month[] getWinterMonths(){
        Month[] WinterMonths = new Month[]{Month.DECEMBER,Month.JANUARY,Month.FEBRUARY};
        return WinterMonths;
    }
    public static Month[] getSpringMonths(){
        Month[] SpringMonths = new Month[]{Month.MARCH,Month.APRIL,Month.MAY};
        return SpringMonths;


    }
    public static Month[] getSummerMonths(){
        Month[] SummerMonths = new Month[]{Month.JUNE,Month.JULY,Month.AUGUST};
        return SummerMonths;

    }
    public static Month[] getAutumnMonths(){
        Month[] AutumnMonths = new Month[]{Month.SEPTEMBER,Month.OCTOBER,Month.NOVEMBER};
        return AutumnMonths;

    }

    }
