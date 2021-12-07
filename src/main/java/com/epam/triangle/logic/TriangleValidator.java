package com.epam.triangle.logic;

import com.epam.calculator.Calculator;
import com.epam.triangle.entity.Point;
import com.epam.triangle.entity.Triangle;

public class TriangleValidator {
    TriangleCalculator calculator = new TriangleCalculator();


    public boolean isATriangleExist(Point a, Point b, Point c) {
       // Triangle triangle = new Triangle(a, b, c);

//        double sideAB = calculator.sideAB(triangle.getA(), triangle.getB());
//        double sideBC = calculator.sideBC(triangle.getB(), triangle.getC());
//        double sideCA = calculator.sideCA(triangle.getC(), triangle.getA());
        return  a.getxCoordinate() == b.getxCoordinate() && b.getxCoordinate() == c.getxCoordinate()
                || a.getyCoordinate() == b.getyCoordinate() && b.getyCoordinate() == c.getyCoordinate();

    }







    public boolean isRightTriangle(Triangle triangle) {
        double sideAB = calculator.sideAB(triangle.getA(), triangle.getB());
        double sideBC = calculator.sideBC(triangle.getB(), triangle.getC());
        double sideCA = calculator.sideCA(triangle.getC(), triangle.getA());

        double sideABSquared = Math.pow(sideAB, 2);
        double sideBCSquared = Math.pow(sideBC, 2);
        double sideCASquared = Math.pow(sideCA, 2);
        return (sideABSquared + sideBCSquared == sideCASquared || sideABSquared + sideCASquared == sideBCSquared || sideBCSquared + sideCASquared == sideABSquared);
    }

    public boolean isIsoscelesTriangle(Triangle triangle) {
        double sideAB = calculator.sideAB(triangle.getA(), triangle.getB());
        double sideBC = calculator.sideBC(triangle.getB(), triangle.getC());
        double sideCA = calculator.sideCA(triangle.getC(), triangle.getA());


        return ((sideAB == sideBC) || (sideBC == sideCA) || (sideCA == sideAB));
    }

    public boolean isEquilateralTriangle(Triangle triangle) {
        double sideAB = calculator.sideAB(triangle.getA(), triangle.getB());
        double sideBC = calculator.sideBC(triangle.getB(), triangle.getC());
        double sideCA = calculator.sideCA(triangle.getC(), triangle.getA());


        return (sideAB == sideBC) && (sideBC == sideCA);
    }

    public boolean isObtuseTriangle(Triangle triangle) {
        double sideAB = calculator.sideAB(triangle.getA(), triangle.getB());
        double sideBC = calculator.sideBC(triangle.getB(), triangle.getC());
        double sideCA = calculator.sideCA(triangle.getC(), triangle.getA());

        double aSquared = Math.pow(sideAB, 2);
        double sideBCSquared = Math.pow(sideBC, 2);
        double cSquared = Math.pow(sideCA, 2);
        double cosA = (aSquared + cSquared - sideBCSquared) / 2 * (sideAB * sideCA);
        double cosB = (aSquared + sideBCSquared - cSquared) / 2 * (sideAB * sideBC);
        double cosc = (sideBCSquared + cSquared - aSquared) / 2 * (sideCA * sideBC);
        return sideAB > 90 || sideBC > 90 || sideBC > 90;
    }

    public boolean isSharpTriangle(Triangle triangle) {
        double sideAB = calculator.sideAB(triangle.getA(), triangle.getB());
        double sideBC = calculator.sideBC(triangle.getB(), triangle.getC());
        double sideCA = calculator.sideCA(triangle.getC(), triangle.getA());

        double aSquared = Math.pow(sideAB, 2);
        double sideBCSquared = Math.pow(sideBC, 2);
        double cSquared = Math.pow(sideCA, 2);
        double cosA = (aSquared + cSquared - sideBCSquared) / 2 * (sideAB * sideCA);
        double cosB = (aSquared + sideBCSquared - cSquared) / 2 * (sideAB * sideBC);
        double cosc = (sideBCSquared + cSquared - aSquared) / 2 * (sideCA * sideBC);
        return sideAB < 90 && sideBC < 90 && sideBC > 90;
    }
}
