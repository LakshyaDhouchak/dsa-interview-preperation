package com.lakshya.Algorithms.SearchingAlgorithms;

import java.util.Scanner;

public class BinarySearch {
    // calling the Scanner Class
    Scanner input =  new Scanner(System.in);

    // define the properties
    private int[] arr;
    @SuppressWarnings("unused")
    private int key;
    private int size;
    @SuppressWarnings("unused")
    private int length;
    @SuppressWarnings("unused")
    private int height;
    private int mid;

    // define the constructor
    public BinarySearch(int size,int key){
        // define the condition
        if(size<=0){
            throw new IllegalStateException("Array size can't be negative aur Zero");
        }
        this.key = key;
        this.size = size;
        this.arr =  new int[size];
        this.length = 0;
        this.height = size-1;
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
    public boolean Search(int l, int h,int key){
        // define the base condition
        if(l<=h){
            mid = l + (h-l)/2;
            // define the condition
            if(arr[mid] == key){
                return true;
            }
            else if(arr[mid]<key){
                Search(mid+1, h, key);
            }
            else{
                Search(l, mid-1, key);
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
