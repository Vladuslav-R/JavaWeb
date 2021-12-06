package com.epam.calculator;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    public void testAddShouldAddWhenNumbersPositive() {


   Calculator calc = new Calculator();
        int firstArgument = 3;
        int secondArgument =2;
        //when
        int rezult = calc.add(firstArgument, secondArgument);

        assertEquals(rezult, firstArgument+secondArgument);
    }

    @Test
    public void testAddShouldAddWhenNumbersNegative() {


        Calculator calc = new Calculator();
        int firstArgument = -3;
        int secondArgument =- 2;
        //when
        int rezult = calc.add(firstArgument, secondArgument);
        assertEquals(-5, rezult);
        assertEquals(rezult, firstArgument+secondArgument);

    }



    @Test
    public void testSubtractionShouldSubtractWhenFirstNumbersPositive() {


        Calculator calc = new Calculator();
        int firstArgument = 3;
        int secondArgument =-2;
        //when
        int rezult = calc.subtraction(firstArgument, secondArgument);

        assertEquals(rezult, firstArgument-secondArgument);

    }


    @Test
    public void testSubtractionShouldSubtractWhenFirstNumberNegotive() {


        Calculator calc = new Calculator();
        int firstArgument = -3;
        int secondArgument =-2;
        //when
        int rezult = calc.subtraction(firstArgument, secondArgument);

        Assertions.assertEquals(rezult, firstArgument-secondArgument);

    }
    @Test
    public void testDivisionShouldDivideWhenNumberNotNull() {


        Calculator calc = new Calculator();
        int firstArgument = 10;
        int secondArgument =5;
        //when
        int rezult = calc.division(firstArgument, secondArgument);

        assertEquals(rezult, firstArgument/secondArgument);

    }


    @Test
    public void testMultiplication() {


        Calculator calc = new Calculator();
        int firstArgument = 10;
        int secondArgument =5;
        //when
        int rezult = calc.division(firstArgument, secondArgument);

        assertEquals(rezult, firstArgument/secondArgument);

    }

}