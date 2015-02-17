package com.training.java;

/**
 * Created by Дмитрий Шаталов on 2/13/2015.
 */
public class CalculatorDouble extends Calculator {
    private double c;
    private double d;
//    public double getC() {
//        return c;
//    }
//    public double getD() {
//        return d;
//    }
//    public void setC(double k) {
//        c = k;
//    }
//    public void setD(double l) {
//        d = l;
//    }
    public CalculatorDouble(double c, double d) {
        this.c = c;
        this.d = d;
    }



    @Override
    public Object mult() {
        return c * d;
    }
    public Object div(){
        return c / d;
    }
    public Object addit(){
        return c + d;
    }
    public Object subt(){
        return c - d;
    }
}
