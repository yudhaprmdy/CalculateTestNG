package com.belajartestng;

public class BMICalculator {
    public static double calculateBMI(double weight, double height) {
        return weight / (height * height);
    }

    public static String categoryBMI(double bmi) {
        if (bmi < 18.5) {
            return "Kekurangan berat badan (Underweight)";
        } else if (bmi < 25) {
            return "Berat badan normal (Normal)";
        } else if (bmi < 30) {
            return "Kelebihan berat badan (Overweight)";
        } else {
            return "Obesitas (Obese)";
        }
    }
}
