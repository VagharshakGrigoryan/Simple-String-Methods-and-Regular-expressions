package com.company.string;

public class StringBuffer {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        System.out.println("length -> " + sb.length());
        System.out.println("size   -> " + sb.capacity());

        sb.append("Java");

        System.out.println("row    -> "+sb);
        System.out.println("length -> "+sb.length());
        System.out.println("size   -> "+sb.capacity());
        System.out.println("revers -> "+sb.reverse());
    }
}
