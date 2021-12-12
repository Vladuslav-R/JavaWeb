package com.epam.triangle.logic;

import com.epam.triangle.entity.Point;
import com.epam.triangle.entity.Triangle;

import java.util.logging.Logger;

public class TriangleCreator {
    public static final Logger LOGGER = Logger.getLogger(TriangleCreator.class.getName());
    TriangleValidator validator = new TriangleValidator();

    private static final String DELIMITER = " ";


    public Triangle create(String line) {
        String[] splitLines = line.split(DELIMITER);

        Point a = new Point(Double.parseDouble(splitLines[0]), Double.parseDouble(splitLines[1]));
        Point b = new Point(Double.parseDouble(splitLines[2]), Double.parseDouble(splitLines[3]));
        Point c = new Point(Double.parseDouble(splitLines[3]), Double.parseDouble(splitLines[4]));
        LOGGER.info("Triangle created");
        return validator.isATriangleExist(a, b, c) ? new Triangle(a, b, c) : null;
    }


}