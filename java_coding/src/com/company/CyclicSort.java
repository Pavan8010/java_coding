package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr= {3,5,4,2,1};
//        cyclicsort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public List<Integer> findDisappearedNumbers(int[] arr) {
        int i =0;
        while(i< arr.length){
            int correct = arr[i] - 1;
            if(arr[i] != arr[correct]){
                Swap(arr, i , correct);
            }
            else {
                i++;
            }
        }
        List<Integer> ans= new ArrayList<>();
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index+1){
                ans.add(index +1 ) ;
            }
        }
        return ans;
    }

    static void Swap(int[] arr, int first , int second){
        int temp = arr[first];
        arr[first]= arr[second];
        arr[second]=temp;
    }

}
