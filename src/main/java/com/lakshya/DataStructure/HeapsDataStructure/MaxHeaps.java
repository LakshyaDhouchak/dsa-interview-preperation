package com.lakshya.DataStructure.HeapsDataStructure;

public class MaxHeaps {
    // define the properties
    private int[] arr;
    private int size;
    private int index;

    // define the constructor
    public MaxHeaps(int size){
        // define the condition
        if(size<=0){
            throw new IllegalStateException("Array size can't be negative aur Zero");
        }
        this.arr = new int[size];
        this.index = 0;
    }

    // define the some common methord

    // parent 
    public int getParent(int index){
        return (index-1)/2;
    }

    // left child
    public int getLeftChild(int index){
        return 2*index+1;
    }

    //right child
    public int getRightChild(int index){
        return 2*index+2;
    }

    // define the swap() methord
    public void swap(int i, int j){
        int pointer = arr[i];
        arr[i] = arr[j];
        arr[j] = pointer;
    }

    // define the Insert() methord
    public void insert(int data){
        // define the condition
        if(index == size ){
            throw new IllegalStateException("Heap is Full");
        }
        arr[index] = data;
        int i = index;
        index++;

        // define the approch to Implement MAX heap
        while(i!=0 && arr[i]>arr[getParent(i)]){
            swap(i, getParent(i));
            i = getParent(i);
        }
    }

    // define the isEmpty() methord
    public boolean isEmpty(){
        return index == 0;
    }

    // define the MaxElement() methord
    public int MaxElement(){
        // define the condition
        if(index == 0){
            throw new IllegalStateException("MAX Heap is Empty");
        }
        return arr[0];
    }

    // define the display() methord
    public void display(){
        System.out.println("The element present in heap is:");
        // define the for-loop
        for(int i = 0;i<index;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    // define the display() methord
    public int delete(){
        // define the condition
        if(index == 0){
            throw new IllegalStateException("MAX Heap is Empty");
        }
        int data = arr[0];
        arr[0] = arr[index-1];
        index--;
        heapify(0);
        return data;
    }

    // define the heapify() methord
    public void heapify(int i){
        int largest = i;
        int left = getLeftChild(i);
        int right = getRightChild(i);

        // define the condition
        if(left<index && arr[i]<arr[left]){
            largest = left;
        }
        if(right<index && arr[i]<arr[right]){
            largest = right;
        }

        // define the base condition
        if(largest !=i){
            swap(i,largest);
            heapify(largest);
        }
    }

}
