package com.company.AA;

import java.util.Random;

public class QuickSortRand {
    public static void main(String[] args) {
        int arr[] = {1, 31, 4, 42, 6, 3, 10, 99, 80, 5, 17};
        int n = arr.length;
        quicksortrand(arr,0,n-1);
        printarr(arr,n);
    }
    static void quicksortrand(int[] arr,int low,int high){
        if(low<high){
            int pi = partition(arr,low,high);

            quicksortrand(arr,low,pi-1);
            quicksortrand(arr,pi+1,high);
        }
    }
    static int partition(int[] arr,int low,int high){
        random(arr,low,high);
        int pi = arr[high];
        int i=low-1;
        for(int j=low;j<high;j++){
            if(arr[j]<pi){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
        return i+1;
    }
    static void random(int[] arr,int low,int high){
        Random rand = new Random();
        int pivot = rand.nextInt(high-low)+low;
        int temp = arr[pivot];
        arr[pivot] = arr[high];
        arr[high] = temp;
    }
    static void printarr(int arr[], int N){
        System.out.println("Sorted array is");
        for (int i :arr)
            System.out.print(i+ " ");
        System.out.println();
    }
}
