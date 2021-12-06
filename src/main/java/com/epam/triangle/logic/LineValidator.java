package com.epam.triangle.logic;

import java.util.regex.Pattern;

public class LineValidator {


        private static final String TRIANGLE_LINE_REGEX = "\\d+\\.\\d+( (-)?\\d+\\.\\d+){5}";

        public LineValidator() {
        }

        public boolean isValidLine(String line) {
                TriangleCalculator calculator = new TriangleCalculator();

            return Pattern.matches(TRIANGLE_LINE_REGEX, line);
        }

}
