package com.epam.calculator;

import com.epam.utils.EnterValue;
import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void testAddShouldAddWhenNumbersPositive() {


   Calculator calc = new Calculator();
        int firstArgument = 3;
        int secondArgument =2;
        //when
        int rezult = calc.add(firstArgument, secondArgument);

        Assert.assertEquals(rezult, firstArgument+secondArgument);

    }
    @Test
    public void testAddShouldAddWhenNumbersNegative() {


        Calculator calc = new Calculator();
        int firstArgument = -3;
        int secondArgument =- 2;
        //when
        int rezult = calc.add(firstArgument, secondArgument);
        Assert.assertEquals(-5, rezult);
        Assert.assertEquals(rezult, firstArgument+secondArgument);

    }



    @Test
    public void testSubtractionShouldSubtractWhenFirstNumbersPositive() {


        Calculator calc = new Calculator();
        int firstArgument = 3;
        int secondArgument =-2;
        //when
        int rezult = calc.subtraction(firstArgument, secondArgument);

        Assert.assertEquals(rezult, firstArgument-secondArgument);

    }


    @Test
    public void testSubtractionShouldSubtractWhenFirstNumberNegotive() {


        Calculator calc = new Calculator();
        int firstArgument = -3;
        int secondArgument =-2;
        //when
        int rezult = calc.subtraction(firstArgument, secondArgument);

        Assert.assertEquals(rezult, firstArgument-secondArgument);

    }
    @Test
    public void testDivisionShouldDivideWhenNumberNotNull() {


        Calculator calc = new Calculator();
        int firstArgument = 10;
        int secondArgument =5;
        //when
        int rezult = calc.division(firstArgument, secondArgument);

        Assert.assertEquals(rezult, firstArgument/secondArgument);

    }

}

    @Test
    public void testMultiplication() {


        Calculator calc = new Calculator();
        int firstArgument = 10;
        int secondArgument =5;
        //when
        int rezult = calc.division(firstArgument, secondArgument);

        Assert.assertEquals(rezult, firstArgument/secondArgument);

    }

}