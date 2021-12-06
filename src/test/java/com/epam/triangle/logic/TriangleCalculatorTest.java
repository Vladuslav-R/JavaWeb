package com.epam.triangle.logic;


import com.epam.triangle.entity.Triangle;
import com.epam.triangle.logic.TriangleCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TriangleCalculatorTest {

    private final TriangleCalculator calculator = new TriangleCalculator();

    @org.junit.jupiter.api.Test
    public void testCalculateareaOfATriangleShouldCalculateWhenTrianglesValid() {
        //given
        Triangle triangle = new Triangle(1, 1, 7, 1, 3, 7);
        //when
        double areaOfATriangle = calculator.areaOfATriangle(triangle);
        //then
        Assertions.assertEquals(18.000000000000007, areaOfATriangle, 0.00000001);
    }

    @Test
    public void testCalculateperimeterOfATriangleShouldCalculateWhenTrianglesValid() {
        //given
        Triangle triangle = new Triangle(1, 1, 7, 1, 3, 7);
        //when
        double perimeter = calculator.perimeter(triangle);
        //then
        Assertions.assertEquals(19.53565787126474, perimeter, 0.00000001);
    }
}

