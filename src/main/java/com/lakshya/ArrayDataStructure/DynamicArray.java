package com.lakshya.ArrayDataStructure;

public class DynamicArray<T> {
    
    // define the properties
    private T[] arr;
    private int capacity;
    private int size;
    private static final int DEFAULT_CAPACITY = 4;

    // define the constructor
    @SuppressWarnings("unchecked")
    public DynamicArray(){
        this.arr = (T[]) new Object[DEFAULT_CAPACITY];
        this.capacity = DEFAULT_CAPACITY;
        this.size = 0;
    }
    @SuppressWarnings("unchecked")
    public DynamicArray(int initialCapacity){
        // define the condition
        if(initialCapacity<0){
            throw new IllegalArgumentException("It should be positive");
        }
        this.arr = (T[]) new Object[initialCapacity];
        this.capacity = initialCapacity;
        this.size = 0;
    }

    // define the reSize() methord
    @SuppressWarnings("unchecked")
    public void reSize(){
        int initialcapacity = capacity *2;
        T[] newArr = (T[]) new Object[initialcapacity];
        // define the for-loop
        for(int i = 0;i<size;i++){
            newArr[i] = arr[i];
        }
        arr = newArr;
        capacity = initialcapacity;
        newArr = null;
    }

    // define the add() methord
    public void add(T data){
        // define the condition
        if(size == capacity){
            reSize();
        }
        arr[size] = data;
        size++;
    }

    // define the delete() methord
    public T delete(int index){
        // define the condition
        if(index < 0 || index>size){
            throw new IndexOutOfBoundsException("Index Out of bound");
        }
        T removedElem = arr[index];
        // define the for- loop
        for(int i = index ;i<size-1;i++){
            arr[i] = arr[i+1];
        }
        arr[index] = null;
        size--;
        return removedElem;
    }

    // define the insert() methord
    public void insert(int index , T data){
        // define the condition
        if(index<0 || index>size){
            throw new IllegalStateException("Index Out of bound");
        }
        if(size == capacity){
            reSize();
        }
        // define the for-loop
        for(int i = size;i>index;i--){
            arr[i] = arr[i-1];
        }
        arr[index] = data;
        size++;
    }

    // define the getSize() methord
    public int getSize(){
        return size;
    }

    // define the getCapacity() methord
    public int getCapacity(){
        return capacity;
    }

    // define the isFull() methord
    public boolean isEmpty(){
        return size == capacity;
    }

    // define the get() methord
    public T get(int index){
        // define the condition
        if(index<0 || index>size){
            throw new IndexOutOfBoundsException("Index out of bound");
        }
        return arr[index];
    }

    // define the set() methord
    public void set(int index, T data){
        // define the condition
        if(index<0 || index>size){
            throw new IndexOutOfBoundsException("Index Out of Bound");
        }
        arr[index] = data;
    }

    // define the toString() methord
    @Override
    public String toString(){
        // define the condition
        StringBuilder sb = new StringBuilder();
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
}
