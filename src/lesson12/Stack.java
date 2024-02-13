package lesson12;

/**
 * AIT-TR, cohort 42.1, Java Basic, hm # 12, class Stack
 * Implementation of stack
 * @copied from CodeChick.io
 * @version 12-Feb-2024
 */

public class Stack {
    private int arr[];
    private int top, capacity;

    // create a stack
    Stack(int size) {
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    // adding elements to the stack
    public void push(int x) {
        if (isFull()) {
            System.out.println("Overflow!\nProgram stopped!\n");
            System.exit(1);
        }
        System.out.println("Added element " + x);
        arr[++top] = x;
    }

    // removing elements from the stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            System.exit(1);
        }
        return arr[top--];
    }

    // function returns stack size
    public int size() {
        return top + 1;
    }

    // check if the stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // check if the stack is full
    public boolean isFull() {
        return top == capacity - 1;
    }

    public void printStack() {
        for (int i = 0; i <= top; i++) {
            System.out.println(arr[i]);
        }
    }
}
