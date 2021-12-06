package com.epam.triangle.logic;

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
        double cY = Double.parseDouble(splitLines[6]);
 int d = 1;

        return new Triangle(aX, aY, bX, bY, cX, cY);

    }


}