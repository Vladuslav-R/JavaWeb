package com.epam.triangle.observer;

import com.epam.triangle.entity.Point;
import com.epam.triangle.entity.Triangle;
import com.epam.triangle.logic.TriangleCalculator;

import java.util.HashMap;
import java.util.Map;

public class TriangleStore implements Observer {

    private static TriangleStore instance;
    private final Map<Integer, Parameter> parameters = new HashMap<Integer, Parameter>();
    private final TriangleCalculator triangleCalculator = new TriangleCalculator();

    private TriangleStore () {};

    public void update (TriangleObservable triangle) {
        System.out.println("Triangle has been changed");

        double perimeter  = triangleCalculator.perimeter(triangle.getA(), triangle.getB(), triangle.getC());
        double areaOfATriangle  = triangleCalculator.areaOfATriangle(triangle.getA(), triangle.getB(), triangle.getC());

        System.out.println("New area of a triangle" + " " +  areaOfATriangle);

        parameters.put(triangle.getId(), new Parameter(perimeter,areaOfATriangle));
    }

    public static TriangleStore getInstance() {
        if(instance == null) {
            instance = new TriangleStore();
        }
        return instance;
    }
}
