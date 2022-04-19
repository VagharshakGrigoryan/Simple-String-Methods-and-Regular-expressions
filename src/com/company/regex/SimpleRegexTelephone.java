package com.company.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SimpleRegexTelephone {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("\\+[1-9]\\d{2}\\(\\d{2}\\)(\\d{2}-){2}\\d{3}");
        Matcher m = p.matcher("+374(11)22-33-444");
        boolean b=m.matches();
        System.out.println(b);
    }
}
