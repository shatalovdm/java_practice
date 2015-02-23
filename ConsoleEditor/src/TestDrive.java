import javax.sound.midi.Soundbank;

/**
 * Created by Дмитрий Шаталов on 2/22/2015.
 */
public class TestDrive {
    public static String makeResult (String s) {
        String r = "";
        for (int i = 3; i <= s.length(); i += 3) {
            System.out.println(i);
            r = removeCharAt(s, i);
        }
        return r;
    }

    public static String removeCharAt(String s, int pos) {
        return s.substring(0, pos) + s.substring(pos + 1);
    }
}
