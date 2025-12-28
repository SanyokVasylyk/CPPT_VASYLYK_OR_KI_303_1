package KI303.Vasylyk.Lab6;

public class ProductA implements Comparable<ProductA> {

    private String name;
    private double weight;

    public ProductA(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public int compareTo(ProductA o) {
        return Integer.compare((int) this.weight, (int) o.weight);
    }

    @Override
    public String toString() {
        return "ProductA{name='" + name + "', weight=" + weight + "}";
    }
}
