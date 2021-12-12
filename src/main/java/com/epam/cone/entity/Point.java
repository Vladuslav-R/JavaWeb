//package com.epam.cone.entity;
//
//import java.util.Objects;
//
//public class Point {
//
//
//    private final double xCoordinate;
//    private final double yCoordinate;
//
////    public Point() {
////        xCoordinate = 0;
////        yCoordinate = 0;
////    }
//
//    public Point(double xCoordinate, double yCoordinate) {
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
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof Point)) return false;
//        Point that = (Point) o;
//        return Double.compare(that.getxCoordinate(), getxCoordinate()) == 0 && Double.compare(that.getyCoordinate(), getyCoordinate()) == 0;
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(getxCoordinate(), getyCoordinate());
//    }
//}
//
//
