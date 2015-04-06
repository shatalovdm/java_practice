import java.util.Scanner;

/**
 * Created by Дмитрий Шаталов on 4/5/2015.
 */
public class FindElements_v3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int count = 0;
        int[] mas = new int[a];
        for (int i = 0; i < a; i++) {
            mas[i] = sc.nextInt();
        }
        for (int i = 1; i < a - 1; i++) {
            if ((mas[i] > mas[i - 1]) && (mas[i] > mas[i + 1])) {
                count++;
            }
        }
        System.out.print(count);
    }
}
