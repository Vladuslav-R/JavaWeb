package com.epam.triangle.logic;

import java.util.HashMap;
import java.util.Map;
import com.epam.triangle.logic.TriangleCalculator;
public class TriangleStore {
public static TriangleStore instance;
    private final Map<Integer, Parameter> parameters = new HashMap<Integer, Parameter>();
    private final TriangleCalculator triangleCalculator = new TriangleCalculator();
    private TriangleStore () {};
    public void update (TriangleIdentifiable triangle) {
        double perimeter  = triangleCalculator.perimeter(triangle);
        double areaOfATriangle  = triangleCalculator.areaOfATriangle(triangle);
        parameters.put(triangle.getId(), new Parameter(perimeter,areaOfATriangle));
    }
    public static TriangleStore getInstance() {
        if(instance == null) {
            instance = new TriangleStore();
        }
        return instance;
    }
}
