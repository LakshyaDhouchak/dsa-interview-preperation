package com.lakshya.Algorithms.SortingAlgorithms;

public class InsertionSort {

    // define the Sort() methord
    public void Sort(int[] arr, int size){
        // define the for-loop
        for(int i = 1;i<size;i++){
            int j = i-1;
            int key = arr[i];
            // define the another for-loop
            while(j>=0 && arr[j]>key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }
}
