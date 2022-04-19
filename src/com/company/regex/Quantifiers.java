package com.company.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Quantifiers {
    public static void main(String[] args) {
        myMatchers("([a-z]*)([a-z]+)");
        myMatchers("([a-z]?)([a-z]+)");
        myMatchers("([a-z]+)([a-z]*)");
        myMatchers("([a-z]?)([a-z]?)");
    }

    private static void myMatchers(String regex) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher("abdcxyz");

        if (matcher.matches()){
            System.out.println("First group: " + matcher.group(1));
            System.out.println("Second group: " + matcher.group(2));
        }else {
            System.out.println("Nothing");
        }
        System.out.println();
    }
}
