package com.company.string;

public class StringRevers {
    public static void main(String[] args) {

        String palindrome = "Dot saw i was Tod";
        StringBuilder sb = new StringBuilder(palindrome);
        sb.reverse();
        System.out.println(sb);
    }
}
