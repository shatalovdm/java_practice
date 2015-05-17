package avgRates;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by Дмитрий Шаталов on 3/29/2015.
 */

/*- прочитать из файла оценки учеников за четверть.
На основе среднего балла для каждого ученика определить тройку лучших и тройку аутсайдеров.
Применить sparse twodimentionаl array, в котором строки соответствуют оценкам учеников.
В результате распечатать id учеников с пояснением.
        rates.txt
        id_14 5 4 3 5 4 3 2 5
        id_15 5 3 5
        id_16 2 3 4 3
        id_254 5 4 5 4 5 4
        id_145 5 5 5 3
        id_165 4 4 4 3
        id_1 4 4 3 2 5 5
        id_7 3 4 3 5
        id_99 5 5 5

        1) прочитать строки из файла (Scanner)
        1.2) int[] vs ArrayList<Integer>
            для строк - ArrayList<String[]>
            для оценок - ?
        2) найти средний балл каждого ученика
        2.2) как сохранять средний балл?
            для ср.б. использовать float (vs double)
            float[]
        3) определить тройку лучших/худших
            отсортировать
            обработать возможность OutOfBoundsArrayException (если студентов меньше 6) (если больше 6, то выводи одноим способом, иначе другим)
        */
public class AvgRates_ArrayList_notTestable {
    public static void main(String... args) {
        try {
            //Scanner in = new Scanner(new File(FILE_PATH));
            Scanner in = new Scanner(new File(args[0])); // ArrayIndexOutOfBoundsException if args is empty
                                                        // FileNotFoundException if file not found
            ArrayList<String[]> students = new ArrayList<String[]>(); // -> {"id_14", "5", "4", "5"}, {"id_15", "3", "4", "5", "5"}, {"id_16", "5"}
            while (in.hasNext()) {
                students.add(in.nextLine().split(" "));
            }
            float[] average = new float[students.size()];
            for (int i = 0; i < students.size(); i++) {
                float sum = 0;
                for (int j = 1; j < students.get(i).length; j++) {
                    // 1) найти сумму оценок по студентам
                    sum += Float.parseFloat(students.get(i)[j]);
                }
                average[i] = sum / (float)(students.get(i).length - 1);
                // 2) находим среднее по сумме; сохраняем в массив average
            }
            Arrays.sort(average);
            if (students.size() >= 6) {
                System.out.println("Three best scores are: " + average[average.length - 1] + " " + average[average.length - 2] + " " + average[average.length - 3]);
                System.out.println("Three worst scores are: " + average[0] + " " + average[1] + " " + average[2]);
            } else if (students.size() < 6 && students.size() > 1){
                System.out.print(students.size() / 2 + " best scores are: ");
                // как прописать особый случай для последнего круга в лупе:
                for (int i = 0; i <  students.size() / 2 - 1; i++) {
                    System.out.print(average[average.length - 1 - i] + ", ");
                }
                System.out.print(average[average.length - 1] + ". ");

                System.out.println();
                System.out.print(students.size() / 2 + " worst scores are: ");
                for (int j = 0; j <  students.size() / 2; j++) {
                    System.out.print(average[j] + " ");
                }
            } else {
                System.out.println("There are less than 2 students in the list");
            }
            System.out.println();
            System.out.println(Arrays.toString(average));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
