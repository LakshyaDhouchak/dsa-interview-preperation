package com.lakshya.Algorithms.SortingAlgorithms;

public class MergeSort {

    // define the sort() methord
    public void sort(int[] arr, int l , int h){
        int mid = 0;
        // define the base condition
        if(l<h){
            mid = l+(h-l)/2;
            sort(arr, l, mid);
            sort(arr,mid+1,h);
            merge(arr,l,h,mid);
        }
    }

    // define the merge() methord
    public void merge(int[] arr, int l ,int h,int mid){
        // define the properties
        int l1 = mid-l+1;
        int l2 = h-mid;
        int i = 0;
        int j = 0;
        int k = l;

        int[] left = new int[l1];
        int[] right = new int[l2];
        // define the for-loop
        for(i = 0;i<l1;i++){
            left[i] = arr[l+i];
        }
        for(j = 0;j<l2;j++){
            right[j] = arr[j+mid+1];
        }
        
        while(i<l1 && j<l2){
            // define the condition
            if(left[i]<=right[j]){
                arr[k++] = left[i++];
            }
            else{
                arr[k++] = right[j++];
            }
        }
        while(i<l1){
            arr[k++] = left[i++];
        }
        while(j<l2){
            arr[k++] = right[j++];
        }
        
    }
}
