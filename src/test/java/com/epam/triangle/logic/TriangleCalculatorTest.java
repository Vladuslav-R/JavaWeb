package com.epam.triangle.logic;


import com.epam.triangle.entity.Point;
import com.epam.triangle.entity.Triangle;
import com.epam.triangle.logic.TriangleCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TriangleCalculatorTest {

    private final TriangleCalculator calculator = new TriangleCalculator();

    @org.junit.jupiter.api.Test
    public void testCalculateareaOfATriangleShouldCalculateWhenTrianglesValid() {
        //given
        Triangle triangle = new Triangle(new Point(1, 1), new Point(1, 7), new Point(3, 7));
        //when
        double areaOfATriangle = calculator.areaOfATriangle(new Point(1, 1), new Point(1, 7), new Point(3, 7));
        //then
        Assertions.assertEquals(6.000000000000003, areaOfATriangle, 0.00000001);
    }

    @Test
    public void testCalculateperimeterOfATriangleShouldCalculateWhenTrianglesValid() {
        //given
        Triangle triangle = new Triangle(new Point(1, 1), new Point(1, 7), new Point(3, 7));
        //when
        double perimeter = calculator.perimeter(new Point(1, 1), new Point(1,7), new Point(3, 7));
                Assertions.assertEquals(14.32455532033676, perimeter, 0.00000001);
        //then
    }
}

