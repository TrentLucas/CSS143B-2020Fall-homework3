package Problem1;

import java.util.LinkedList;

public class LinkedListStack<T> implements Stack<T> {
    // use Java LinkedList to store the data
    // do not change member variables
    private LinkedList<T> data;

    public LinkedListStack() {
        // homework
        data = new LinkedList<>();
    }

    @Override
    public boolean push(T val) {
        // homework
        data.push(val);
        if (data.get(0) == val) {
            return true;
        }
        return false;   // place holder
    }

    @Override
    public T pop() {
        // homework
        T val = data.get(0);
        data.pop();
        return val;   // place holder
    }

    @Override
    public T peek() {
        // homework
        T val = data.peek();   // place holder
        return val;   // place holder
    }

    @Override
    public int size() {
        return data.size();
    }
}
