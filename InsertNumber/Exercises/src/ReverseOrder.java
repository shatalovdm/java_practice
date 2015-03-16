import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by Дмитрий Шаталов on 3/15/2015.
 */
public class ReverseOrder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] strs = scan.nextLine().split(" ");
        ArrayList ints = new ArrayList();
        for (String a : strs) {
            ints.add(Integer.parseInt(a));
        }
        Collections.reverse(ints);
        System.out.println(ints);
    }
}
