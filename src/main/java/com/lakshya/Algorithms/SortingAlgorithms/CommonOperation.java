package com.lakshya.Algorithms.SortingAlgorithms;

import java.util.Scanner;

public class CommonOperation {
    // calling the Scanner
    Scanner input =  new Scanner(System.in);
    
    // define the properties
    private int[] arr;
    private int size;

    // define the constructor
    public CommonOperation(int size){
        // define the condition
        if(size<=0){
            throw new IllegalStateException("Array Size can't be negative aur Zero");
        }
        this.arr =  new int[size];
        this.size = size;
    }

    // define the create() methord
    public void create(){
        // define the for-loop
        for(int i = 0;i<size;i++){
            System.out.println("Enter the data:");
            int data = input.nextInt();
            arr[i] = data;
        }
    }

    // define the display() methord
    public void display(){
        System.out.println("The element present in an array:");
        // define the for-loop
        for(int i = 0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
