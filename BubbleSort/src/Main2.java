import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Дмитрий Шаталов on 3/15/2015.
 */
public class Main2 {
    public static void main(String[] args) {
        ArrayList sortList = new ArrayList<Integer>();
        //ArrayList sortList1 = new ArrayList(10);
        //ArrayList sortList2 = new ArrayList(sortList1);
        System.out.println("Provide integers:");
        Scanner scan = new Scanner(System.in);
/*        do {
            e = scan.nextLine();
            sortList.add(Integer.valueOf(e));
        } while (!e.isEmpty());*/
        String e = scan.nextLine();
        while (!e.isEmpty()) {
            sortList.add(Integer.valueOf(e));
            e = scan.nextLine();
        }
        for (int m = 0; m < sortList.size() - 1; m++) {
            for (int k = 0; k < sortList.size() - 1; k++) {
                if (Integer.valueOf(sortList.get(k).toString()) < Integer.valueOf(sortList.get(k+1).toString())) {
                    Object swap = sortList.get(k + 1);
                    sortList.set(k + 1, sortList.get(k));
                    sortList.set(k, swap);
                }
            }
        }
        System.out.println("Sorted list: " + sortList);
    }
}
