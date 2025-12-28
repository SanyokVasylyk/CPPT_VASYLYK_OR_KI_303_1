package KI303.Vasylyk.Lab2;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

/**
 * Клас {@code Cat} моделює предметну область "Кіт".
 * Містить інформацію про кличку, вік, власника та поведінку кота.
 * Усі дії кота логуються у файл "cat_log.txt".
 */
public class Cat {

    // === Поля ===
    private String name;
    private int age;
    private Owner owner;     // об'єкт класу Owner
    private Tail tail;       // об'єкт класу Tail
    private Food food;       // об'єкт класу Food

    private FileWriter logWriter;

    // === Конструктори ===


    public Cat() throws IOException {
        this("Безіменний", 1, new Owner("Невідомий"), new Tail("сірий"), new Food("риба"));
    }


    public Cat(String name, int age, Owner owner, Tail tail, Food food) throws IOException {
        this.name = name;
        this.age = age;
        this.owner = owner;
        this.tail = tail;
        this.food = food;
        this.logWriter = new FileWriter("cat_log.txt", true);
        log("Кіт створений: " + name);
    }

    // === Методи ===


    private void log(String message) throws IOException {
        logWriter.write(LocalDateTime.now() + "->" + message + "\n");
        logWriter.flush();
    }

    public void meow() throws IOException {
        System.out.println(name + ": Мяу!");
        log(name + " мяукнув.");
    }

    public void eat() throws IOException {
        System.out.println(name + " їсть " + food.getType() + ".");
        log(name + " їсть " + food.getType());
    }

    public void sleep() throws IOException {
        System.out.println(name + " спить...");
        log(name + " заснув.");
    }

    public void play() throws IOException {
        System.out.println(name + " грається зі своїм хвостом " + tail.getColor() + " кольору!");
        log(name + " грається.");
    }

    public void purr() throws IOException {
        System.out.println(name + " муркоче ️");
        log(name + " муркоче.");
    }

    public void ageUp() throws IOException {
        age++;
        System.out.println(name + " став на рік старшим! Йому тепер " + age + ".");
        log(name + " став старшим: " + age);
    }

    public void changeFood(String newFood) throws IOException {
        this.food = new Food(newFood);
        log(name + " тепер їсть " + newFood);
    }

    public void showInfo() {
        System.out.println("Кіт: " + name + ", вік: " + age + ", власник: " + owner.getName());
    }


    public void closeLog() throws IOException {
        log("Роботу завершено.");
        logWriter.close();
    }

    // === Гетери і сетери ===
    public String getName() { return name; }
    public int getAge() { return age; }
    public Owner getOwner() { return owner; }
}
