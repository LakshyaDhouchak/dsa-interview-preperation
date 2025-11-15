package com.lakshya.Algorithms.SearchingAlgorithms;

import java.util.Scanner;

public class LinearSearch {

    // calling the Scanner Class
    Scanner input =  new Scanner(System.in);

    // define the properties
    private int[] arr;
    private int key;
    private int size;

    // define the constructor
    public LinearSearch(int size,int key){
        // define the condition
        if(size<=0){
            throw new IllegalStateException("Array size can't be negative aur Zero");
        }
        this.key = key;
        this.size = size;
        this.arr =  new int[size];
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

    // define the Search() methord
    public boolean Search(){
        // define the for-loop
        for(int i = 0;i<size;i++){
            // define the condition
            if(arr[i] == key){
                return true;
            }
        }
        return false;
    }

    // define the display() methord
    public void display(){
        System.out.println("The element present in an array is:");
        // define the for-loop
        for(int i = 0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
