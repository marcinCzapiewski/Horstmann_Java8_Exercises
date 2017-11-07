package com.horstmann.java8.com.horstmann.java8.chapter1;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a, b, c;

        System.out.println("Enter a: ");
        a = in.nextInt();

        System.out.println("Enter b: ");
        b = in.nextInt();
        System.out.println("Enter c: ");
        c = in.nextInt();

        int max;

        max =  a > b ? a : b;

        max = max > c ? max : c;

        System.out.println("Max: " + max);

        max = Math.max(a, b);
        max = Math.max(max, c);

        System.out.println("Max: " + max);
    }


}
