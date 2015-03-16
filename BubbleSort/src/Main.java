import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Дмитрий Шаталов on 3/10/2015.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sortList[] = new int[5];
        System.out.println("Provide five integers:");
        for (int i = 0; i < 5; i++) {
            sortList[i] = scan.nextInt();
        }
        for (int m = 0; m < 4; m++) {
            for (int k = 0; k < 4; k++) {
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
