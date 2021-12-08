package com.epam.triangle.logic;

import com.epam.triangle.entity.Point;
import com.epam.triangle.entity.Triangle;

import javax.xml.validation.Validator;

public class TriangleCalculator {

    public double getSideLength(Point first, Point second) {
        return Math.sqrt(Math.pow((second.getxCoordinate() - first.getxCoordinate()), 2)
                + Math.pow((second.getyCoordinate() - first.getyCoordinate()), 2));
    }

    public double perimeter(Point a, Point b, Point c) {

        return getSideLength(c, a) + getSideLength(a, b) + getSideLength(b, c);
    }

    public double areaOfATriangle(Point a, Point b, Point c) {
        double semiPerimeter = perimeter(a, b, c) / 2;


        return Math.sqrt(semiPerimeter * (semiPerimeter - getSideLength(a, b)) * (semiPerimeter - getSideLength(b, c)) * (semiPerimeter - getSideLength(c, a)));

    }


}
