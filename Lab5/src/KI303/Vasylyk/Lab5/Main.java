package KI303.Vasylyk.Lab5;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть значення x (у градусах): ");

        try {
            double grad = scanner.nextDouble();
            double x = Math.toRadians(grad);

            ExpressionCalculator calculator = new ExpressionCalculator(x);
            double result = calculator.calculate();

            System.out.println("Результат: y = " + result);

            ResultIO.writeText("result.txt", x, result);
            System.out.println("Текстовий файл result.txt створено");

            ResultIO.writeBinary("result.bin", x, result);
            System.out.println("Двійковий файл result.bin створено");

            String text = ResultIO.readText("result.txt");
            System.out.println("\n--- Вміст текстового файла ---");
            System.out.println(text);

            double[] bin = ResultIO.readBinary("result.bin");
            System.out.println("--- Вміст двійкового файла ---");
            System.out.println("x = " + bin[0]);
            System.out.println("y = " + bin[1]);

        } catch (ArithmeticException e) {
            System.out.println("Помилка обчислення: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Помилка вводу: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
