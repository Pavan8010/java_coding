package com.company.LinkedList;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class LL_Q1 {
    public static void main(String[] args) {
//Q1
/*
//Q) Make a linked list & add the following elements to it:(1,5,,7,3,8,2,3) & search for the number 7 and display its index
        int target = 7;
        LinkedList<Integer> list = new LinkedList<>();
        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(8);
        list.addFirst(3);
        list.addFirst(7);
        list.addFirst(5);
        list.addFirst(1);
        System.out.println(list);
        if(!list.contains(target)){
            System.out.println("list does not contain the " + target);
        }
        for (int i = 0; i < list.size() ; i++) {
            if (list.get(i) == target){
                System.out.println( "index of the " + target + " in the linked list is " + i);
                break;
            }
        }

 */
//Q2
//Take elements (numbers in the range of 1 - 50) of a linked list as input from the user and delete all nodes which have values greater tahan 25
    Scanner sc = new Scanner(System.in);
    LinkedList<Integer> list = new LinkedList<>();
        System.out.println("Enter the numbers from 1-50 : ");
        for (int i = 0; i <5 ; i++) {
            int n = sc.nextInt();
            list.add(n);
        }
        System.out.println(list);
        for (int i = 0; i < list.size() ; i++) {
            if(list.get(i) >25){
                list.remove(i);
            }
        }
        System.out.println(list);
//        Collections.reverse(list); // to reverse the linked list...
//        System.out.println(list);


        list = reverseLinkedList(list);
        System.out.println("reversed limked list : " + list);
    }

    private static LinkedList<Integer> reverseLinkedList(LinkedList<Integer> list) {
        for (int i = 0; i < list.size()/2 ; i++) {
            int temp = list.get(i);
            list.set(i,list.get(list.size()-1-i));
            list.set(list.size()-1-i,temp);
        }
        return list;
    }
}
