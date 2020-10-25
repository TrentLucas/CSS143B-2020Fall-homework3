package Problem1;

import java.util.Iterator;

public class MinStack extends ArrayStack<Integer> {
    // okay to add member variables
    // can only use Stack interface and ArrayStack from this folder
    // do not use Java Stack
    ArrayStack auxStack;

    public MinStack(int size) {
        // homework
        super(size);
        auxStack = new ArrayStack(size);
    }

    @Override
    public boolean push(Integer val) {
        // homework
        if (auxStack.peek() == null) {
            auxStack.push(val);
        }
        if (val < (Integer) auxStack.peek()) {
            auxStack.push(val);
        }
        return super.push(val);
    }

    @Override
    public Integer pop() {
        // homework
        if (super.peek() == auxStack.peek()) {
            auxStack.pop();
        }
        return super.pop(); // place holder
    }

    public Integer getMin() {
        // homework
        // loop of any kind is not allowed
        return (Integer) auxStack.pop(); // place holder
    }
}

