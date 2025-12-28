import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть розмір квадратної матриці: ");
        int n = scanner.nextInt();

        // Робимо розмір непарним, як у Python-коді
        if (n % 2 == 0) {
            n = n + 1;
        }

        System.out.print("Введіть символ-заповнювач: ");
        String inputFiller = scanner.next();

        if (inputFiller.length() != 1) {
            System.out.println("Потрібно ввести рівно 1 символ!");
            return;
        }

        char symbol = inputFiller.charAt(0);

        // Створюємо та ініціалізуємо матрицю пробілами
        char[][] arr = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = ' ';
            }
        }

        int mid = n / 2;
        int height = (n + 1) / 2;
        int startRow = n - height;

        // Логіка малювання трикутника
        for (int i = startRow; i < n; i++) {
            int k = i - startRow;
            int left = Math.max(0, mid - k);
            int right = Math.min(n - 1, mid + k);
            for (int j = left; j <= right; j++) {
                arr[i][j] = symbol;
            }
        }

        // Виведення в консоль та запис у файл
        try (PrintWriter fout = new PrintWriter(new FileWriter("MyFile.txt"))) {
            for (int i = 0; i < n; i++) {
                StringBuilder row = new StringBuilder();
                for (int j = 0; j < n; j++) {
                    row.append(arr[i][j]).append(j == n - 1 ? "" : " ");
                }

                String line = row.toString();
                System.out.println(line); // Друк у консоль
                fout.println(line);       // Запис у файл
            }
        } catch (IOException e) {
            System.err.println("Помилка при записі у файл: " + e.getMessage());
        }

        scanner.close();
    }
}