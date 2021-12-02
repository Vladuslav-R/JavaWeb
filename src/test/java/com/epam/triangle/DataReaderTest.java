package com.epam.triangle;

import com.epam.triangle.dao.DataException;
import com.epam.triangle.dao.DataReader;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class DataReaderTest {


        private final DataReader reader = new DataReader();

        @Test
        public void testReadShouldReadStringsWhenFileHasOneString() throws DataException {
            //given
            List<String> expectedLines = Arrays.asList("1.0 1.0 7.0 1.0 3.0 7.0");
            //when
            List<String> actualLines = reader.read("G:\\Java\\JavaWeb\\src\\test\\java\\com\\epam\\triangle\\triangle.txt");
            //then
            Assert.assertEquals(expectedLines, actualLines);
        }

        @Test
        public void testReadShouldReadStringsWhenFileHasMultipleStrings() throws DataException {
            //given
            List<String> expectedLines = Arrays.asList("1.0 1.0 7.0 1.0 3.0 7.0", "line", "123456");
            //when
            List<String> actualLines = reader.read("G:\\Java\\JavaWeb\\src\\test\\java\\com\\epam\\triangle\\triangle.txt");
            //then
            Assert.assertEquals(expectedLines, actualLines);
        }

        @Test(expected = DataException.class)
        public void testReadShouldThrowDataExceptionWhenFileNotFound() throws DataException {
            //given
            //when
            List<String> result = reader.read("nonExistentFile");
        }
    }

