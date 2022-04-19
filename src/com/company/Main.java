package com.company;

public class Main {

    public static void main(String[] args) {

        String str1 = "Hello ";
        String str2 = "World ";
        String str3 = "!!!";
        String str4 = "!!!";

        System.out.println(str1.replace("l", "t"));
        System.out.println(str1.toLowerCase());
        System.out.println(str1.toUpperCase());

        long l1 = System.nanoTime();
        String str = str1.concat(str2).concat(str3).concat(str4);
        long l2 = System.nanoTime();
        System.out.println(str);
        System.out.println(l2 - l1);

        long l3 = System.nanoTime();
        String ss = str1 + str2 + str3 + str4;
        long l4 = System.nanoTime();
        System.out.println(ss);
        System.out.println(l4 - l3);

        long l5 = System.nanoTime();
        String sls = new StringBuilder().append(str).append(str1).append(str3).append(str4).toString();
        long l6 = System.nanoTime();
        System.out.println(sls);
        System.out.println(l6 - l5);

        System.out.println(str1.equals("Hello "));
        System.out.println(str2.equalsIgnoreCase("WORLD "));
        System.out.println(str1.startsWith("H"));
        System.out.println(str1.endsWith(" "));
        System.out.println(str1.substring(2));
        System.out.println(str1.length());
        System.out.println(str1.indexOf("l"));

        int i1 = 55;
        System.out.println(i1);
        System.out.println(i1);
        Integer i2 = null;
        System.out.println(String.valueOf(i1) instanceof String);

        double d = 20.222222d;
        System.out.printf("%.2f",d);
    }
}
