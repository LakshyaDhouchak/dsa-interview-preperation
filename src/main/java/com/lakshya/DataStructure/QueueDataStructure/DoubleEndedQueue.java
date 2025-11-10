package com.lakshya.DataStructure.QueueDataStructure;

public class DoubleEndedQueue<T> {
    
    // define the Node class
    static class Node<T>{
        // define the properties
        T data;
        Node<T> next;
        Node<T> prev;

        // define the constructor
        public Node(T data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    // define the properties
    private Node<T> front = null;
    private Node<T> rear = null;
    private int size = 0;

    // define the getSize() methord
    public int getSize(){
        return size;
    }

    // define the addFirst() methord
    public void addFirst(T data){
        //  calling the node class
        Node<T> newNode =  new Node<T>(data);

        // define the condition
        if(front == null && rear == null){
            front = newNode;
            rear = newNode;
        }
        else{
            newNode.next = front;
            front.prev = newNode;
            front =  newNode;
        }
        size++;
    }

    // define the addLast() methord
    public void addLast(T data){
        // calling the node class
        Node<T> newNode =  new Node<T>(data);

        // define the condition
        if(front == null && rear == null){
            front = newNode;
            rear =  newNode;
        }
        else{
            newNode.prev = rear;
            rear.next =  newNode;
            rear = newNode;
        }
        size++;
    }

    // define the removeFirst() methord
    public T firstRemove(){
        // define the condition
        if(front == null && rear == null){
            throw new IllegalStateException("deQueue is in underFlow condition");
        }
        T removedElem = front.data;
        if(front ==  rear){
            front = null;
            rear =  null;
        }
        else{
            front = front.next;
            front.prev = null;
        }
        size--;
        return removedElem;
    }

    // define the removeLast() methord
    public T LastRemove(){
        // define the condition
        if(front == null && rear == null){
            throw new IllegalStateException("deQueue is in underflow condition");
        }
        T removedElem = rear.data;
        if(front == rear){
            front = null;
            rear = null;
        }
        else{
            rear =  rear.prev;
            rear.next = null;
        }
        size--;
        return removedElem;
    }

    // define the isEmpty() methord
    public boolean isEmpty(){
        return front == null;
    }

    // define the toString() methord
    @Override
    public String toString(){
        // define the properties
        Node<T> duplicate = front;
        // calling the condition
        StringBuilder sb =  new StringBuilder("Double-Ended Queue : ");
        sb.append("[");
        // define the while loop
        while(duplicate != null){
            sb.append(duplicate.data);
            if(duplicate.next != null){
                sb.append(", ");
            }
            duplicate =  duplicate.next;
        }
        sb.append("]");
        return sb.toString();

    }

    // define the peekFirst() methord
    public T peekFirst(){
        // define the condition
        if(front == null){
            throw new IllegalStateException("DeQueue is Empty");
        }
        return front.data;
    }

    // define the peekLast() methord
    public T peekLast(){
        // define the condition
        if(front == null){
            throw new IllegalStateException("Dequeue is Empty");
        }
        return rear.data;
    }
}
