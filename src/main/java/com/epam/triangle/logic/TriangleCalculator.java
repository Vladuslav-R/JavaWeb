package com.epam.triangle.logic;

import com.epam.triangle.entity.Point;
import com.epam.triangle.entity.Triangle;

public class TriangleCalculator {

    public double sideAB(Point a, Point b) {
        return Math.sqrt(Math.pow((b.getxCoordinate() - a.getxCoordinate()), 2) - Math.pow((b.getyCoordinate() - a.getyCoordinate()), 2));
    }

    public double sideBC(Point b, Point c) {


        return Math.sqrt(Math.pow((c.getxCoordinate() - b.getxCoordinate()), 2) - Math.pow((c.getyCoordinate() - b.getyCoordinate()), 2));
    }

    public double sideCA(Point c, Point a) {
        return Math.sqrt(Math.pow((a.getxCoordinate() - c.getxCoordinate()), 2) - Math.pow((a.getyCoordinate() - c.getyCoordinate()), 2));

    }

    public double perimeter(Triangle triangle) {

        return sideCA(triangle.getC(), triangle.getA()) + sideBC(triangle.getB(), triangle.getC()) + sideAB(triangle.getA(), triangle.getB());
    }


    public double AreaOfATriangle(Triangle triangle) {
        double semiPerimeter = perimeter(triangle) / 2;
        double sideAB = sideAB(triangle.getA(), triangle.getB());
        double sideBC = sideBC(triangle.getB(), triangle.getC());
        double sideCA = sideCA(triangle.getC(), triangle.getA());

        return Math.sqrt(semiPerimeter * (semiPerimeter - sideAB) * (semiPerimeter - sideBC) * (semiPerimeter - sideCA));

    }

    public boolean isATriangleExist(Triangle triangle) {
        double a = sideAB(triangle.getA(), triangle.getB());;
        double b = sideBC(triangle.getB(), triangle.getC());
        double c = sideCA(triangle.getC(), triangle.getA());



        if ((a < b+c) && (b < a+c) && (c < a+b)
    }

}


