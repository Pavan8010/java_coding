package com.company.BinarySearch;

import java.util.*;

public class Binary_Search {
    public static void main(String[] args) {
        int[] array = {1,2,5,10,10,10,12,18,20};
        int target = 9;
        int i = upper_bound(array,0,array.length-1,target); // correct working function for upper bound is
//        int i = lower_bound(array,target);
        System.out.println(i+  " " + array[i]);

//        int ans = binarysearch(array,target) ;

    }
    static int binarysearch(int[] arr , int target){
        int start =0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + (end-start)/2; //  (start + end)/2
            if(target<arr[mid]){
                end = mid-1;
            }
            else if(target>arr[mid]){
                start = mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
    static int upper_bound(int arr[], int l, int r, int x){
        while(l <= r){
            int mid = l + (r-l)/2;
            if(arr[mid] == x){
                return mid;
            }
            else if(arr[mid] < x){
                if(arr[mid+1] > x){
                    return mid+1;
                }
                l = mid+1;
            }
            else {
                r = mid-1;
            }
        }
        return -1;
    }
    static int lower_bound(int[] arr,int target){
        int index = Arrays.binarySearch(arr, target);
        int upperBound;
        if (index >= 0) {
            // target value found, so search for upper bound
            while (index < arr.length && arr[index] == target) {
                index++;
            }
            upperBound = index - 1;
        } else {
            // target value not found
            int insertionPoint = -(index + 1);
            upperBound = insertionPoint - 1;
        }
        return upperBound;
    }

    /*


    static int  upper_bound(int arr[], int key){
        int upperBound = 0;
        while (upperBound < arr.length) {
            // If current value is lesser than or equal to key
            if (arr[upperBound] <= key)
                upperBound++;
                // This value is just greater than key
            else{
//                System.out.print("The upper bound of " + key + " is " + arr[upperBound] + " at index " + upperBound);
                return upperBound;
            }
        }
//        System.out.print("The upper bound of " + key + " does not exist.");
        return -1;
    }

    static int upperBound(int[] arr, int searchValue) {
        int left = 0;
        int right = arr.length - 1;
        int upperBound = arr.length;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] > searchValue) {
                upperBound = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return upperBound;
    }
    */ // function does not work properly


}
