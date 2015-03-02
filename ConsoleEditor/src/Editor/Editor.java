package Editor;

import junit.framework.Assert;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * Created by Дмитрий Шаталов on 2/22/2015.
 */
public class Editor {
    public static void main(String[] args) throws IOException {
        Editor result = new Editor();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String exp = reader.readLine();
        System.out.println(result.makeResult(exp));
        System.out.println(result.makeResultMod(exp));
    }

    public static String makeResult(String s) {
        for (int i = 2; i < s.length(); i += 2) {
            s = s.substring(0, i) + s.substring(i + 1);
        }
        return s;
    }

    public static String makeResultMod(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            if (i % 3 != 0 || i == 0) {
                result += s.charAt(i);
            }
        }
        return result;
    }
}
