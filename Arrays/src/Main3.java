import java.io.PrintWriter;

/**
 * Created by Дмитрий Шаталов on 3/22/2015.
 */
public class Main3 {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.format("%3d", i * j);
            }
            System.out.println();
        }

        PrintWriter out = new PrintWriter(System.out);
        int m = 10;
        int n = 10;
        int a[][] = new int[n][m];
        for (int i = 1; i < n * m; i++) {
            out.println((i / m) + " " + (i % m) + " = " + (i / m) * (i % m));
            a[i / m][i % m] = (i / m) * (i % m);
        }
        for (int i = 1; i < n * m; i++){
            out.format("%3d", a[i / m][i % m]);
            if (i % m == m - 1)
                out.println();
        }
        out.close();
    }
}
