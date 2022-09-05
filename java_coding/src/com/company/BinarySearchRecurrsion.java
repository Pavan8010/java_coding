package com.company;

public class BinarySearchRecurrsion {
    public static void main(String[] args) {
        int[] arr = {1,5,10,12,15,20};
        int target = 120;
        int ans = BinarySearchRecc(arr,target,0,arr.length-1);
        System.out.println(ans);
    }
    static int BinarySearchRecc(int[] arr, int target,int start, int end){
        if(start>end){
            return -1;
        }
        int mid = start + (end-start)/2;
        if(arr[mid] == target){
            return mid;
        }
        if (target<arr[mid]){
            return BinarySearchRecc(arr, target, start,mid-1);
        }
        else{
            return BinarySearchRecc(arr, target, mid+1, end);
        }
    }
}

