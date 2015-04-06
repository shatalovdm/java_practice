import java.util.Scanner;

/**
 * Created by Дмитрий Шаталов on 3/22/2015.
 */
public class SnowFlake {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        char[][] flake = new char[a][a];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                if (i == a / 2) {
                    flake[i][j] = '*';
                } else if (j == a / 2) {
                    flake[i][j] = '*';
                } else if (i == j) {
                    flake[i][j] = '*';
                } else if (i == (a - 1) - j) {
                    flake[i][j] = '*';
                } else {
                    flake[i][j] = '.';
                }
                System.out.format("%2c", flake[i][j]);
            }
            System.out.println();
        }
    }
}
