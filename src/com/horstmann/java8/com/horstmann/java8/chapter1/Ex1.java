package com.horstmann.java8.com.horstmann.java8.chapter1;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int k = in.nextInt();

        System.out.println("Given integer in binary: " + Integer.toBinaryString(k));
        System.out.println("Given integer in octal: " + Integer.toOctalString(k));
        System.out.println("Given integer in hexadecimal: " + Integer.toHexString(k));

        System.out.println("Inverse of integer: " + Double.toHexString(1./k));
    }
}
