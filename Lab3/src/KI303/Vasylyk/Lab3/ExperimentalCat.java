package KI303.Vasylyk.Lab3;

import java.io.IOException;

/**
 * Клас {@code ExperimentalCat} — піддослідний кіт.
 * Особливість — він може брати участь у експерименті.
 */
public class ExperimentalCat extends Cat implements Experiment {

    private String experimentName;

    public ExperimentalCat(String name, int age, String experimentName) throws IOException {
        super(name, age);
        this.experimentName = experimentName;
        log("Піддослідний кіт створений. Експеримент: " + experimentName);
    }

    @Override
    public void makeSound() throws IOException {
        System.out.println(name + ": Мяу?? Я на експерименті!");
        log(name + " видав звук під час експерименту.");
    }

    @Override
    public void runExperiment() throws IOException {
        System.out.println(name + " проводить експеримент: " + experimentName);
        log(name + " виконує експеримент: " + experimentName);
    }
}
