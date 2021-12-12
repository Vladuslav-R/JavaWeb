package com.epam.triangle.repository;

import com.epam.triangle.logic.TriangleCalculator;

public class AreaSpecification implements Specification {
    private double minArea;
    private double maxArea;
    private TriangleCalculator calculator = new TriangleCalculator();

    public AreaSpecification(double minArea, double maxArea) {
        this.minArea = minArea;
        this.maxArea = maxArea;

        //AreaSpecification specification = new AreaSpecification(4, 8);
    }

    @Override
    public boolean specified(TriangleIdentifiable triangle) {
        double area = calculator.areaOfATriangle(triangle.getA(), triangle.getB(), triangle.getC());
        return area >= minArea && area <= maxArea;
    }
}
