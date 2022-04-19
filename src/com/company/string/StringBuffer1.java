package com.company.string;

public class StringBuffer1 {
    public static void main(String[] args) {
        String str = "Human have ";
        String str1 = " fut";
        int paws = 2;
        java.lang.StringBuffer sb = new java.lang.StringBuffer(20);
        sb.append(str).append(paws).append(str1);
        System.out.println(sb.capacity());
        System.out.println(sb);

    }
}
