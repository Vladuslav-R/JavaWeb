package com.epam.triangle;

import com.epam.triangle.logic.LineValidator;
import org.junit.Assert;
import org.junit.Test;




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
            Assert.assertTrue(statement);
        }

        @Test
        public void testIsValidLineShouldReturnTrueWhenTheLineIsInvalid() {
            //given
            //when
            boolean statement = validator.isValidLine(INVALID_LINE);
            //then
            Assert.assertFalse(statement);
        }
    }










