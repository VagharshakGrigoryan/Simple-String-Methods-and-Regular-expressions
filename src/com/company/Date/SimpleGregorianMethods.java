package com.company.Date;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class SimpleGregorianMethods {
    public static void main(String[] args) {

        GregorianCalendar gc = new GregorianCalendar();
        System.out.println(gc.get(Calendar.DAY_OF_MONTH));
        System.out.println(gc.get(Calendar.MONTH));
        System.out.println(gc.get(Calendar.DAY_OF_YEAR));
        System.out.println(gc.get(Calendar.DAY_OF_WEEK));


        System.out.println((char) 27 + "[31m" + "============================");
        gc.set(Calendar.MONTH, Calendar.APRIL);

        gc.set(Calendar.DAY_OF_MONTH,12);
        System.out.println(gc.get(Calendar.DAY_OF_WEEK));

        System.out.println((char) 27 + "[32m" + "============================");
        GregorianCalendar gc1 =new GregorianCalendar(2022,Calendar.APRIL,30);
        System.out.println(gc1.get(Calendar.DAY_OF_WEEK));

        System.out.println((char) 27 + "[35m" + "============================");
        GregorianCalendar gc2 =new GregorianCalendar(2022,Calendar.MAY,20);
        System.out.println(gc2.get(Calendar.DAY_OF_MONTH));
        System.out.println(gc2.get(Calendar.MONTH));
        System.out.println(gc2.get(Calendar.YEAR));

        System.out.println((char) 27 + "[36m" + "============================");
        Date d1 = gc2.getTime();
        System.out.println(d1);

        gc.setTime(d1);
        System.out.println(gc.get(Calendar.DAY_OF_MONTH));
        System.out.println(gc.get(Calendar.MONTH));

    }
}
