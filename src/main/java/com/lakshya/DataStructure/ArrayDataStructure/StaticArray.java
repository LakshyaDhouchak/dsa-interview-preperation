package com.lakshya.DataStructure.ArrayDataStructure;

public class StaticArray<T> {

    // define the properties
    private T[] arr;
    private int capacity;
    private int size;

    // define the constructor
    @SuppressWarnings("unchecked")
    public StaticArray(int capacity){
        // define the condition
        if(capacity<=0){
            throw new IllegalStateException("Capacity must be positive");
        }
        this.arr = (T[]) new Object[capacity];
        this.capacity = capacity;
        this.size = 0;
    }

    // define the Add() methord
    public void add(T data){
        // define the condition
        if(capacity == size){
            throw new IllegalStateException("Array is full. Cannot add more element");
        }
        arr[size] = data;
        size++;

    }

    // define the insert() methord
    public void insert(int index , T data){
        // define the condition
        if(size == capacity){
            throw new IllegalStateException("Array is full. Cannot add more element");
        }
        if(index<0 || index>size){
            throw new IndexOutOfBoundsException("Index out of bound");
        }
        // define the for-loop
        for(int i = size ; i>index;i--){
            arr[i] = arr[i-1];
        }
        arr[index] = data;
        size++;
    }

    // define the delete() methord
    public T delete(int index){
        // define the condition
        if(index<0 || index>= size){
            throw new IndexOutOfBoundsException("Index out of bound");
        }
        T removedElem = arr[index];
        // define the for- loop
        for(int i = index;i<size-1;i++){
            arr[i] = arr[i+1];
        }
        arr[size-1] = null;
        size--;
        return removedElem;
    }

    // define the Get() methord
    public T get(int index){
        // define the condition
        if(index<0 || index>=size){
            throw new IllegalStateException("Index out of bound");
        }
        return arr[index];
    }

    // define the set() methord
    public void set(int index,T data){
        // define the condition
        if(index<0 || index>=size){
            throw new IllegalStateException("Index out of bound");
        }
        arr[index] = data;
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
    public boolean isFull(){
        return size == capacity;
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
