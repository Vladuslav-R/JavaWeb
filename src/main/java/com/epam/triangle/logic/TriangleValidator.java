package com.epam.triangle.logic;

import com.epam.calculator.Calculator;
import com.epam.triangle.entity.Point;
import com.epam.triangle.entity.Triangle;

public class TriangleValidator {
  TriangleCalculator calculator = new TriangleCalculator();
Е

    public boolean isATriangleExist(TPoint a, Point b, Point c) {


        double sideAB = calculator.sideAB(triangle.getA(), triangle.getB());
        double sideBC = calculator.sideBC(triangle.getB(), triangle.getC());
        double sideCA = calculator.sideCA(triangle.getC(), triangle.getA());

        return ((sideAB < sideBC + sideCA) && (sideBC < sideAB + sideCA) && (sideCA < sideAB + sideBC));
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
        double a = calculator.sideAB(triangle.getA(), triangle.getB());
        double b = calculator.sideBC(triangle.getB(), triangle.getC());
        double c = calculator.sideCA(triangle.getC(), triangle.getA());

        double aSquared = Math.pow(a, 2);
        double bSquared = Math.pow(b, 2);
        double cSquared = Math.pow(c, 2);
        double cosA = (aSquared + cSquared - bSquared) / 2 * (a * c);
        double cosB = (aSquared + bSquared - cSquared) / 2 * (a * b);
        double cosc = (bSquared + cSquared - aSquared) / 2 * (c * b);
        return a > 90 || b > 90 || b > 90 ;
    }
    public boolean isSharpTriangle(Triangle triangle) {
        double a = calculator.sideAB(triangle.getA(), triangle.getB());
        double b = calculator.sideBC(triangle.getB(), triangle.getC());
        double c = calculator.sideCA(triangle.getC(), triangle.getA());

        double aSquared = Math.pow(a, 2);
        double bSquared = Math.pow(b, 2);
        double cSquared = Math.pow(c, 2);
        double cosA = (aSquared + cSquared - bSquared) / 2 * (a * c);
        double cosB = (aSquared + bSquared - cSquared) / 2 * (a * b);
        double cosc = (bSquared + cSquared - aSquared) / 2 * (c * b);
        return a < 90 && b < 90 && b > 90 ;
    }
}
