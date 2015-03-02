package com.training.java;

/**
 * Created by Дмитрий Шаталов on 2/13/2015.
 */
public class CalculatorDouble extends Calculator {
    private double num1;
    private double num2;


    public Object getNum1() {
        return num1;
    }
    public Object getNum2() {
        return num2;
    }
//    public void setC(double k) {
//        num1 = k;
//    }
//    public void setD(double l) {
//        num2 = l;
//    }
    public CalculatorDouble(double c, double d) {
        this.num1 = c;
        this.num2 = d;
    }

    //public CalculatorDouble newDouble = new CalculatorDouble(c, d);
    @Override
    public Object mult() {
        return num1 * num2;
    }
    public Object div(){
        return num1 / num2;
    }
    public Object addit(){
        return num1 + num2;
    }
    public Object subt(){
        return num1 - num2;
    }
}
