package com.epam.utils;

import java.util.Scanner;

public class EnterValue {

    public static double enterPositiveDouble(String message) {
        double result = 0;
        // System.out.println(message);
        while (result <= 0) {
            result = enterDouble(message);
            if (result <= 0)
                System.out.println("Enter value greater than 0");
        }
        return result;
    }

    public static double enterDouble(String message) {
        Scanner scan = new Scanner(System.in);
        System.out.println(message);
        double result;

        while (!scan.hasNextDouble()) {
            System.out.println(message);
            scan.next();
        }
        result = scan.nextDouble();
        return result;
    }

    public static int enterPositiveInt(String message) {
        int result = 0;
        //System.out.println(message);
        while (result <= 0) {
            result = enterInt(message);
            if (result <= 0)
                System.out.println("Enter value greater than 0");
        }
        return result;
    }

    public static int enterBoundedInt(String message, int min, int max) {
        int result = enterInt(message);

        while (result < min || result > max)
            result = enterInt(message);

        return result;
    }

    public static int enterInt(String message) {
        Scanner scan = new Scanner(System.in);
        System.out.println(message);

        while (!scan.hasNextInt()) {
//            System.out.println(message);
            scan.next();
        }

        return scan.nextInt();
    }public static int enterIntWithoutString() {
        Scanner scan = new Scanner(System.in);

              while (!scan.hasNextInt()) {
            System.out.println();
            scan.next();
        }

        return scan.nextInt();
    }
}
