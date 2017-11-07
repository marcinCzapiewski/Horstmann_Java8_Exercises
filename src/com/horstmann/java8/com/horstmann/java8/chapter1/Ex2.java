package com.horstmann.java8.com.horstmann.java8.chapter1;

import java.util.Scanner;

import static java.lang.Math.floorMod;

public class Ex2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int angle = in.nextInt();
        angle = normalizeMod(angle);
        System.out.println(angle);

    }

    public static int normalizeMod(int angle) {
        angle %= 360;
        if (angle < 0) {
            angle *= -1;
        }

        return angle;
    }

    public static int normalizeFloorMod(int angle) {
        angle = floorMod(angle, 360);
        if (angle < 0) {
            angle *= -1;
        }

        return angle;
    }
}
