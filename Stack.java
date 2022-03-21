package com.sandesh;
import java.io.*;
import java.util.*;

class Stack<T> {
    ArrayList<T> A;
    // Default value of top
    int top = -1;
    // creating the Variable
    int size;

    // Constructor to initialize stack
    Stack(int size) {
        this.size = size;
        // Creating array of Size = size
        this.A = new ArrayList<T>(size);
    }

    public static void main(String[] args) {
        // Integer Stack
        // Creating an object of Stack class
        Stack<Integer> s1 = new Stack<>(3);

        // Pushing elements to integer stack - s1
        s1.push(10);
        s1.push(20);
        s1.push(30);

        // Printing stmts after push
        System.out.println("s1 after pushing 10,20,30:" + s1);

        // pop from stack s1
        s1.pop();
        // Print the stack elements after poping  element
        System.out.println("s1 after pop :" + s1);

        // String Stack
        // Creating an object of Stack class
        Stack<String> s2 = new Stack<>(3);

        // Pushing elements to string stack - s2
        s2.push("hello");
        s2.push("world");
        s2.push("java");

        // Printing stmts after push
        System.out.println("s2 after pushing elements:" + s2);
        System.out.println("s2 after pushing 4th element:");

        // Pushing one more element in stack
        s2.push("GFG");

        // Float stack
        // Creating an object of Stack class
        Stack<Float> S4 = new Stack<>(2);
        // Pushing elements to string stack - S4
        S4.push(200.2f);
        S4.push(100.2f);
        System.out.println("after pushing elements" + S4);
        System.out.println("top element of S4:" + S4.top());

        S4.pop();
        System.out.println("S4 after pop :" + S4);
    }

    // To push generic element into stack
    void push(T X) {
        // Checking if array is full
        if (top + 1 == size) {
            // Display message when array is full
            System.out.println("Stack Overflow");
        } else {
            // Increment top to go to next position
            top = top + 1;
            // Over-writing existing element
            if (A.size() > top) {
                A.set(top, X);
            } else {
                // Creating new element
                A.add(X);
            }
        }
    }

    // To return topmost element of stack
    T top() {
        // If stack is empty
        if (top == -1) {
            // Display message when there are no elements in the stack
            System.out.println("Stack Underflow");
            return null;
        }
        // else elements are present so return the topmost element
        else
            return A.get(top);
    }

    // To delete last element of stack
    void pop() {
        // If stack is empty
        if (top == -1) {
            // Display message when there are no elements in the stack
            System.out.println("Stack Underflow");
        } else
            // Delete the last element by decrementing the top
            top--;
    }

    // To check if stack is empty or not
    boolean empty() {
        return top == -1;
    }

    // To print the stack
    public String toString() {
        String Ans = "";
        for (int i = 0; i < top; i++) {
            Ans += String.valueOf(A.get(i)) + "->";
        }

        Ans += String.valueOf(A.get(top));
        return Ans;
    }
}





