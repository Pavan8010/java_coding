package com.company;

public class orderAgnostic_BS {
    public static void main(String[] args) {
        int[] array = {10 , 9 ,8,5,4,3,-2,-10};
        int target=5;
        int ans=orderAgnosticBS(array,target);
        System.out.println(ans);

    }
    static int orderAgnosticBS(int[] arr , int target){
        int start =0;
        int end = arr.length-1;

        //find wheater array is sorted in asending or desending order
        boolean isAsc= arr[start]<arr[end];

        while(start<=end){
            int mid = start + (end-start)/2; //  (start + end)/2
            if(arr[mid] == target){
                return mid;
            }
            if(isAsc){
                if(target<arr[mid]){
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
            }
            else{
                if(target>arr[mid]){
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
            }
        }
        return -1;
    }
}
