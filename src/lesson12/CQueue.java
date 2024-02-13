package lesson12;

/**
 * AIT-TR, cohort 42.1, Java Basic, hm # 12, class Queue
 * Implementation of a circular queue
 * @copied from CodeChick.io
 * @version 12-Feb-2024
 */

public class CQueue {
    int size = 10;
    int front, rear;
    int items[] = new int[size];

    CQueue() {
        front = -1;
        rear = -1;
    }

    // check if the queue is full
    boolean isFull() {
        if (front == 0 && rear == size - 1) {
            return true;
        } if (front == rear + 1) {
            return true;
        }
        return false;
    }

    // check if the queue is empty
    boolean isEmpty() {
        if (front == -1) {
            return true;
        } else {
            return false;
        }
    }

    // adding elements to the queue
    void enQueue(int element) {
        if (isFull()) {
            System.out.println("Queue is full!");
        } else if (front == -1) {
            front = 0;
            rear = (rear + 1) % size;
            items[rear] = element;
            System.out.println("Added value " + element);
        }
    }

    // removing elements from the queue
    int deQueue() {
        int element;
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return (-1);
        } else {
            element = items[front];
            if (front == rear) {
                front = -1; rear = -1;
            }   /* Inside Q is only one element, so the queue is reset
                 to the initial state after the last element is removed */
            else {
                front = (front + 1) % size;
            }
            return (element);
        }
    }

    void display() {
        /* The function displays the status of a circular list to the console */
        int i;
        if (isEmpty()) {
            System.out.println("Queue is empty!");
        } else {
            System.out.println("Index FRONT -> " + front);
            System.out.println("Elements -> ");
            for (i = front; i != rear ; i = (i + 1) % size) {
                System.out.print(items[i] + " ");
                System.out.println(items[i]);
                System.out.println("Index REAR -> " + rear);
            }
        }
    }
}