package com.company.Sort;
import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr= {3,5,4,2,1};
        cyclicsort(arr);
        System.out.println(Arrays.toString(arr));
    }
   static void cyclicsort(int[] arr) {
       int i = 0;
       while (i < arr.length) {
           int correct = arr[i] - 1;
           if (arr[i] != arr[correct]) {
               Swap(arr, i, correct);
           } else {
               i++;
           }
       }
   }

    static void Swap(int[] arr, int first , int second){
        int temp = arr[first];
        arr[first]= arr[second];
        arr[second]=temp;
    }

}
