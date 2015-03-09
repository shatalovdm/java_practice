/**
 * Created by Дмитрий Шаталов on 3/8/2015.
 */
public class Solution {
    /* Подсчитать количество котов
    Написать код, чтобы правильно считалось количество созданных
    котов (count) и на экран выдавалось правильно их количество.
    */

    public static void main(String[] args) {
        Cat cat1 = new Cat();

        //add your code here
        Cat.count++;
        Cat cat2 = new Cat();

        //add your code here
        Cat.count++;

        System.out.println("Cats count is " + Cat.count);

    }

    public static class Cat {
        public static int count = 0;

    }

}
