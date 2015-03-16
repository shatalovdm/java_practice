import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by Дмитрий Шаталов on 3/15/2015.
 */
public class ChangeMinMax {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] strs = scan.nextLine().split(" ");
        ArrayList ints = new ArrayList<Integer>();
        for (String a : strs) {
            ints.add(Integer.parseInt(a));
        }
        int imax = ints.indexOf(Collections.max(ints));
        int imin = ints.indexOf(Collections.min(ints));
        Object swap = ints.get(imax);
        ints.set(imax, ints.get(imin));
        ints.set(imin, swap);
        System.out.println(ints);
    }
}
