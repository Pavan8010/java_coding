package com.company.BinarySearch;

public class Binary_Search {
    public static void main(String[] args) {
        int[] array = {1,2,5,10,12,18,20};
        int target = 17;
//        int ans = binarysearch(array,target) ;
        System.out.println(upper_bound2(array,0,array.length-1,target));
//          upper_bound2(array,target);
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
    static int upper_bound2(int arr[], int l, int r, int x){
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
}
