package com.epam.cone.entity;

public class Cone {

    private final Point center;
    private final Point vertex;

    private final double radius;


    public Cone(Point center, Point vertex, double radius) {
        center = new Point().;
        this.center=center;
        vertex = new Point();
        this.vertex = vertex;
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public Point getVertex() {
        return vertex;
    }

    public double getRadius() {
        return radius;
    }
}
