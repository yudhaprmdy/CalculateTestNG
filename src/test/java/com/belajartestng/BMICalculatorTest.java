package com.belajartestng;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class BMICalculatorTest {

    BMICalculator bmiCalculator = new BMICalculator();
    @Test
    public void testCalculateBMI_NormalWeight() {
        double weight = 70;
        double height = 1.75;

        double expectedBMI = 22.86;
        double actualBMI = bmiCalculator.calculateBMI(weight, height);


        Assert.assertEquals(actualBMI, expectedBMI, 0.01);
    }

    @Test
    public void testBMICategory_NormalWeight() {
        double bmi = 22.86;
        String expectedCategory = "Berat badan normal (Normal)";
        String actualCategory = bmiCalculator.categoryBMI(bmi);

        Assert.assertEquals(actualCategory, expectedCategory);
    }

    @Test
    public void testCalculateBMI_Overweight() {
        double weight = 90;
        double height = 1.75;

        double expectedBMI = 29.39;
        double actualBMI = bmiCalculator.calculateBMI(weight, height);

        Assert.assertEquals(actualBMI, expectedBMI, 0.01);
    }

    @Test
    public void testBMICategory_Overweight() {
        double bmi = 29.39;
        String expectedCategory = "Kelebihan berat badan (Overweight)";
        String actualCategory = bmiCalculator.categoryBMI(bmi);

        Assert.assertEquals(actualCategory, expectedCategory);
    }

}