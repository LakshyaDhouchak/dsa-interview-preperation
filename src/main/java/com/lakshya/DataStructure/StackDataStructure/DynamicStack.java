package com.lakshya.DataStructure.StackDataStructure;

public class DynamicStack<T> {
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
    private Node<T> head;
    private int size = 0;

    // define the push() methord
    public void push(T data){
        // define the consition
        Node<T> newNode = new Node<T>(data);
        newNode.next = head;
        head = newNode;
        size++;
    }

    // define the pop() methord
    public T pop(){
        // define the condition
        if(size<=0){
            throw new IllegalStateException("Stack underflow condition. Stack is Empty");
        }
        T removedElem = head.data;
        head = head.next;
        size--;
        return removedElem;
    }

    // define the peek() methord
    public T peek(){
        // define the condition
        if(size<=0){
            throw new IllegalStateException("Stack underflow condition.Stack is Empty");
        }
        return head.data;
    }

    // define the getSize() methord
    public int getSize(){
        return size;
    }

    // define the isFull() methord
    public boolean isEmpty(){
        return size == 0;
    }

    @Override
    public String toString() {
        if (isEmpty()) {
            return "DynamicStack []";
        }
        
        StringBuilder sb = new StringBuilder("DynamicStack [TOP -> ");
        Node<T> current = head;
        
        // Traverse the list (stack) from top to bottom
        while (current != null) {
            sb.append(current.data);
            if (current.next != null) {
                sb.append(", ");
            }
            current = current.next;
        }
        sb.append("]");
        return sb.toString();
    }
}
