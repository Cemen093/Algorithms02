package stack;

public class Stack {
    private char[] elements;
    private int capacity;
    private int top;

    public Stack(int size) {
        capacity = size;
        elements = new char[capacity];
        top = -1;
    }

    public boolean push(char value) {
        boolean flag = false;
        if (top < capacity) {
            top++;
            elements[top] = value;
            flag = true;
        }
        return flag;
    }

    public boolean pop(){
        boolean flag = false;
        if (top > -1){
            top--;
            flag = true;
        }
        return flag;
    }

    public char peek(){
        return elements[top];
    }

    public boolean isEmpty(){
        return  top == -1;
    }
}
