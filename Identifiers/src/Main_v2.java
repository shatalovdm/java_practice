import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by Дмитрий Шаталов on 4/1/2015.
 */
/*прочитать из файла данные учеников. Сохранить в HashMap. По введённому пользователем id выводить фамилию студента.*/
public class Main_v2 {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("C:\\Users\\Дмитрий Шаталов\\Documents\\Java_training\\Identifiers\\src\\Identifiers.txt"));
            Scanner console = new Scanner(System.in);
            // Map<String, int[]> students = new HashMap<>();
            Map<String, String> students = new HashMap<>();
            int j = 0;
            while (file.hasNext()) {
                String[] line = file.nextLine().split(" ");
                students.put(line[0], line[1]);
            }
            file.close();
            //System.out.println(students.toString());
            System.out.println(students.entrySet());
            for (String key : students.keySet()) {
                System.out.println(key + " " + students.get(key));
            }
            System.out.println(students.get("id_14"));
            console.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
