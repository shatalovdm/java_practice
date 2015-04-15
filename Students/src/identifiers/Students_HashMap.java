package identifiers;import java.io.File;
import java.lang.Exception;import java.lang.String;import java.lang.System;import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by Дмитрий Шаталов on 4/1/2015.
 */
/*прочитать из файла данные учеников. Сохранить в HashMap. По введённому пользователем id выводить фамилию студента.*/
public class Students_HashMap {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("C:\\Users\\Дмитрий Шаталов\\Documents\\Java_training\\Students\\resources\\students.txt"));
            Scanner console = new Scanner(System.in);
            // Map<String, int[]> students = new HashMap<>();
            Map<String, String> students = new HashMap<>();
            while (file.hasNext()) {
                String[] line = file.nextLine().split(" ");
                students.put(line[0], line[1]);
            }
            file.close();
            System.out.println(students.entrySet());
            for (String key : students.keySet()) {
                System.out.println(key + " " + students.get(key));
            }
            System.out.println(students.get(console.nextLine()));
            console.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
