package com.epam.triangle.logic;

import com.epam.triangle.dao.DataException;
import com.epam.triangle.dao.DataReader;
import com.epam.triangle.entity.Triangle;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;


public class DirectorTest {
    private static final String PATH = "test";
    private static final String VALID_LINE1 = "1.0 1.0 7.0 1.0 3.0 7.0";
    private static final String VALID_LINE2 = "2.0 1.0 7.0 2.0 3.0 7.0";
    private static final String INVALID_LINE = "1z.0 1.0 7.0 1.0 3.0 7.0";
    private static final Triangle VALID_TRIANGLE = new Triangle(1, 1, 7, 1, 3, 7);
    private static final Triangle INVALID_TRIANGLE = new Triangle(2, 1, 7, 1, 1, 1);

    @Test
    public void testReadShouldCreateWhenValid() throws DataException {
        //given
        DataReader reader = Mockito.mock(DataReader.class);
        LineValidator lineValidator = Mockito.mock(LineValidator.class);
        TriangleCreator creator = Mockito.mock(TriangleCreator.class);
        TriangleValidator triangleValidator = Mockito.mock(TriangleValidator.class);

        when(reader.read(PATH)).thenReturn(Arrays.asList(VALID_LINE1,VALID_LINE2, INVALID_LINE));
        when(creator.create(VALID_LINE1)).thenReturn(VALID_TRIANGLE);
        when(creator.create(VALID_LINE2)).thenReturn(INVALID_TRIANGLE);
        when(lineValidator.isValidLine(VALID_LINE1)).thenReturn(true);
        when(lineValidator.isValidLine(VALID_LINE2)).thenReturn(true);
        when(lineValidator.isValidLine(INVALID_LINE)).thenReturn(false);
        when(triangleValidator.isATriangleExist(VALID_TRIANGLE)).thenReturn(true);
        when(triangleValidator.isATriangleExist(INVALID_TRIANGLE)).thenReturn(false);

        Director director = new Director(reader, lineValidator, creator);

        //when
        List<Triangle> triangles = director.read(PATH);

        //then
        assertEquals(1, triangles.size());
        assertEquals(triangles.get(0), VALID_TRIANGLE);
    }
}
//given
//        List<String> actualLines = Arrays.asList(VALID_LINE1, VALID_LINE2);
//        DataReader reader = Mockito.mock(DataReader.class);
//        Mockito.when(reader.read(TEST_PATH)).thenReturn(actualLines);
//        LineValidator validator = Mockito.mock(LineValidator .class);
//        Mockito.when(validator.isValidLine(VALID_LINE1)).thenReturn(true);
//        Mockito.when(validator.isValidLine(VALID_LINE2)).thenReturn(true);
//        TriangleCreator creator = Mockito.mock(TriangleCreator.class);
//        Mockito.when(creator.create(VALID_LINE1)).thenReturn(VALID_TRIANGLE1);
//        Mockito.when(creator.create(VALID_LINE2)).thenReturn(VALID_TRIANGLE2);
//        Director director = new Director(reader, validator, creator);
//        List<Triangle> expectedTriangles = Arrays.asList(VALID_TRIANGLE1, VALID_TRIANGLE2);
//        //when
//        List<Triangle> actualBalls = director.read(TEST_PATH);
//        //then
//        assertEquals(expectedTriangles, actualBalls);
//    }
//
//    @Test
//    public void testReadShouldReadLinesWhenSomeLinesAreInvalid() throws DataException {
//        //given
//        List<String> actualLines = Arrays.asList(VALID_LINE1, INVALID_LINE, VALID_LINE2);
//        DataReader reader = Mockito.mock(DataReader.class);
//        Mockito.when(reader.read(TEST_PATH)).thenReturn(actualLines);
//        LineValidator  validator = Mockito.mock(LineValidator .class);
//        Mockito.when(validator.isValidLine(VALID_LINE1)).thenReturn(true);
//        Mockito.when(validator.isValidLine(INVALID_LINE)).thenReturn(false);
//        Mockito.when(validator.isValidLine(VALID_LINE2)).thenReturn(true);
//        TriangleCreator creator = Mockito.mock(TriangleCreator.class);
//        Mockito.when(creator.create(VALID_LINE1)).thenReturn(VALID_TRIANGLE1);
//        Mockito.when(creator.create(VALID_LINE2)).thenReturn(VALID_TRIANGLE2);
//        Director director = new Director(reader, validator, creator);
//        List<Triangle> expectedTriangles = Arrays.asList(VALID_TRIANGLE1, VALID_TRIANGLE2);
//        //when
//        List<Triangle> readTriangles = director.read(TEST_PATH);
//        //then
//        assertEquals(expectedTriangles, readTriangles);
//    }
//}