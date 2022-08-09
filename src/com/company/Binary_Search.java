package com.company;

public class Binary_Search {
    public static void main(String[] args) {
        int[] array = {1,2,5,10,12,18,20};
        int target = 10;
        int ans = binarysearch(array,target) ;
        System.out.println(ans);

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
}
