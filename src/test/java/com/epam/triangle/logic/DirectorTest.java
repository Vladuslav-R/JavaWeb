package com.epam.triangle.logic;

import com.epam.triangle.dao.DataException;
import com.epam.triangle.dao.DataReader;
import com.epam.triangle.entity.Point;
import com.epam.triangle.entity.Triangle;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;


public class DirectorTest {
    private static final String PATH = "test";
    private static final String VALID_LINE1 = "1.0 1.0 1.0 7.0 3.0 7.0";
    private static final String VALID_LINE2 = "1.0 1.0 1.0 7.0 1.0 1.0";
    private static final String INVALID_LINE = "1z.0 1.0 7.0 1.0 3.0 7.0";
    private static final Triangle VALID_TRIANGLE = new Triangle(new Point(1, 1),
            new Point(1, 7), new Point(3, 7));

    private static final Triangle INVALID_TRIANGLE = new Triangle(new Point(1, 1),
            new Point(1, 1), new Point(1, 1));
  

    @Test
    public void testReadShouldCreateWhenValid() throws DataException {
        //given
        DataReader reader = Mockito.mock(DataReader.class);
        LineValidator lineValidator = Mockito.mock(LineValidator.class);
        TriangleCreator creator = Mockito.mock(TriangleCreator.class);

        when(reader.read(PATH)).thenReturn(Arrays.asList(VALID_LINE1,VALID_LINE2, INVALID_LINE));
        when(creator.create(VALID_LINE1)).thenReturn(VALID_TRIANGLE);
        when(creator.create(VALID_LINE2)).thenReturn(null);
        when(lineValidator.isValidLine(VALID_LINE1)).thenReturn(true);
        when(lineValidator.isValidLine(VALID_LINE2)).thenReturn(true);
        when(lineValidator.isValidLine(INVALID_LINE)).thenReturn(false);

        Director director = new Director(reader, lineValidator, creator);

        //when
        List<Triangle> triangles = director.read(PATH);

        //then
        assertEquals(1, triangles.size());
        assertEquals(triangles.get(0), VALID_TRIANGLE);
    }
}
