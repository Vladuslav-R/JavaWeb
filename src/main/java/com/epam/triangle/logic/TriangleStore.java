package com.epam.triangle.logic;

import com.epam.triangle.entity.Point;
import com.epam.triangle.entity.Triangle;

import java.util.HashMap;
import java.util.Map;

public class TriangleStore implements Observer {

    public static TriangleStore instance;
    private final Map<Integer, Parameter> parameters = new HashMap<Integer, Parameter>();
    private final TriangleCalculator triangleCalculator = new TriangleCalculator();
    private TriangleStore () {};
    public void update (TriangleObservable triangle) {
        System.out.println("Triangle has been changed");
        double perimeter  = triangleCalculator.perimeter(new Point(1, 1),
                new Point(1, 7), new Point(3, 7));
        double areaOfATriangle  = triangleCalculator.areaOfATriangle((new Point(1, 1)),
                new Point(1, 7), new Point(3, 7));
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
