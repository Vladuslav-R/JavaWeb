package com.epam.utils;

public final class ArrayUtils {
private ArrayUtils () {}; // присваиваем классу атрибут final и создаем пустой конструктор,
    // с целью запрещения создания объектов класса ArrayUtils
    public static void printArrayInline(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");

        }
        System.out.println();
        System.out.println();
    }

    public static void printArray(int[] array) {
        for (int element : array) {
            System.out.println(element + " ");
        }
    }
}