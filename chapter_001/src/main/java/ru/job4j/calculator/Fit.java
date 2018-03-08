package ru.job4j.calculator;

public class Fit {
    public static double VALUE_MAN = 100;
    public static double VALUE_WOMAN = 110;
    public static double CONST = 1.15;
    double manWeight(double height) {
        double weight = (height -VALUE_MAN) * CONST;
        return weight;
    }
    double womanWeight(double height) {
        double weight = (height -VALUE_WOMAN) * CONST;
        return weight;
    }
}
