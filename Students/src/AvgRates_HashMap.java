import domain.AvgRates;
import domain.Path;

import java.io.*;
import java.util.*;

/**
 * Created by Дмитрий Шаталов on 4/12/2015.
 */
public class AvgRates_HashMap implements AvgRates {
    public static void main(String[] args) throws FileNotFoundException {
        AvgRates_HashMap p = new AvgRates_HashMap();
        HashMap<String, Object> students = p.readData(Path.path + "students.txt");
        //System.out.println(((String[])students.get("id_145"))[0]);
        System.out.println(students.get("id_145"));
        // students.get("id_145") - вернёт Object
        // (String[])students.get("id_145") - явное приведение к массиву строк String[]
        // ((String[])students.get("id_145"))[0] - получение значения единственной строки из массива String

        HashMap<String, Object> rates = p.readData(Path.path + "rates.txt");
        //HashMap<String, Object> rates = p.readData(Path.path + "rates.txt");
        System.out.println(rates.get("id_145"));

        HashMap<String, Double> avgs99 = p.computeAverage(rates, "id_99");
        System.out.println(avgs99);

        p.addRate(rates, "id_99", 3);

        avgs99 = p.computeAverage(rates, "id_99");
        System.out.println(avgs99);

        HashMap<String, Double> avgs = p.computeAverage(rates);
        System.out.println(avgs);

        p.saveAverageToFile(students, avgs);
    }

    @Override
    public HashMap<String, Object> readData(String fileName) {
        HashMap<String, Object> students = new HashMap<>();
        try {
            Scanner in = new Scanner(new File(fileName));
            while (in.hasNext()) {
                String[] data = in.nextLine().split(" ");
                if (data.length == 2) { // for student names
                    students.put(data[0], data[1]);
                } else { // for student rates
                    ArrayList<Integer> rates = new ArrayList<>();
                    for (String rate : Arrays.copyOfRange(data, 1, data.length)) {
                        rates.add(Integer.parseInt(rate));
                    }
                    students.put(String.valueOf(data[0]), rates);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return students;
    }

    @Override
    public HashMap<String, Double> computeAverage(HashMap<String, Object> rates) {
        HashMap <String, Double> average = new HashMap<>();
        for (String key : rates.keySet()) {
            int sum = 0;
            ArrayList<Integer> r = (ArrayList<Integer>)rates.get(key);
            for (Integer rate : r) {
                sum += rate;
            }
            double avg = (double)sum / r.size();
            // double avg = sum*1.0 / r.size();
            average.put(key, avg);
        }
        return average;
    }

    @Override
    public HashMap<String, Double> computeAverage1(HashMap<String, Object> rates) {
        HashMap<String, Double> average = new HashMap<>();
        for (String key: rates.keySet()) {
            average.put(key, computeAverage1(rates, key));
        }
        return average;
    }

    /*  3.1) получить ArrayList с оценками студента
     *  3.2) в ArrayList добавить новую оценку
     *  3.3) заменить в rates запись с оценками для текущего студента
     *  3.4) пересчитать среднюю оценку для студента
     */
    @Override
    public HashMap<String, Object> addRate(HashMap<String, Object> rates, String id, Object rate) {
        ArrayList list = new ArrayList();
        list.addAll(rates.values());
        list.add(rate);
        rates.replace(id, list);
        return rates;
    }

    @Override
    public HashMap<String, Double> computeAverage(HashMap<String, Object> rates, String id) {
        HashMap <String, Double> average = new HashMap<>();
        int sum = 0;
        ArrayList<Integer> r = new ArrayList<>();
        r.addAll((Collection<? extends Integer>) rates.get(id));
        for (Integer rate : r) {
            sum += rate;
        }
        double avg = (double)sum / r.size();
        // double avg = sum*1.0 / r.size();
        average.put(id, avg);
        return average;
    }

    @Override
    public Double computeAverage1(HashMap<String, Object> rates, String id) {
        int sum = 0;
        ArrayList<Integer> r = (ArrayList<Integer>)rates.get(id);
        for (Integer rate : r) {
            sum += rate;
        }
        // double average = sum*1.0 / r.size();
        return (double)sum / r.size();
    }

    /*
     *  4.1) создать в директории файл для записи результатов
     *  4.2) цикл по id (из какого HashMap - значения не имеет)
     *  4.3) сохранить в файл строку, стостоящую из фамилии и средней оценки студента, полученной из обоих HashMap'ов по id
     *  4.4) в конце цикла закрыть файл
     */
    @Override
    public void saveAverageToFile(HashMap<String, Object> students, HashMap<String, Double> avgRates) {
        try {
            File file = new File(Path.path + "finalList.txt");
            BufferedWriter output = new BufferedWriter(new FileWriter(file));
            for (String id : students.keySet()) {
                String line = students.get(id) + " " + avgRates.get(id);
                output.write(line);
                output.newLine();
            }
            output.close();
        } catch ( IOException e ) {
            e.printStackTrace();
        }
    }

   /* public static void main(String[] args) {
        new AvgRates_HashMap().ha();
    }*/
}
