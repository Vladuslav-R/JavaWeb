package com.epam.triangle.entity;


import java.util.Objects;

public class Point {


    private final double xCoordinate;
    private final double yCoordinate;

    public Point(double xCoordinate, double yCoordinate) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }

    public double getxCoordinate() {
        return xCoordinate;
    }

    public double getyCoordinate() {
        return yCoordinate;
    }

    private  Point a;
    private  Point b;
    private  Point c;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Point)) return false;
        Point that = (Point) o;
        return Double.compare(that.getxCoordinate(), getxCoordinate()) == 0 && Double.compare(that.getyCoordinate(), getyCoordinate()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getxCoordinate(), getyCoordinate());
    }
}


