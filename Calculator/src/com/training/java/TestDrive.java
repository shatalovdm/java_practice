package com.training.java;

import java.util.Scanner;

public class TestDrive {
    public static Object compute(Calculator calc) {
        Scanner value = new Scanner(System.in);
        int oper = -1;
        while (oper != 0 || oper != 1 || oper != 2 || oper != 3) {
            System.out.println("Choose the number to make operation");
            System.out.println("0 stands for multiplication");
            System.out.println("1 stands for division");
            System.out.println("2 stands for addition");
            System.out.println("3 stands for subtraction");
            oper = value.nextInt();
            if (oper == 0 || oper == 1 || oper == 2 || oper == 3) {
                System.out.println("Provide the first int: ");
                String num1 = value.next();
                System.out.println("Provide the second int: ");
                String num2 = value.next();
                if (num1.contains(".") || num1.contains(",") && num2.contains(".") || num2.contains(",")) {
                    switch (oper) {
                        case 0:
                            return calc.mult();
                        case 1:
                            return calc.div();
                        case 2:
                            return calc.addit();
                        case 3:
                            return calc.subt();
                    }
                }
                else {
                    switch (oper) {
                        case 0:
                            return calc.mult();
                        case 1:
                            return calc.div();
                        case 2:
                            return calc.addit();
                        case 3:
                            return calc.subt();
                    }
                }
            }
            else {
              System.out.println("You have provided the wrong option");
            }
        }
        throw new IllegalArgumentException();
    }

    public static void main(String[] args) {
    CalculatorInt newInt = new CalculatorInt();
    CalculatorDouble newDouble = new CalculatorDouble();
        System.out.println("Result:" + compute(newInt));
        System.out.println("Result:" + compute(newDouble));

    }
}

