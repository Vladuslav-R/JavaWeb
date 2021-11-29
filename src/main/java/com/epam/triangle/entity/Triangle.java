package com.epam.triangle.entity;

import com.epam.triangle.entity.Point;

public class Triangle {

    private final Point a;
    private final Point b;
    private final Point c;


    public Triangle (double aX,double aY,double bX,double bY, double cX,double cY ) {
        this.a = new Point(aX,aY);
        this.b = new Point(bX,bY);
        this.c = new Point(cX,cY);
    }

    public Point getA() {
        return a;
    }

    public Point getB() {
        return b;
    }

    public Point getC() {
        return c;
    }
}
