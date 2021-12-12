//package com.epam.cone.entity;
//
//import java.util.Objects;
//
//public class PointVertex {
//    private final double xCoordinate;
//    private final double yCoordinate;
//
//
//    public PointVertex(double xCoordinate, double yCoordinate) {
//        this.xCoordinate = xCoordinate;
//        this.yCoordinate = yCoordinate;
//    }
//
//    public double getxCoordinate() {
//        return xCoordinate;
//    }
//
//    public double getyCoordinate() {
//        return yCoordinate;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof PointVertex)) return false;
//        PointVertex that = (PointVertex) o;
//        return Double.compare(that.xCoordinate, xCoordinate) == 0 && Double.compare(that.yCoordinate, yCoordinate) == 0;
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(xCoordinate, yCoordinate);
//    }
//}
