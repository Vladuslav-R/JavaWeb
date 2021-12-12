package com.epam.triangle.logic;

import com.epam.triangle.entity.Point;
import com.epam.triangle.entity.Triangle;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.xml.validation.Validator;

public class TriangleCalculator {
    private static final Logger LOGGER = LogManager.getLogger(TriangleCalculator.class);

    public double getSideLength(Point first, Point second) {
        return Math.sqrt(Math.pow((second.getxCoordinate() - first.getxCoordinate()), 2)
                + Math.pow((second.getyCoordinate() - first.getyCoordinate()), 2));
    }

    public double perimeter(Point a, Point b, Point c) {

        return getSideLength(c, a) + getSideLength(a, b) + getSideLength(b, c);
    }

    public double areaOfATriangle(Point a, Point b, Point c) {
        double semiPerimeter = perimeter(a, b, c) / 2;
        double result = Math.sqrt(semiPerimeter * (semiPerimeter - getSideLength(a, b)) *
                (semiPerimeter - getSideLength(b, c)) * (semiPerimeter - getSideLength(c, a)));
        LOGGER.info("Calculated the surface area of " + a + ": " + result);
        return result;

    }


}
