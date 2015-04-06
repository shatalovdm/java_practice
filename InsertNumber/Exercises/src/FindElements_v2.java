import java.util.ArrayList;
import java.util.Vector;
import java.util.Scanner;

/**
 * Created by Дмитрий Шаталов on 4/5/2015.
 */
public class FindElements_v2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Your list:");
        String raw = scan.nextLine();
        Vector<Integer> ints = new Vector<Integer>();
        for (String s : raw.split(" ")) {
            ints.add(Integer.valueOf(s));
        }
        int count = 0;
        for (int i = 1; i < ints.size() - 1; i++) {
            if (ints.get(i) > ints.get(i+1) && ints.get(i) > ints.get(i-1)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
