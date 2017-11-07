package com.horstmann.java8.com.horstmann.java8.chapter1;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String s = in.nextLine();

        for (char c :
             s.toCharArray()) {
            if (c != ' ') {
                System.out.print(c);
            }
        }
    }
}
