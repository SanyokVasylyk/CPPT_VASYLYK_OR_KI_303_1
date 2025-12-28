package KI303.Vasylyk.Lab5;

public class ExpressionCalculator {
    private double x;

    public ExpressionCalculator(double x) {
        this.x = x;
    }

    public double calculate() {
        double sin = Math.sin(x);
        if (sin == 0) {
            throw new ArithmeticException("Помилка: ділення на нуль (sin(x) = 0)");
        }
        return Math.cos(x) / sin;
    }

    public double getX() {
        return x;
    }
}
