import java.lang.reflect.Array;

/**
 * Created by Дмитрий Шаталов on 3/20/2015.
 */
public class Main {
    public static void main(String[] args) {
        String[][] str = new String[6][7];
        for (int i = 0; i < 5; i++) {
            for (int k = 0; k < 6; k++) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }
}