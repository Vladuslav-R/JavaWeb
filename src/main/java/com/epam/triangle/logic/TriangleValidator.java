package com.epam.triangle.logic;

import com.epam.calculator.Calculator;
import com.epam.triangle.entity.Point;
import com.epam.triangle.entity.Triangle;

import java.util.logging.Logger;

public class TriangleValidator {
    public static final Logger LOGGER = Logger.getLogger(TriangleValidator.class.getName());
    TriangleCalculator calculator = new TriangleCalculator();


    public boolean isATriangleExist(Point a, Point b, Point c) {
        LOGGER.info("Trangle the triangle exists ");
        return a.getxCoordinate() == b.getxCoordinate() && b.getxCoordinate() == c.getxCoordinate()
                || a.getyCoordinate() == b.getyCoordinate() && b.getyCoordinate() == c.getyCoordinate();
    }


    public boolean isRightTriangle(Point a, Point b, Point c) {

        //Test 1

        double sideABSquared = Math.pow(calculator.getSideLength(a, b), 2);
        double sideBCSquared = Math.pow(calculator.getSideLength(b, c), 2);
        double sideCASquared = Math.pow(calculator.getSideLength(c, a), 2);
        LOGGER.info("the triangle is rectangular ");
        return (sideABSquared + sideBCSquared == sideCASquared || sideABSquared + sideCASquared == sideBCSquared ||
                sideBCSquared + sideCASquared == sideABSquared);
    }

    public boolean isIsoscelesTriangle(Point a, Point b, Point c) {
        LOGGER.info("the triangle is isosceles ");
        return ((calculator.getSideLength(a, b) == calculator.getSideLength(b, c)) || (calculator.getSideLength(b, c)
                == calculator.getSideLength(c, a)) || (calculator.getSideLength(c, a) == calculator.getSideLength(b, a)));
    }

    public boolean isEquilateralTriangle(Point a, Point b, Point c) {
        LOGGER.info("the triangle is equilateral ");
        return (calculator.getSideLength(a, b) == calculator.getSideLength(b, c))
                && (calculator.getSideLength(b, c) == calculator.getSideLength(c, a));
    }

    public boolean isObtuseTriangle(Point a, Point b, Point c) {
        LOGGER.info("the triangle is obtuse ");
        double sideABSquared = Math.pow(calculator.getSideLength(a, b), 2);
        double sideBCSquared = Math.pow(calculator.getSideLength(b, c), 2);
        double sideCASquared = Math.pow(calculator.getSideLength(c, a), 2);
        double cosA = (sideABSquared + sideCASquared - sideBCSquared) / 2 * (sideABSquared * sideCASquared);
        double cosB = (sideABSquared + sideBCSquared - sideCASquared) / 2 * (sideABSquared * sideBCSquared);
        double cosC = (sideBCSquared + sideCASquared - sideABSquared) / 2 * (sideCASquared * sideBCSquared);
        return cosC > 90 || cosB > 90 || cosA > 90;
    }

    public boolean isSharpTriangle(Point a, Point b, Point c) {
        double sideABSquared = Math.pow(calculator.getSideLength(a, b), 2);
        double sideBCSquared = Math.pow(calculator.getSideLength(b, c), 2);
        double sideCASquared = Math.pow(calculator.getSideLength(c, a), 2);
        double cosA = (sideABSquared + sideCASquared - sideBCSquared) / 2 * (sideABSquared * sideCASquared);
        double cosB = (sideABSquared + sideBCSquared - sideCASquared) / 2 * (sideABSquared * sideBCSquared);
        double cosC = (sideBCSquared + sideCASquared - sideABSquared) / 2 * (sideCASquared * sideBCSquared);
        LOGGER.info("the triangle is sharpe ");
        return cosA < 90 && cosB < 90 && cosC > 90;
    }
}
