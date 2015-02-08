package com.training.java;

import java.util.Scanner;

public class Calculator1TestDrive {

    public static int compute(Calculator1 calc) {
        Scanner value = new Scanner(System.in);
        int oper = -1;
//        int result = 0;
        while (oper != 0 || oper != 1 || oper != 2 || oper != 3) {
            System.out.println("Choose the number to make operation");
            System.out.println("0 stands for multiplication");
            System.out.println("1 stands for division");
            System.out.println("2 stands for addition");
            System.out.println("3 stands for subtraction");
            oper = value.nextInt();
            System.out.println("Provide the first int: ");
            int num1 = value.nextInt();
            System.out.println("Provide the second int: ");
            int num2 = value.nextInt();
            switch (oper) {
                case 0:
                    return calc.mult(num1, num2);
                case 1:
                    return calc.div(num1, num2);
                case 2:
                    return calc.addit(num1, num2);
                case 3:
                    return calc.subt(num1, num2);
                default:
                    System.out.println("You have provided the wrong option");
                    break;
            }
        }
//        return result;
        throw new IllegalArgumentException();
    }

    public static void main(String[] args) {
        Calculator1 number = new Calculator1();
//        new Calculator1TestDrive().compute(number);
        System.out.println("Result:" + compute(number));

    }
}

