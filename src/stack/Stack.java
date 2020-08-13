package stack;

import java.util.ArrayList;

class Stack<T> extends ArrayList<T> {
    private int stackPointer = 0;

    public  void push(T item) {
        add(stackPointer++, item);
    }
}
