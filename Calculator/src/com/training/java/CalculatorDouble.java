package com.training.java;

/**
 * Created by Дмитрий Шаталов on 2/13/2015.
 */
public class CalculatorDouble extends Calculator {
    private double c;
    private double d;

    public CalculatorDouble(double c, double d) {
        this.c = c;
        this.d = d;
    }

    @Override
    public Object mult() {
        return c * d;
    }

    public static double div(double c, double d){
        return c / d;
    }
    public static double addit2(double c, double d){
        return c + d;
    }

    public static double subt2(double c, double d){
        return c - d;
    }
}
