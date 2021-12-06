package com.epam.triangle.logic;

import com.epam.triangle.logic.LineValidator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class LineValidatorTest {

        private static final String VALID_LINE = "1.0 1.0 7.0 1.0 3.0 7.0";
        private static final String INVALID_LINE = "1.z0 1.0 7.0 1.0 3.0 7.0";

        private final LineValidator validator = new LineValidator();

        @Test
        public void testIsValidLineShouldReturnTrueWhenTheLineIsValid() {
            //given
            //when
            boolean statement = validator.isValidLine(VALID_LINE);
            //then
            Assertions.assertTrue(statement);
        }

        @Test
        public void testIsValidLineShouldReturnTrueWhenTheLineIsInvalid() {
            //given
            //when
            boolean statement = validator.isValidLine(INVALID_LINE);
            //then
            Assertions.assertFalse(statement);
        }
    }










