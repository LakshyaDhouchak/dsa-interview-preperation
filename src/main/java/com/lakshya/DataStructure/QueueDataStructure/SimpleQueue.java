package com.lakshya.DataStructure.QueueDataStructure;

public class SimpleQueue<T> {
    
    // define the Node class
    static class Node<T>{
        // define the properties
        T data;
        Node<T> next;

        // define the constructor
        public Node(T data){
            this.data = data;
            this.next = null;
        }
    }

    // define the properties
    private Node<T> front;
    private Node<T> rear;
    private int size = 0;
    
    // define the create() methord
    public void enQueue(T data){
        // define the node
        Node<T> newNode =  new Node<T>(data);
        // define the condition
        if(front == null && rear == null){
            front = newNode;
            rear = newNode;
        }
        else{
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    }

    // define the isEmpty() methord
    public boolean isEmpty(){
        return front == null && rear == null;
    }

    // define the methord
    public int getSize(){
        return size;
    }

    // define the toString() methord
    @Override
    public String toString() {
        if (isEmpty()) {
            return "Queue []";
        }
        
        StringBuilder sb = new StringBuilder("Queue [FRONT -> ");
        Node<T> current = front;
        
        while (current != null) {
            sb.append(current.data);
            if (current.next != null) {
                sb.append(" -> ");
            }
            current = current.next;
        }
        sb.append(" <- REAR]");
        return sb.toString();
    }

    // define the peek() methord
    public T peek(){
        // define the condition
        if(isEmpty()){
            throw new IllegalStateException("Queue is Empty");
        }
        return front.data;
    }

    // define the deQueue() methord
    public T deQueue(){
        // define the condition
        if(isEmpty()){
            throw new IllegalStateException("Queue is Empty");
        }
        T removedElem = front.data;
        front = front.next;
        size--;
        return removedElem;
    }
}
