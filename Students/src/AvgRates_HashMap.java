import domain.AvgRates;
import domain.Path;

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

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

        HashMap<String, Double> avgs = p.computeAverage(rates);
        System.out.println(avgs);
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
    public void addRate(HashMap<String, ArrayList<Integer>> rates, String id, Integer rate) {
        //rates.put(id, rate);
    }

    @Override
    public HashMap<String, Double> computeAverage(HashMap<String, Object> rates, String id) {
        ArrayList list = new ArrayList();
        HashMap <String, Double> average = new HashMap();
        double sum = 0;
        list.add(rates.get(id));
        for (int i = 0; i < list.size() - 1; i++) {
            sum += Double.parseDouble(list.get(i).toString());
        }
        average.put(id, sum / list.size());
        return average;
    }

    @Override
    public void saveAverageToFile(HashMap<String, String> students, HashMap<String, Double> avgRates) {
        for (String a : students.keySet()) {
            for (String b : avgRates.keySet()) {
                if (a == b) {
                    students.put(a, String.valueOf(avgRates.get(b)));
                }
            }
        }
        try {
            File file = new File("finalList.txt");
            BufferedWriter output = new BufferedWriter(new FileWriter(file));
            output.write(String.valueOf(students));
            output.close();
        } catch ( IOException e ) {
            e.printStackTrace();
        }
    }

   /* public static void main(String[] args) {
        new AvgRates_HashMap().ha();
    }*/
}
