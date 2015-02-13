package com.training.java;

import java.util.ArrayList;
import java.util.Scanner;

public class Calculator1TestDrive {

    public static int compute(Calculator calc) {
        Scanner value = new Scanner(System.in);
        int oper = -1;
        ArrayList myList = new ArrayList();
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
                myList.add(num1);
                System.out.println("Provide the second int: ");
                String num2 = value.next();
                myList.add(num2);
                if (myList.contains(Integer.parseInt(num1)) && myList.contains(Integer.parseInt(num2))) {
                    switch (oper) {
                        case 0:
                            return calc.mult(Integer.parseInt(num1), Integer.parseInt(num2));
                        case 1:
                            return calc.div(Integer.parseInt(num1), Integer.parseInt(num2));
                        case 2:
                            return calc.addit(Integer.parseInt(num1), Integer.parseInt(num2));
                        case 3:
                            return calc.subt(Integer.parseInt(num1), Integer.parseInt(num2));
                    }
                }
                else if (myList.contains(Double.parseDouble(num1)) || myList.contains(Double.parseDouble(num2))) {
                    switch (oper) {
                        case 0:
                            return calc.mult(Double.parseDouble(num1), Double.parseDouble(num2));
                        case 1:
                            return calc.div(Double.parseDouble(num1), Double.parseDouble(num2));
                        case 2:
                            return calc.addit(Double.parseDouble(num1), Double.parseDouble(num2));
                        case 3:
                            return calc.subt(Double.parseDouble(num1), Double.parseDouble(num2));
                    }
                }
                else {
                    throw new NumberFormatException();
                }
            }
            else {
                System.out.println("You have provided the wrong option");
            }
        }
//        return result;
        throw new IllegalArgumentException();
    }

    public static void main(String[] args) {
        Calculator number = new Calculator();
//        new Calculator1TestDrive().compute(number);
        System.out.println("Result:" + compute(number));

    }
}

