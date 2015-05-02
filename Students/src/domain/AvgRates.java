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
    2) рассчитать средние оценки для всех и для отдельного студента (сохранить в HashMap)
    3) при добавлении оценки студенту пересчитывать его среднюю оценку
    4) по запросу сохранять средние оценки в файл в формате "Имя" - "Средняя оценка"
        - запрашивать правила сортировки (по имени/по оценке)
        - сопоставлять имена и оценки по id
     */

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
    HashMap<String, Double> computeAverage(HashMap<String, Object> rates);

    HashMap<String, Double> computeAverage1(HashMap<String, Object> rates);
    /**
     * 3) добавление новой оценки
     * @param rates структура с оценками студентов
     * @param id идентификатор студента
     * @param rate добавляемая оценка
     *
     *  3.1) получить ArrayList с оценками студента
     *  3.2) в ArrayList добавить новую оценку
     *  3.3) заменить в rates запись с оценками для текущего студента
     *  3.4) пересчитать среднюю оценку для студента
     */
    HashMap<String, Object> addRate(HashMap<String, Object> rates, String id, Object rate);

    /**
     * 3) пересчет средней оценки студента
     * @param rates структура с оценками студентов
     * @param id идентификатор студента, для которого осуществлять пересчет
     * @return структура со средними оценками
     */
    HashMap<String, Double> computeAverage(HashMap<String, Object> rates, String id);

    Double computeAverage1(HashMap<String, Object> rates, String id);

    /**
     * 4) сохранение средних оценок в файл
     * @param students структура с фамилиями студентов
     * @param avgRates структура со средними оценками студентов
     *
     *  4.1) создать в директории файл для записи результатов
     *  4.2) цикл по id (из какого HashMap - значения не имеет)
     *  4.3) сохранить в файл строку, стостоящую из фамилии и средней оценки студента, полученной из обоих HashMap'ов по id
     *  4.4) в конце цикла закрыть файл
     */
    void saveAverageToFile(HashMap<String, Object> students, HashMap<String, Double> avgRates);

    /**
     * only in Java 8! New feature)
     */
    default void ha() {
        System.out.println("haha"+5);
    }

}
