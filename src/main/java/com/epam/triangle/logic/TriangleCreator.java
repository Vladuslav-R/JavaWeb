package com.epam.triangle.logic;

import com.epam.triangle.entity.Triangle;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class TriangleCreator {
    private static final String DELIMITER = " ";

    public Triangle create(String line) {
        String[] splitLines = line.split(DELIMITER);

        double ax = Double.parseDouble(splitLines[0]);
        double ay = Double.parseDouble(splitLines[1]);
        double bx = Double.parseDouble(splitLines[2]);
        double by = Double.parseDouble(splitLines[3]);
        double cx = Double.parseDouble(splitLines[2]);
        double cy = Double.parseDouble(splitLines[3]);


        return new

                Triangle(ax, ay, bx, by, cx, cy);
    }
}