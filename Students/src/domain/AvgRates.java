package domain;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Дмитрий Шаталов on 4/12/2015.
 */
public interface AvgRates {
    //HashMap<String, Double> avgRates;
    /*
    1) считать-сохранить исходные данные из файлов
        - ключ
        - фамилии
        - оценки
        - средние оценки
    2) рассчитать средние оценки (сохранить в HashMap)
    3) при добавлении оценки студенту пересчитывать его среднюю оценку
    4) по запросу сохранять средние оценки в файл в формате "Имя" - "Средняя оценка"
        - запрашивать правила сортировки (по имени/по оценке)
        - сопоставлять имена и оценки по id
     */
    public static void main(String[] args) {

    }
    /**
     * 1) считать-сохранить данные из файла
     * @param fileName имя файла
     * @return структура с исходными данными
     */
    HashMap<String, Object> readData(String fileName);

    /**
     * 2) рассчёт средних оценок по всем студентам
     * @param rates структура с оценками студентов
     * @return структура со средними оценками
     */
    HashMap<String, Double> computeAverage(HashMap<String, ArrayList<Integer>> rates);

    /**
     * 3) добавление новой оценки
     * @param rates структура с оценками студентов
     * @param id идентификатор студента
     * @param rate добавляемая оценка
     */
    void addRate(HashMap<String, ArrayList<Integer>> rates, String id, Integer rate);

    /**
     * 3) пересчет средней оценки студента
     * @param rates структура с оценками студентов
     * @param id идентификатор студента, для которого осуществлять пересчет
     * @return структура со средними оценками
     */
    HashMap<String, Double> computeAverage(HashMap<String, ArrayList<Integer>> rates, String id);

    /**
     * 4) сохранение средних оценок в файл
     * @param students структура с фамилиями студентов
     * @param avgRates структура со средними оценками студентов
     */
    void saveAverageToFile(HashMap<String, String> students, HashMap<String, Double> avgRates);

    /**
     * only in Java 8! New feature)
     */
    default void ha() {
        System.out.println("haha"+5);
    }

}
