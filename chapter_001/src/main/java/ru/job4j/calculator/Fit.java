package ru.job4j.calculator;

public class Fit {
    public static double ValueMan = 100;
    public static double ValueWoman = 110;
    public static double Const = 1.15;
    double manWeight(double height) {
        double weight = (height -ValueMan) * Const;
        return weight;
    }
    double womanWeight(double height) {
        double weight = (height -ValueWoman) * Const;
        return weight;
    }
}
