package com.company.Heap;

public class HeapSort {
    public static void main(String[] args) {
        int arr[] = {1, 3, 5, 4, 6, 13, 10, 9, 8, 15, 17};;
        int N = arr.length;
        heapSort(arr, N);
        printHeap(arr, N);
    }
    static void heapSort(int[] arr,int n){
        // Build heap (rearrange array)
        int start = (n/2)-1;
        for(int i=start;i>=0;i--){
            heapify(arr,n,i);
        }

        // One by one extract an element from heap
        // delete the top of tree and put it on the last
        for(int i=n-1;i>=0;i--){
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            // One by one extract an element from heap
            heapify(arr,i,0);
        }
    }
    // To heapify a subtree rooted with node i which is an index in arr[]. n is size of heap
    static void heapify(int arr[], int N, int i){
        int largest = i; // intialize largest as a root
        int l = 2 * i + 1; // left child = 2*i + 1
        int r = 2 * i + 2; // right child = 2*i + 2

        // If left child is larger than root
        if (l < N && arr[l] > arr[largest])
            largest = l;
        // If right child is larger than largest so far
        if (r < N && arr[r] > arr[largest])
            largest = r;

        // If largest is not root
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
            // Recursively heapify the affected sub-tree
            heapify(arr, N, largest);
        }
    }

    static void printHeap(int arr[], int N){
        System.out.println("Sorted array is");
        for (int i :arr)
            System.out.print(i+ " ");
        System.out.println();
    }
}
