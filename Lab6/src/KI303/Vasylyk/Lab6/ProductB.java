package KI303.Vasylyk.Lab6;

public class ProductB implements Comparable<ProductB> {

    private int id;
    private double price;

    public ProductB(int id, double price) {
        this.id = id;
        this.price = price;
    }

    @Override
    public int compareTo(ProductB o) {
        return Double.compare(this.price, o.price);
    }

    @Override
    public String toString() {
        return "ProductB{id=" + id + ", price=" + price + "}";
    }
}
