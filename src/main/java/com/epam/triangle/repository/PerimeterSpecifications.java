package com.epam.triangle.repository;

import com.epam.triangle.entity.Point;
import com.epam.triangle.entity.Triangle;
import com.epam.triangle.logic.TriangleCalculator;

public class PerimeterSpecifications implements Specification {
    double minPerimeter;
    double maxPerimeter;
    private TriangleCalculator calculator = new TriangleCalculator();

    public PerimeterSpecifications(double minPerimeter, double maxPerimeter) {
        this.minPerimeter = minPerimeter;
        this.maxPerimeter = maxPerimeter;
    }


    @Override
    public boolean specified(TriangleIdentifiable triangle) {
        double perimeter = calculator.perimeter(triangle.getA(), triangle.getB(), triangle.getC());
        return perimeter >= minPerimeter && perimeter <= maxPerimeter;
    }
}
