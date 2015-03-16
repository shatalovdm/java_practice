import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Дмитрий Шаталов on 3/15/2015.
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many elements you want:");
        int n = scan.nextInt();
        int sortList[] = new int[n];
        System.out.println("Provide " + n + " integers:");
        for (int i = 0; i < sortList.length; i++) {
            sortList[i] = scan.nextInt();
        }
        for (int m = 0; m < sortList.length - 1; m++) {
            for (int k = 0; k < sortList.length - 1; k++) {
                if (sortList[k] < sortList[k + 1]) {
                    int swap = sortList[k + 1];
                    sortList[k + 1] = sortList[k];
                    sortList[k] = swap;
                }
            }
        }
        System.out.println("Sorted list: " + Arrays.toString(sortList));
    }
}
