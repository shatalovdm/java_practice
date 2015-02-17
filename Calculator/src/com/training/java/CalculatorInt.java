package com.training.java;

public class CalculatorInt extends Calculator{
    private int a;
    private int b;
//    public int getA() {
//        return a;
//    }
//    public int getB() {
//        return b;
//    }
//    public void setA(int d) {
//        a = d;
//    }
//    public void setB(int c) {
//        b = c;
//    }
    public CalculatorInt (int a, int b) {
        this.a = a;
        this.b = b;
    }
    @Override
    public Object mult(){
        return a * b;
    }
    public Object div(){
        return a / b;
    }
    public Object addit(){
        return a + b;
    }
    public Object subt(){
        return a - b;
    }
}
