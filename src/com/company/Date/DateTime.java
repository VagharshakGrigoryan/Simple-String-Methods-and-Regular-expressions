package com.company.Date;

import java.util.Date;

class DateTime {
    public static void main(String[] args) {
        Date date = new Date();
        long millis = date.getTime();
        System.out.println(millis);
    }
}
