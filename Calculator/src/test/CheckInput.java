package test;

import java.util.Scanner;

/**
 * Created by Дмитрий Шаталов on 2/15/2015.
 */
public class CheckInput {
    public static void main(String[] args) {
        //Scanner value = new Scanner(System.in);
        //String input = value.next();
        //System.out.println(input + " is " + new CheckInput().isDouble(input));
        int a = 15;
        System.out.println(a);
        System.out.println((double)a);
    }

    public boolean isDouble(String s) {
        return s.contains(".") || s.contains(",");
    }
}
