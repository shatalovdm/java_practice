import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Дмитрий Шаталов on 3/15/2015.
 */
public class InsertElement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] strs1 = scan.nextLine().split(" ");
        String[] strs2 = scan.nextLine().split(" ");
        ArrayList ints1 = new ArrayList<Integer>();
        ArrayList ints2 = new ArrayList<Integer>();
        for (String a : strs1) {
            ints1.add(Integer.parseInt(a));
        }
        for (String a : strs2) {
            ints2.add(Integer.parseInt(a));
        }
        ints1.add(ints1.size(), 0); //Добавляем дополнительное значение для переноса последнего значения из списка на его место
        for (int i = ints1.size() - 2; i >= Integer.parseInt(ints2.get(0).toString()); i--) {
            ints1.set(i + 1, ints1.get(i));
        }
        ints1.set(Integer.parseInt(ints2.get(0).toString()), ints2.get(1));
        System.out.println(ints1);
    }
}

