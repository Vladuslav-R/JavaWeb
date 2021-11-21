package com.epam.calculator;

import com.epam.utils.EnterValue;
import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void testAddShouldAddWhenNumbersPositive() {


//given
        Calculator calc = new Calculator();
        int firstArgument = 1;
        int secondArgument =2;
        //when
        int rezult = calc.add(firstArgument, secondArgument);


//then
        Assert.assertEquals(3, rezult);



    }


}











//
//
//
//    //given
//    Calculator calc = new Calculator();
//    int firstArgument = EnterValue.enterInt("Enter number");
//    int secondArgument = EnterValue.enterInt("Enter number");
//    //when
//    int rezult = calc.add(firstArgument, secondArgument);
//
//
////then
//        Assert.assertEquals(EnterValue.enterInt("Enter expected number"), rezult);
//
//
//
//
//
//
//
//
//
//
//
//
//
//
