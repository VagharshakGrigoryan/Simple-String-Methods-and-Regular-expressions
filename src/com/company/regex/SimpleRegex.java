package com.company.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SimpleRegex {
    public static void main(String[] args) {
//        Pattern pattern = Pattern.compile("[a-zA-Z]+\\s*[a-zA-Z]+");
//        Matcher matcher = pattern.matcher("Hello World");
        Pattern pattern = Pattern.compile("[a-z && [^d]]+",Pattern.CASE_INSENSITIVE|Pattern.UNICODE_CASE);
        Matcher matcher = pattern.matcher("Java");
        boolean b = matcher.matches();
        System.out.println(b);
    }
}
