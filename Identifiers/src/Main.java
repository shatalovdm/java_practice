import java.io.File;
import java.util.*;

/**
 * Created by Дмитрий Шаталов on 4/1/2015.
 */
/*прочитать из файла данные учеников. Сохранить в HashMap. По введённому пользователем id выводить фамилию студента.*/
public class Main {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File(args[0]));
            Scanner console = new Scanner(System.in);
            Map<String, String> list = new HashMap();
            ArrayList<String[]> students = new ArrayList<String[]>();
            int j = 0;
            while (file.hasNext()) {
                students.add(file.nextLine().split(" "));
            }
            //System.out.println(students.toString());
            for (int i = 0; i < students.size() - 1; i++) {
                list.put(students.get(i)[j], students.get(i)[j + 1]);
            }
            /*while () {
                for (String a : in.nextLine().split(" ")) {
                    for (String s: in.nextLine().split(" ")) {
                        list.put(a, s);
                    }
                }
            }*/
            System.out.println(list.entrySet());
            for (String a : list.keySet()) {


            }
            file.close();
            console.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
