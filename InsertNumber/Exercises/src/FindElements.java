import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Дмитрий Шаталов on 3/15/2015.
 */
public class FindElements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int b;
        do {
            System.out.println("Provide the number of ints:");
            b = scan.nextInt();
        }
        while (!((b >= 1) && (b <= 100)));
        System.out.println("Your list:");
        String[] strs = scan.nextLine().split(" ");
        ArrayList ints = new ArrayList<Integer>();
        for (String a : strs) {
            ints.add(Integer.parseInt(a));
        }
        int count = 0;
        for (int i = 1; i < b - 1; i++) {
            if (Integer.parseInt(ints.get(i).toString()) > Integer.parseInt((ints.get(i + 1).toString())) && Integer.parseInt(ints.get(i).toString()) < Integer.parseInt(ints.get(i - 1).toString())) {
                count++;
            }
        }
        System.out.println(count);
    }
}

