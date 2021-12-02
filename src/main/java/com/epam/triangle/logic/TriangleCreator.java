package com.epam.triangle.logic;

import com.epam.triangle.entity.Triangle;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class TriangleCreator {
    private static final String DELIMITER = " ";

    public Triangle create(String line) {
        String[] splitLines = line.split(DELIMITER);

        double aX = Double.parseDouble(splitLines[0]);
        double aY = Double.parseDouble(splitLines[1]);
        double bX = Double.parseDouble(splitLines[2]);
        double bY = Double.parseDouble(splitLines[4]);
        double cX = Double.parseDouble(splitLines[5]);
        double cY = Double.parseDouble(splitLines[6]);


        return new Triangle(aX, aY, bX, bY, cX, cY);
    }
}