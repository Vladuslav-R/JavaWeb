package com.epam.triangle.logic;

import com.epam.triangle.entity.Point;
import com.epam.triangle.entity.Triangle;

public class TriangleCreator {
    TriangleValidator validator = new TriangleValidator();

    private static final String DELIMITER = " ";


    public Triangle create(String line) {
        String[] splitLines = line.split(DELIMITER);

        double aX = Double.parseDouble(splitLines[0]);
        double aY = Double.parseDouble(splitLines[1]);
        double bX = Double.parseDouble(splitLines[2]);
        double bY = Double.parseDouble(splitLines[4]);
        double cX = Double.parseDouble(splitLines[5]);

        Point a = new Point(Double.parseDouble(splitLines[0]),Double.parseDouble(splitLines[1]));
        Point b = new Point(Double.parseDouble(splitLines[2]),Double.parseDouble(splitLines[3]));
        Point c = new Point(Double.parseDouble(splitLines[3]),Double.parseDouble(splitLines[4]));
     if (validator.isATriangleExist(a,b,c) ) {
         return ;
     }

    }


}