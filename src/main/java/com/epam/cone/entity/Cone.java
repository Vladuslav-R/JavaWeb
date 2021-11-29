package com.epam.cone.entity;

public class Cone{

    private final Point center;
    private final Point vertex;

    private final double radius;


    public Cone (double centerXCoordinate,double centerYCoordinate,double vertexXCoordinate,double vertexYCoordinate, double radius) {
        this.center = new Point(centerXCoordinate,centerYCoordinate);
        this.vertex = new Point(vertexXCoordinate, vertexYCoordinate);
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
