import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Дмитрий Шаталов on 7/19/2015.
 */
public class Polindrom {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*if (isPolindrom(in.nextLine())) {
            System.out.println("It is a polindrom");
        } else {
            System.out.println("It is not a polindrom");
        }*/

        System.out.println(isPolindrom_v2(in.nextLine()) ? "It is a polindrom" : "It is not a polindrom");
    }

    public static boolean isPolindrom(String str) {
        str = str.toLowerCase();
        for (int i = 0; i < str.length() / 2; i++) {
            // System.out.println(str.charAt(i) + ":" + str.charAt(str.length() - i - 1));
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPolindrom_v2(String str) {
        str = str.toLowerCase();
        String part1 = str.substring(0, str.length() / 2);
        String part2 = str.substring((str.length() + 1)/ 2);
        part2 = new StringBuilder(part2).reverse().toString();
        return part1.equals(part2);
    }
}