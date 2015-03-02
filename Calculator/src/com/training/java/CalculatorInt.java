package com.training.java;


public class CalculatorInt extends Calculator{
    private int num1;
    private int num2;

    public Object getNum1() {
        return num1;
    }
    public Object getNum2() {
        return num2;
    }
//    public void setA(int d) {
//        num1 = d;
//    }
//    public void setB(int c) {
//        num2 = c;
//    }
    public CalculatorInt (int a, int b) {
        this.num1 = a;
        this.num2 = b;
    }
    @Override
    public Object mult(){
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
