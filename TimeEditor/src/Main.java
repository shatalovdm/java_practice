import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

/**
 * Created by Дмитрий Шаталов on 3/4/2015.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String exp = "";
        while (!Pattern.matches("[\\d]+", exp)) {
            System.out.println("Provide the int:");
            exp = reader.readLine();
        }
        System.out.println(operator(exp));
    }
    public static String operator (String number) {
        int a = Integer.parseInt(number) / 60;
        int b = Integer.parseInt(number) % 60;
        String result;
        if (a > 23) {
            a = a % 24;
            result = a + ":" + b;
        }
        else {
            result = a + ":" + b;
        }
        return result;
    }
}
