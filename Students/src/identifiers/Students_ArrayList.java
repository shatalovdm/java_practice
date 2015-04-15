package identifiers;import java.io.File;
import java.lang.Exception;import java.lang.String;import java.lang.System;import java.util.*;import java.util.ArrayList;import java.util.HashMap;import java.util.Map;import java.util.Scanner;

/**
 * Created by Дмитрий Шаталов on 4/1/2015.
 */
/*прочитать из файла данные учеников. Сохранить в HashMap. По введённому пользователем id выводить фамилию студента.*/
public class Students_ArrayList {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File(args[0]));
            Scanner console = new Scanner(System.in);
            Map<String, String> list = new HashMap();
            ArrayList<String[]> students = new ArrayList<String[]>();
            while (file.hasNext()) {
                students.add(file.nextLine().split(" "));
            }
            //System.out.println(students.toString());
            for (int i = 0; i < students.size() - 1; i++) {
                list.put(students.get(i)[0], students.get(i)[1]);
            }
            /*while () {
                for (String a : in.nextLine().split(" ")) {
                    for (String s: in.nextLine().split(" ")) {
                        list.put(a, s);
                    }
                }
            }*/
            System.out.println(list.entrySet());
            String a = console.nextLine();
            System.out.println(list.get(a));
            file.close();
            console.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
