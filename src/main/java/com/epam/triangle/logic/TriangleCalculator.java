package com.epam.triangle.logic;

import com.epam.triangle.entity.Point;
import com.epam.triangle.entity.Triangle;

public class TriangleCalculator {

    public double sideAB(double aX, double aY, double bX, double bY) {
        Point a = new Point(aX, aY);
        Point b = new Point(bX, bY);

        return Math.sqrt(Math.pow((bX - aX), 2) - Math.pow((bY - aY), 2));
    }

    public double sideBC(double bX, double bY, double cX, double cY) {
        Point b = new Point(bX, bY);
        Point c = new Point(cX, cY);

        return Math.sqrt(Math.pow((cX - bX), 2) - Math.pow((cY - bY), 2));
    }

    public double sideCA(Point c, Point a) {
        return Math.sqrt(Math.pow((a.getxCoordinate() - c.getxCoordinate()), 2) - Math.pow((a.getyCoordinate() - c.getyCoordinate()), 2));
    }

    public double perimeter(Triangle triangle) {
        return sideCA(triangle.getC(), triangle.getA());
    }

}



