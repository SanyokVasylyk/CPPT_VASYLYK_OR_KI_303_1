package KI303.Vasylyk.Lab4;

import java.io.FileWriter;
import java.io.IOException;

public class ExpressionCalculator {
    private double x;

    public ExpressionCalculator(double x) {
        this.x = x;
    }

    public double calculate() throws ArithmeticException {
        double sin = Math.sin(x);
        if (sin == 0) {
            throw new ArithmeticException("Помилка: ділення на нуль (sin(x) = 0)");
        }
        return Math.cos(x) / sin;
    }

    public void writeResultToFile(String filename, double result) throws IOException {
        try (FileWriter writer = new FileWriter(filename)) {
            writer.write("Результат обчислення виразу y = cos(x) / sin(x): " + result);
        }
    }
}
