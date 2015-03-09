import java.util.Arrays;

import static java.util.Arrays.sort;

/**
 * Created by Дмитрий Шаталов on 3/8/2015.
 */
public class Main {
    public static void main(String... arguments) {
        int[] array = {4, 6, 3};
        char chars[] = new char[] {'a', 'd', 'c'};
        byte a = 4;
        byte b = 5;
        byte c = (byte)(a + b);
        System.out.println(c);
        int d = a + b;
        System.out.println(d);

/*        Arrays.sort(array);
        System.out.println(array.getClass());
        System.out.println(Arrays.asList(array).getClass());
        for (int i : array) {
            System.out.println(i);
        }*/

/*        for (char c : chars) {
            if (c == chars[chars.length-1]) {
                System.out.println(c);
            } else {
                System.out.print(c + ", ");
            }
        }

        for (Character c : chars) {
            if (c.equals(chars[0])) {
                System.out.println(c);
                break; // continue;
            }
            System.out.print(c + ", ");
        }

        long[] d = new long[20];
        for (int i = 0; i < 20; i++) {
            d[i] = i + 1;
        }
        System.out.println("value of 20th " + d[19]); // 20
        System.out.println("length of array " + d.length); // 20
        try {
            System.out.println(d[20]); // java.lang.ArrayIndexOutOfBoundsException: 20
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("error " + e);
        }
*/

    }
}

/*
byte - 8b
short
int
long - 64bit

float
double

boolean (true, false)
char

byte b = 4;
System.out.println((int)b);
int n = 128;
System.out.println((byte)n);
 */

/*
time - время выполнения метода/программы
memory - кол-во используемой памяти при работе
 */