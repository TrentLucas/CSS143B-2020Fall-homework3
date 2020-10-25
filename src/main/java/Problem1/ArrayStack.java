package Problem1;

import java.util.EmptyStackException;

public class ArrayStack<T> implements Stack<T> {
    // do not change member variables
    private T[] data;
    private int size;

    private ArrayStack() {
    }

    public ArrayStack(int capacity) {
        // homework
        data = (T[]) new Object[capacity];
        size = 0;
    }

    @Override
    public boolean push(T val) {
        // homework
        if (data.length == 0 || (Integer) val > data.length) {
            return false;
        }
        for (int i = data.length - 1; i > 0; i--) {
            data[i] = data[i - 1];
        }
        data[0] = val;
        size++;
        return true;
    }

    @Override
    public T pop() {
        // homework
        T val = data[0];
        for (int i = 0; i < data.length - 1; i++) {
            data[i] = data[i + 1];
        }
        size--;
        if (size < 0) {
            size = 0;
        }
        for (int j = size; j < data.length; j++) {
            data[j] = null;
        }
        return val;
    }

    @Override
    public T peek() {
        // homework
        if (data.length == 0) {
            return null;
        }
        T val = data[0];   // place holder
        return val;   // place holder
    }

    @Override
    public int size() {
        return size;
    }
}
