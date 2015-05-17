package avgRates;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
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
public class AvgRates_ArrayList_testable {
    // Assert.assertEquals("", Main_v2.process("rates.txt"))
    public static void main(String[] args) {
        try {
            String a = process("C:\\Users\\Дмитрий Шаталов\\Documents\\Java_training\\Students\\src\\rates.txt");
            System.out.println(a);
            System.out.println(process("C:\\Users\\Дмитрий Шаталов\\Documents\\Java_training\\Students\\src\\rates1.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static String process(String fileName) throws FileNotFoundException {
        String answer;
            Scanner in = new Scanner(new File(fileName)); // ArrayIndexOutOfBoundsException if args is empty
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
                answer = "Three best scores are: " + average[average.length - 1] + " " + average[average.length - 2] + " " + average[average.length - 3];
                answer += "\nThree worst scores are: " + average[0] + " " + average[1] + " " + average[2];
            } else if (students.size() < 6 && students.size() > 1){
                answer = students.size() / 2 + " best scores are: ";
                // как прописать особый случай для последнего круга в лупе:
                for (int i = 0; i <  students.size() / 2 - 1; i++) {
                    answer += average[average.length - 1 - i] + ", ";
                }
                answer += average[average.length - 1] + ".\n";

                answer += students.size() / 2 + " worst scores are: ";
                for (int j = 0; j <  students.size() / 2 - 1; j++) {
                    answer += average[j] + ", ";
                }
                answer += average[average.length - 1] + ".";
            } else {
                answer = "There are less than 2 students in the list.\n";
            }
//            System.out.println(Arrays.toString(average));
        return answer;
    }
}
