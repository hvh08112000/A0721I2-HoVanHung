package ss10_dsa_danh_sach.thuc_hanh;

import java.util.Arrays;

public class MyList<T> {
    private int size = 0;
    private final int DEFAULT_CAPACITY = 10;
    private T[] elements;

    public MyList() {
        elements = (T[]) new Object[DEFAULT_CAPACITY];
    }

    private void ensureCapa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public void add(T t) {
        if (size == elements.length) {
            ensureCapa();
        }
        elements[size++] = t;
    }

    public T get(int i) {
        if (i >= 0 || i <= size) {
            return elements[i];
        }
        throw new IndexOutOfBoundsException("Index: " + i + ", Size: " + (size - 1));
    }
}
