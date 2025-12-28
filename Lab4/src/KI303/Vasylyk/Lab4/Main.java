package KI303.Vasylyk.Lab4;

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

            calculator.writeResultToFile("result.txt", result);
            System.out.println("Результат успішно записано у файл result.txt");

        } catch (ArithmeticException e) {
            System.out.println("Помилка обчислення: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Помилка запису у файл: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Невідома помилка: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
