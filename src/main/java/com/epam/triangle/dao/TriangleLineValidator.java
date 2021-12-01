package com.epam.triangle.dao;

import java.util.regex.Pattern;

public class TriangleLineValidator {


    private static final String TRIANGLE_LINE_REGEX = "\\d+\\.\\d+( (-)?\\d+\\.\\d+){3}";

    public TriangleLineValidator() {
    }

    public boolean isValidLine(String line) {
        return Pattern.matches(TRIANGLE_LINE_REGEX, line);
    }
}

