package com.horstmann.java8.com.horstmann.java8.chapter1;

import java.math.BigInteger;
import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        System.out.println(factorial(n));
    }

    public static BigInteger factorial(int n) {
        BigInteger factorial = BigInteger.valueOf(1);

        for(int i = 1; i <= n; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }

        return factorial;
    }
}
