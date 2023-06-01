package com.shivanshpachnanda.MovieReservationSystem.src;

class Queue<T> {
    static class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    Node<T> front; // front shows the first row that is about to be dequeued
    Node<T> rear; //rear shows the last filled node

    Queue() {
        front = null;
        rear = null;
    }

    void enqueue(T data) {
        Node<T> newNode = new Node<>(data);
        if (front == null) { //empty queue
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode; 
        }
    }

    T dequeue() {
        T data = front.data;
        front = front.next;
        return data;
    }

    boolean isEmpty() {
        return front == null;
    }
}
