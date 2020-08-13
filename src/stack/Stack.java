package stack;

import java.util.ArrayList;

class Stack<T> {
    ArrayList<T> contents = new ArrayList<>();
    private int stackPointer = 0;

    public  void push(T item) {
        contents.add(stackPointer++, item);
    }

    public  T pop(){
        return contents.remove(--stackPointer);
    }

    public static  void main(String[] args){
        Stack<String> myStack = new Stack<String>();
        myStack.push("1");
        String s = myStack.pop();
    }
}
