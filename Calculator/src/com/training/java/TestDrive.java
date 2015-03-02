package com.training.java;

import java.util.Scanner;
import java.util.regex.Pattern;

public class TestDrive {
    private static Scanner value = new Scanner(System.in);

    public static Object compute(Calculator calc, int operation) {
        switch (operation) {
            case 0:
                return calc.getNum1() + " * " + calc.getNum2() + " = " + calc.mult();
            case 1:
                return calc.getNum1() + " / " + calc.getNum2() + " = " + calc.div();
            case 2:
                return calc.getNum1() + " + " + calc.getNum2() + " = " + calc.addit();
            case 3:
                return calc.getNum1() + " - " + calc.getNum2() + " = " + calc.subt();
            default:
        }
        System.out.println("hi");
        throw new IllegalArgumentException();
    }

    public static int getOperation() {
        System.out.println("Choose the number to make operation");
        System.out.println("0 stands for multiplication");
        System.out.println("1 stands for division");
        System.out.println("2 stands for addition");
        System.out.println("3 stands for subtraction");
        String oper = value.next();
        if (!oper.equals("0") && !oper.equals("1") && !oper.equals("2") && !oper.equals("3")) {
            System.out.println("You have provided the wrong option. Repeat you input...");
            getOperation();
        }
        return Integer.parseInt(oper);
    }

    public static boolean isStringNumeric(String s) {
        try {
            Double.parseDouble(s.replaceAll(",", "."));
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }

    public static void main(String[] args) {
        String num1 = "";
        String num2 = "";
        while (!Pattern.matches("[\\d\\.,]+", num1) || !Pattern.matches("[\\d\\.,]+", num2)) {
            System.out.println("Provide the first int: ");
            num1 = value.next().replaceAll(",", ".");
            System.out.println("Provide the second int: ");
            num2 = value.next().replaceAll(",", ".");
        }
        Calculator calc;
        if (num1.contains(".") || num1.contains(",") || num2.contains(".") || num2.contains(",")) {
            calc = new CalculatorDouble(Double.parseDouble(num1), Double.parseDouble(num2));
        } else {
            calc = new CalculatorInt(Integer.parseInt(num1), Integer.parseInt(num2));
        }
        System.out.println("Result: " + compute(calc, getOperation()));
    }
}

