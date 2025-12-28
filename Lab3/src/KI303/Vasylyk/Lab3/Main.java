package KI303.Vasylyk.Lab3;

/**
 * Клас-драйвер демонструє роботу піддослідного кота.
 */
public class Main {
    public static void main(String[] args) {
        try {
            ExperimentalCat cat = new ExperimentalCat("Мурчик", 2, "тест харчової поведінки");

            cat.showInfo();
            cat.makeSound();
            cat.runExperiment();

            cat.closeLog();

        } catch (Exception e) {
            System.err.println("Помилка: " + e.getMessage());
        }
    }
}
