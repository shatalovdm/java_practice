/**
 * Created by Дмитрий Шаталов on 3/8/2015.
 */
public class Cat {

    private String name;
    private String fullName;
    private static int catsCount = 0;
    private int age;
    private int weight;
    private int strength;

    Cat() {}
    Cat(int age) {
        this.age = age;
    }

    Cat(int age, int weight, int strength) {
        this.age = age;
        this.weight = weight;
        this.strength = strength;
    }

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
    /* Реализовать метод fight
    Реализовать метод boolean fight(Cat anotherCat):
    реализовать механизм драки котов в зависимости от их веса, возраста и силы.
    Зависимость придумать самому. Метод должен определять, выиграли ли мы (this) бой или нет,
    т.е. возвращать true, если выиграли и false - если нет.
    Должно выполняться условие:
    если cat1.fight(cat2) = true , то cat2.fight(cat1) = false
    */

    boolean fight(Cat anotherCat) {
        int rate = 0;
        rate = this.age > anotherCat.age ? rate + 1 : rate;
        rate = this.strength > anotherCat.strength ? rate + 2 : rate;
        rate = this.weight > anotherCat.weight ? rate + 1 : rate;
        if (rate == 2) {
            try {
                throw new DrawException();// true true => true; false false => true; others => false;
            } catch (DrawException e) {
                e.printStackTrace();
            }
        }
        return rate > 2;
    }

    public static void main(String[] args) {
        Cat pussy = new Cat();
        pussy.strength = 15;
        pussy.weight = 4;
        pussy.age = 5;
        Cat barsik = new Cat();
        barsik.age = 1;
        barsik.weight = 2;
        barsik.strength = 16;
        System.out.println(pussy.fight(barsik));
        System.out.println(barsik.fight(pussy));

        Cat barsik1 = new Cat(1, 1, 1);
        //barsik1.age = 1;
        //barsik1.weight = 1;
        //barsik1.strength = 1;
        System.out.println(pussy.fight(barsik1));
        System.out.println(barsik1.fight(pussy));
    }
}


class DrawException extends Exception {
    @Override
    public String toString() {
        return "draw";
    }
}