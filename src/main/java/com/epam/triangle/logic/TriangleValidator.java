package com.epam.triangle.logic;

import com.epam.calculator.Calculator;
import com.epam.triangle.entity.Triangle;

public class TriangleValidator {
  TriangleCalculator calculator = new TriangleCalculator();


    public boolean isATriangleExist(Triangle triangle) {
        double a = calculator.sideAB(triangle.getA(), triangle.getB());
        double b = calculator.sideBC(triangle.getB(), triangle.getC());
        double c = calculator.sideCA(triangle.getC(), triangle.getA());

        return ((a < b + c) && (b < a + c) && (c < a + b));
    }

    public boolean isRightTriangle(Triangle triangle) {
        double a = calculator.sideAB(triangle.getA(), triangle.getB());
        double b = calculator.sideBC(triangle.getB(), triangle.getC());
        double c = calculator.sideCA(triangle.getC(), triangle.getA());

        double aSquared = Math.pow(a, 2);
        double bSquared = Math.pow(b, 2);
        double cSquared = Math.pow(c, 2);
        return (aSquared + bSquared == cSquared || aSquared + cSquared == bSquared || bSquared + cSquared == aSquared);
    }

    public boolean isIsoscelesTriangle(Triangle triangle) {
        double a = calculator.sideAB(triangle.getA(), triangle.getB());
        double b = calculator.sideBC(triangle.getB(), triangle.getC());
        double c = calculator.sideCA(triangle.getC(), triangle.getA());


        return ((a == b) || (b == c) || (c == a));
    }

    public boolean isEquilateralTriangle(Triangle triangle) {
        double a = calculator.sideAB(triangle.getA(), triangle.getB());
        double b = calculator.sideBC(triangle.getB(), triangle.getC());
        double c = calculator.sideCA(triangle.getC(), triangle.getA());


        return (a == b) && (b == c);
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
