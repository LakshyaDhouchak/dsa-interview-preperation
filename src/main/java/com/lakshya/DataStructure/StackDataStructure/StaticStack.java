package com.lakshya.DataStructure.StackDataStructure;

public class StaticStack<T> {
    // define the properties
    private T[] arr;
    private int size;
    private int capacity;

    // define the constructor
    @SuppressWarnings("unchecked")
    public StaticStack(int initialCapacity){
        if(initialCapacity<0){
            throw new IllegalArgumentException("Capacity can't be negative");
        }
        this.arr = (T[]) new Object[initialCapacity];
        this.size = 0;
        this.capacity = initialCapacity;
    }

    // define the push() methord
    public void push(T element){
        // define the condition
        if(size == capacity){
            throw new IllegalStateException("Stack is Full. Can't add more element")
        }
        arr[size] = element;
        size++;
    }

    // define the Display() methord
    @Override
    public String toString(){
        StringBuilder sb =  new StringBuilder();
        sb.append("[");
        // define the for-loop
        for(int i = 0;i<size;i++){
            sb.append(arr[i]);
            if(i<size-1){
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    // define the pop() methord
    public T pop(){
        // define the condition
        if(size<=0){
            throw new IllegalStateException("Stack is Empty");
        }
        size--;
        T removeElem = arr[size];
        arr[size] = null; 
        return removeElem;
    }

    // define the peek() methord
    public T peek(){
        // define the condition
        if(size<=0){
            throw new IllegalStateException("Stack is Empty");
        }
        T removeElem = arr[size-1];
        return removeElem;
    }


    // define the isFull() methord
    public boolean isFull(){
        return size == capacity;
    }

    // define the getSize() methord
    public int getSize(){
        return size;
    }

    // define the isEmpty() methord
    public boolean isEmpty(){
        return size == 0;
    }

}
