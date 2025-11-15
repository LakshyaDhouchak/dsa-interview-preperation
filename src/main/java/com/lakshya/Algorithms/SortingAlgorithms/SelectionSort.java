package com.lakshya.Algorithms.SortingAlgorithms;

public class SelectionSort {

    // define the Sort() methord
    public void sort(int[] arr,int size){
        // define the for-loop
        for(int i = 0;i<size;i++){
            int min = i;
            // define the another-loop
            for(int j = i+1;j<size;j++){
                // define the condition
                if(arr[j]< arr[min]){
                    min = j;
                }
            }
            int pointer = arr[min];
            arr[min] = arr[i];
            arr[i] = pointer;
        }
    }
}
