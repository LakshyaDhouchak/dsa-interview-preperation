package com.lakshya.DataStructure.QueueDataStructure;

public class CircularQueue<T> {
     
    // define the properties
    private T[] arr;
    private final int capacity; 
    private int front;
    private int rear;

    // define the constructor
    @SuppressWarnings("unchecked")
    public CircularQueue(int initialCapacity){
        if(initialCapacity <= 0){
            throw new IllegalArgumentException("Capacity can't be negative or zero");
        }
        this.arr = (T[]) new Object[initialCapacity];
        this.capacity = initialCapacity;
        this.rear = -1;
        this.front = -1;
    }

    // define the getCapacity() methord
    public int getCapacity(){
        return capacity;
    }
    
    // define the getSize() method
    public int getSize() {
        if (front == -1) return 0;
        if (rear >= front) {
            return rear - front + 1;
        } else {
            return capacity - front + rear + 1; 
        }
    }
    
    // define the isEmpty() methord
    public boolean isEmpty(){
        return front == -1;
    }

    // define the isFull() method (Helper for clarity)
    public boolean isFull(){
        return (front == 0 && rear == capacity - 1) || (front == rear + 1);
    }

    // define the EnQueue() methord
    public void Enqueue(T data){
        if(isFull()){
            throw new IllegalStateException("Queue is full");
        }
        
        if(isEmpty()){ 
            front = 0;
            rear = 0;
        } 
        else if(rear == capacity-1){ 
            rear = 0;
        }
        else{
            rear++;
        }
        arr[rear] = data;
    }

    // define the deQueue() methord
    public T deQueue(){
        if(isEmpty()){ 
            throw new IllegalStateException("Queue is Empty");
        }
        
        T removeElem = arr[front];
        arr[front] = null; 
        
        if(front == rear){
            front = -1;
            rear = -1;
        } 
        else if(front == capacity-1){ 
            front = 0;
        }
        else{
            front++;
        }
        return removeElem;
    }

    // define the toString() methord: 
    @Override
    public String toString(){
        if(isEmpty()){
            return "Queue is: []";
        }
        
        StringBuilder sb = new StringBuilder("Queue is: [");
        int currentSize = getSize(); 
        
        for(int i = 0; i < currentSize; i++){
            int index = (front + i) % capacity;
            
            sb.append(arr[index]);
            if(i < currentSize - 1){
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}