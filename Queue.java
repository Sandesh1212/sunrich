package com.sandesh;

public class Queue
{
    private static int front, rear, capacity;
    private static int queue[];

    Queue(int c)
    {
        front = rear = 0;
        capacity = c;
        queue = new int[capacity];
    }
    // function to insert an element at the rear of the queue
    static void queueEnqueue(int data)
    {
        // check queue is full or not
        if (capacity == rear) {
            System.out.println("Queue is full");
            return;
        }
        // insert element at the rear
        else {
            queue[rear] = data;
            rear++;
        }
        return;
    }
    // function to delete an element from the front of the queue
    static void queueDequeue()
    {
        // if queue is empty
        if (front == rear) {
            System.out.printf("Queue is empty");
            return;
        }
        // shift all the elements from index 2 till rear to the right by one
        else {
            for (int i = 0; i < rear - 1; i++) {
                queue[i] = queue[i + 1];
            }
            // store 0 at rear indicating there's no element
            if (rear < capacity)
                queue[rear] = 0;

            // decrement rear
            rear--;
        }
        return;
    }
    // print queue elements
    static void queueDisplay()
    {
        if (front == rear) {
            System.out.println("Queue is Empty");
            return;
        }

        // traverse front to rear and print elements
        for (int i = front; i < rear; i++) {
            System.out.println("<--"+ queue[i]);
        }
        return;
    }

    // print front of queue
    static void queueFront()
    {
        if (front == rear) {
            System.out.println("Queue is Empty");
            return;
        }
        System.out.printf("Front Element is:"+queue[front]);
        return;
    }

    public static void main(String []args) {
        // Create a queue of capacity 4
        Queue q = new Queue(4);

        // print Queue elements
        q.queueDisplay();

        // inserting elements in the queue
        q.queueEnqueue(20);
        q.queueEnqueue(30);
        q.queueEnqueue(40);
        q.queueEnqueue(50);

        // print Queue elements
        q.queueDisplay();

        // insert element in the queue
        q.queueEnqueue(60);

        // print Queue elements
        q.queueDisplay();

        q.queueDequeue();
        q.queueDequeue();
        System.out.println("after two node deletion");
        // print Queue elements
        q.queueDisplay();
        // print front of the queue
        q.queueFront();
    }
}


