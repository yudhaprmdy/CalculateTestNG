package com.belajartestng;

import com.belajartestng.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest {
    @Test
    public void pertambahanTest() {
        int actualResult = Calculator.add(10,20);
        int expectedResult = 30;

        Assert.assertEquals(actualResult, expectedResult);

    }

    @Test
    public void penguranganTest() {
        int actualResult = Calculator.subsract(10,5);
        int expectedResult = 5;

        Assert.assertEquals(actualResult, expectedResult);

    }

    @Test
    public void perkalianTest(){
        int actualReesult = Calculator.perkalian(10, 10);
        int expectedResult = 100;

        Assert.assertEquals(actualReesult,expectedResult);
    }

    @Test
    public void modulusTest(){
        int actualResult = Calculator.modulus(7, 3);
        int expectedResult = 1;

        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void pemabgianTest(){
        int actualResult = Calculator.pembagian(100, 20);
        int expectedResult = 5;

        Assert.assertEquals(actualResult,expectedResult);
    }
}
