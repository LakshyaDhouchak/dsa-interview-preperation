package com.lakshya.Algorithms.SortingAlgorithms;

public class BubbleSort {

    // define the Sort() methord
    public void Sort(int[] arr , int size){
        // define the flag variable
        int flag = 0;
        // define the for-loop
        for(int i = 0;i<size-1;i++){
            // define the another for-loop
            for(int j = 0 ;j<size-i-1;j++){
                // define the condition
                if(arr[i]>arr[i+1]){
                    int pointer = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = pointer;
                    flag = 1;
                }
            }
            // define the condition
            if(flag == 0){
                return;
            }
        }
    }
}
