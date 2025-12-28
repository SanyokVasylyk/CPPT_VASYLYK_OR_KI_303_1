package KI303.Vasylyk.Lab6;

public class Main {

    public static void main(String[] args) {

        System.out.println("--- Конвеєр ProductA ---");

        Conveyor<ProductA> conveyorA = new Conveyor<>();

        conveyorA.add(new ProductA("Box", 6));
        conveyorA.add(new ProductA("Metal", 40));
        conveyorA.add(new ProductA("Paper", 5));
        conveyorA.add(new ProductA("wood", 40));

        System.out.println("Мінімальний елемент: " + conveyorA.getMinElement());
        System.out.println("Видалення: " + conveyorA.remove());
        System.out.println("Кількість елементів: " + conveyorA.size());


        System.out.println("\n--- Конвеєр ProductB ---");

        Conveyor<ProductB> conveyorB = new Conveyor<>();

        conveyorB.add(new ProductB(101, 15.5));
        conveyorB.add(new ProductB(102, 7.3));
        conveyorB.add(new ProductB(103, 22.1));

        System.out.println("Мінімальний елемент: " + conveyorB.getMinElement());
        System.out.println("Видалення: " + conveyorB.remove());
        System.out.println("Кількість елементів: " + conveyorB.size());
    }
}
