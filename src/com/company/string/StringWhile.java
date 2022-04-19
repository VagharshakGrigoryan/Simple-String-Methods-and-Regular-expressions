package com.company.string;

import java.util.Scanner;

public class StringWhile {
    public static void main(String[] args) {
        String str = "Lorem Ipsum is simply dummy text.Java of the printing and, typesetting industry. " +
                "Lorem Ipsum has been the industry's. standard dummy Java text, ever since the 1500s." +
                " when an 2 400 unknown, printer Java took a galley. of type and 3 200 scrambled it Java to make. a type Java specimen book.";

        Scanner scanner = new Scanner(str);
        while (scanner.hasNext()){
            if (scanner.hasNext("Java")){
                System.out.println(scanner.next());
            }else if (scanner.hasNextInt()){
                System.out.println(scanner.nextInt());
            }else {
                scanner.next();
            }
        }
    }
}
