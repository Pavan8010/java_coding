package com.company.AA;

public class BuildHeap {
    public static void main(String args[]) {
        int arr[] = {1, 3, 5, 4, 6, 13, 10, 9, 8, 15, 17};
        int N = arr.length;
        buildHeap(arr, N);
        printarr(arr, N);
    }
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

    static void buildHeap(int arr[], int N){
        int startIdx = (N / 2) - 1;
        for (int i = startIdx; i >= 0; i--) {
            heapify(arr, N, i);
        }
    }

    static void printarr(int arr[], int N){
        System.out.println("Array representation of Heap is:");
        for (int i :arr)
            System.out.print(i+ " ");
        System.out.println();
    }
}