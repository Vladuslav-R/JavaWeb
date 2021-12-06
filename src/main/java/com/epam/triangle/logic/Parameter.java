package com.epam.triangle.logic;

import com.epam.triangle.entity.Triangle;

public class Parameter {
    private final double perimeter;
    private final double areaOfATriangle;

    public Parameter(double perimeter, double areaOfATriangle) {
        this.perimeter = perimeter;
        this.areaOfATriangle = areaOfATriangle;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public double getAreaOfATriangle() {
        return areaOfATriangle;
    }

}
