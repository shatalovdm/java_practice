/**
 * Created by Дмитрий Шаталов on 3/8/2015.
 */
public class Cat {

    private String name;
    private String fullName;
    private static int catsCount = 0;

    /* Реализовать метод setName
    Реализовать метод setName, чтобы с его помощью можно было
    устанавливать значение переменной private String name равное
    переданному параметру String name.
    */
    public void setName(String name) {
        this.name = name;
    }
    public void hello(){
        String a = this.name;
    }



    /* Реализовать метод addNewCat
    Реализовать метод addNewCat, чтобы при его вызове (т.е.
    добавлении нового кота), количество котов увеличивалось на 1. За
    количество котов отвечает переменная catsCount.
    */
    public static void addNewCat() {
        catsCount++;
    }

    /* Реализовать метод setCatsCount
    Реализовать метод setCatsCount так, чтобы с его помощью можно
    было устанавливать значение переменной catsCount равное
    переданному параметру.
    */
    public static void setCatsCount(int catsCount) {
        Cat.catsCount = catsCount;
    }

    /* Реализовать метод setName
    Реализовать метод setName, чтобы с его помощью можно было
    устанавливать значение переменной private String fullName равное
    значению локальной переменной String fullName.
    */
    public void setName(String firstName, String lastName) {
        String fullName = firstName + " " + lastName;
        this.fullName = fullName;
    }

}
