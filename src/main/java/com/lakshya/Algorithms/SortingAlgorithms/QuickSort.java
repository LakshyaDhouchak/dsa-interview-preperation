package com.lakshya.Algorithms.SortingAlgorithms;

public class QuickSort {
    // define the sort() methord
    public void sort(int[] arr, int l ,int h){
        // define the base condition
        if(l<h){
            int pivot = partiton(arr,l,h);
            sort(arr, l, pivot-1);
            sort(arr, pivot+1,h);
        }
    }

    // define the partion() methord
    public int partiton(int[] arr,int l,int h){
        // define the properties
        int pivot = arr[h];
        int low = l;
        int high = h-1;

        // define the condition
        while(low<=high){
            while(low<=high && arr[low]<=pivot){
                low++;
            }
            while(high>=low && arr[high]>pivot){
                high--;
            }
            if(low<high){
                int pointer = arr[low];
                arr[low] = arr[high];
                arr[high] = pointer;
                low++;
                high--;
            }
        }
        int pointer = arr[low];
        arr[low] = arr[h];
        arr[h] = pointer;
        return low;

    }
}
