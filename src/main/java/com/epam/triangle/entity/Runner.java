package com.epam.triangle.entity;

import com.epam.triangle.logic.TriangleCalculator;
import com.epam.triangle.logic.TriangleObservable;
import com.epam.triangle.logic.TriangleStore;

public class Runner {
    public static void main(String[] args) {

        TriangleObservable triangle = new TriangleObservable (1, new Point(1,1),
                new Point(1,7),new Point(3,7));
        TriangleStore triangleStore = TriangleStore.getInstance();
 triangle.attach(triangleStore);

triangle.setA(new Point(2,5));


    }
}