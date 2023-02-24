package com.company.AA;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {1, 31, 4, 42, 6, 3, 10, 99, 80, 5, 17};
        int n = arr.length;

        quicksort(arr,0,n-1);
        printarr(arr,n);
    }
    /* The main function that implements QuickSort
              arr[] --> Array to be sorted,
              low --> Starting index,
              high --> Ending index
     */
    static void quicksort(int[] arr,int low,int high){
        if(low<high){
            // pi is partitioning index, arr[p] is now at right place
           int pivot = partition(arr,low,high);
            // Separately sort elements before partition and after partition
            quicksort(arr,low,pivot-1);
            quicksort(arr,pivot+1,high);
        }
    }
    /* This function takes last element as pivot, places the pivot element at its correct position in sorted array,
       and places all smaller (smaller than pivot) to left of pivot and all greater elements to right of pivot */
    static int partition(int[] arr,int low,int high){
        int pivot = arr[high]; //pivot
        int i = low-1; // Index of smaller element and indicates the right position of pivot found so far
        for(int j=low;j<=high-1;j++){

            // If current element is smaller than the pivot
            if(arr[j] < pivot){
                i++; // Increment index of smaller element
                swap(arr,i,j);
            }
        }
        swap(arr,i+1,high);
        return i+1;
    }
    static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void printarr(int arr[], int N){
        System.out.println("Sorted array is");
        for (int i :arr)
            System.out.print(i+ " ");
        System.out.println();
    }
}
