package com.epam.triangle.entity;

import com.epam.triangle.logic.TriangleCalculator;
import com.epam.triangle.observer.TriangleObservable;
import com.epam.triangle.observer.TriangleStore;

public class Runner {
    static TriangleCalculator triangleCalculator = new TriangleCalculator();

    public static void main(String[] args) {

        TriangleObservable triangle = new TriangleObservable(1, new Point(1, 1),
                new Point(1, 7), new Point(3, 7));

        System.out.println(triangleCalculator.areaOfATriangle(triangle.getA(), triangle.getB(), triangle.getC()));
        TriangleStore triangleStore = TriangleStore.getInstance();
        triangle.attach(triangleStore);

        triangle.setA(new Point(2, 5));

        System.out.println(triangleCalculator.areaOfATriangle(triangle.getA(), triangle.getB(), triangle.getC()));

    }
}