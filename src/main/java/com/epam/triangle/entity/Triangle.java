package com.epam.triangle.entity;

import com.epam.triangle.entity.Point;

public class Triangle {

    private  Point a;
    private  Point b;
    private  Point c;


    public Triangle (Point a, Point b, Point c ) {
        this.a = new Point(a.getxCoordinate(), a.getyCoordinate());
        this.b = new Point(b.getxCoordinate(),b.getyCoordinate());
        this.c = new Point(c.getxCoordinate(),c.getyCoordinate());
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

    public void setA(Point a) {
        this.a = a;
    }

    public void setB(Point b) {
        this.b = b;
    }

    public void setC(Point c) {
        this.c = c;
    }
}

