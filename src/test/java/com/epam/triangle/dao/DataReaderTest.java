package com.epam.triangle.dao;


import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DataReaderTest {


        private final DataReader reader = new DataReader();

        @Test
        public void testReadShouldReadStringsWhenFileHasOneString() throws DataException {
            //given
            List<String> expectedLines = Arrays.asList("1.0 1.0 7.0 1.0 3.0 7.0");
            //when
            List<String> actualLines = reader.read("src\\main\\resources\\triangleOneLine.txt");
           // List<String> actualLines = reader.read("src\\test\\java\\com\\epam\\triangle\\triangleOneLine.txt");
            //then
            assertEquals(expectedLines, actualLines);
        }

        @Test
        public void testReadShouldReadStringsWhenFileHasMultipleStrings() throws DataException {
            //given
            List<String> expectedLines = Arrays.asList("1.z0 1.0 7.0 1.0 3.0 7.0");
            //when
            List<String> actualLines = reader.read("src\\main\\resources\\triangle.txt");
            //then
            assertEquals(expectedLines, actualLines);
        }

        @Test
        @Disabled
        public void testReadShouldThrowDataExceptionWhenFileNotFound() throws DataException {
            //given
            //when
            List<String> result = reader.read("nonExistentFile");
        }
    }

