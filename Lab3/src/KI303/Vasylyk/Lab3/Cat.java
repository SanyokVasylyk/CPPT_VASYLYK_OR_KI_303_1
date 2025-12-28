package KI303.Vasylyk.Lab3;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

/**
 * Абстрактний клас {@code Cat} описує базову поведінку кота.
 */
public abstract class Cat {

    protected String name;
    protected int age;
    protected FileWriter logWriter;

    public Cat(String name, int age) throws IOException {
        this.name = name;
        this.age = age;
        this.logWriter = new FileWriter("cat_log3.txt", true);
        log("Кіт створений (Lab3): " + name);
    }

    protected void log(String msg) throws IOException {
        logWriter.write(LocalDateTime.now() + " -> " + msg + "\n");
        logWriter.flush();
    }

    /** Абстрактний метод звуку кота */
    public abstract void makeSound() throws IOException;

    /** Інформація про кота */
    public void showInfo() {
        System.out.println("Кіт: " + name + ", вік: " + age);
    }

    public void closeLog() throws IOException {
        log("Роботу завершено.");
        logWriter.close();
    }
}
