import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * Created by Дмитрий Шаталов on 2/22/2015.
 */
public class Editor {
    public static void main(String[] args) throws IOException {
        TestDrive result = new TestDrive();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String exp = reader.readLine();
        System.out.println(result.makeResult(exp));
    }
}
