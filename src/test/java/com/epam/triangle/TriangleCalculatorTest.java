package com.epam.triangle;


import com.epam.triangle.entity.Triangle;

import com.epam.triangle.entity.Point;
import com.epam.triangle.logic.TriangleCalculator;
import org.junit.Assert;
import org.junit.Test;

public class TriangleCalculatorTest {

    private final TriangleCalculator calculator = new TriangleCalculator();

    @Test
    public void testCalculateareaOfATriangleShouldCalculateWhenTrianglesValid() {
        //given
        Triangle triangle = new Triangle(1, 1, 7, 1, 3, 7);
        //when
        double areaOfATriangle = calculator.areaOfATriangle(triangle);
        //then
        Assert.assertEquals(18.000000000000007, areaOfATriangle, 0.00000001);
    }
    @Test
    public void testCalculateperimeterOfATriangleShouldCalculateWhenTrianglesValid() {
        //given
        Triangle triangle = new Triangle(1, 1, 7, 1, 3, 7);
        //when
        double perimeter = calculator.perimeter(triangle);
        //then
        Assert.assertEquals(19.53565787126474, perimeter, 0.00000001);
    }
}



//    @Test
//    public void testCalculateVolumeShouldCalculateWhenBallIsValid() {
//        //given
//        Ball ball = new Ball(3, new Point(0, 0, 0));
//        //when
//        double volume = calculator.calculateVolume(ball);
//        //then
//        Assert.assertEquals(36.0 * Math.PI, volume, 0.0000000001);
//    }
//
//    @Test
//    public void testCalculateTheRatioOfVolumesDividedByCoordinatePlaneShouldCalculateWhenBallCrossesThePlane() {
//        //given
//        Ball ball = new Ball(3, new Point(2, 2, 2));
//        double expectedRatio = 0.2611029573;
//        //when
//        double actualRatio = calculator.calculateTheRatioOfVolumesDividedByCoordinatePlane(ball, CoordinatePlane.XY);
//        //then
//        Assert.assertEquals(expectedRatio, actualRatio, 0.00000001);
//    }
//
//    @Test
//    public void testCalculateTheRatioOfVolumesDividedByCoordinatePlaneShouldReturnZeroWhenBallDoesNotCrossThePlane() {
//        //given
//        Ball ball = new Ball(1, new Point(2, 2, 2));
//        //when
//        double ratio = calculator.calculateTheRatioOfVolumesDividedByCoordinatePlane(ball, CoordinatePlane.XY);
//        //then
//        Assert.assertEquals(0, ratio, 0.00000001);
//    }
//
//    @Test
//    public void testIsCrossingTheCoordinatePlaneShouldReturnTrueWhenBallIsCrossingThePlane() {
//        //given
//        Ball ball = new Ball(3, new Point(2, 2, 2));
//        //when
//        boolean isCrossingPlane = calculator.isCrossingTheCoordinatePlane(ball, CoordinatePlane.XY);
//        //then
//        Assert.assertTrue(isCrossingPlane);
//    }
//
//    @Test
//    public void testIsCrossingTheCoordinatePlaneShouldReturnFalseWhenBallIsNotCrossingThePlane() {
//        //given
//        Ball ball = new Ball(1, new Point(2, 2, 2));
//        //when
//        boolean isCrossingPlane = calculator.isCrossingTheCoordinatePlane(ball, CoordinatePlane.XY);
//        //then
//        Assert.assertFalse(isCrossingPlane);
//    }
//
//    @Test
//    public void testIsAValidBallShouldReturnTrueWhenBallIsValid() {
//        //given
//        Ball ball = new Ball(1, new Point(2, 2, 2));
//        //when
//        boolean isValid = calculator.isAValidBall(ball);
//        //then
//        Assert.assertTrue(isValid);
//    }
//
//    @Test
//    public void testIsAValidBallShouldReturnFalseWhenBallIsNotValid() {
//        //given
//        Ball ball = new Ball(-1, new Point(2, 2, 2));
//        //when
//        boolean isCrossingPlane = calculator.isAValidBall(ball);
//        //then
//        Assert.assertFalse(isCrossingPlane);
//    }
//}