import domain.AvgRates;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by Дмитрий Шаталов on 4/12/2015.
 */
public class AvgRates_HashMap implements AvgRates {

    @Override
    public static HashMap<String, Object> readData(String fileName) {
        HashMap<String, Object> students = new HashMap();
        ArrayList data = new ArrayList();
        try {
            Scanner in = new Scanner(new File(fileName));

            while (in.hasNext()) {
                data.add(in.nextLine().split(" "));
                students.put((String) data.get(0),data.subList(1, data.size()));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return students;
    }

    @Override
    public HashMap<String, Double> computeAverage(HashMap<String, ArrayList<Integer>> rates) {
        return null;
    }

    @Override
    public void addRate(HashMap<String, ArrayList<Integer>> rates, String id, Integer rate) {

    }

    @Override
    public HashMap<String, Double> computeAverage(HashMap<String, ArrayList<Integer>> rates, String id) {
        return null;
    }

    @Override
    public void saveAverageToFile(HashMap<String, String> students, HashMap<String, Double> avgRates) {

    }

   /* public static void main(String[] args) {
        new AvgRates_HashMap().ha();
    }*/
}
