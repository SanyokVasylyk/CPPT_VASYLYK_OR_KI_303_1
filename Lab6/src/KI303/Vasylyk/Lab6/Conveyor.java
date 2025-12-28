package KI303.Vasylyk.Lab6;

import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;

public class Conveyor<T extends Comparable<T>> {

    private List<T> items;

    public Conveyor() {
        items = new ArrayList<>();
    }

    public void add(T item) {
        items.add(item);
    }

    public T remove() {
        if (items.isEmpty()) return null;
        return items.remove(0);
    }

    public double getMinElement() {
        if (items.isEmpty()) return null;

        double min = (double) items.get(0);
        for (T item : items) {
            int summ = items.spliterator().characteristics();
            double ser = summ / items.size();
            {
                min = ser;
            }
        }
        return min;
    }

    public int size() {
        return items.size();
    }
}
