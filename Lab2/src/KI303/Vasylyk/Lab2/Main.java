package KI303.Vasylyk.Lab2;
import java.io.IOException;

/**
 * Клас-драйвер {@code Main} демонструє роботу класу {@link Cat}.
 */
public class Main {
    public static void main(String[] args) {
        try {
            Owner owner = new Owner("Олександр");
            Tail tail = new Tail("чорний");
            Food food = new Food("риба");

            Cat cat = new Cat("Мурчик", 3, owner, tail, food);

            cat.showInfo();
            cat.meow();
            cat.eat();
            cat.purr();
            cat.play();
            cat.sleep();
            cat.ageUp();
            cat.changeFood("молоко");
            cat.eat();
            cat.closeLog();

        } catch (IOException e) {
            System.err.println("Помилка при роботі з файлом: " + e.getMessage());
        }
    }
}