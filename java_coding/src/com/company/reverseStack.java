package com.company;

import java.util.Stack;

public class reverseStack {
    public static void main(String[] args) {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        s1.push(1);
        s1.push(2);
        s1.push(3);
        s1.push(4);
        s1.push(5);
        s1.push(6);
        s1.push(7);
        s1.push(8);
        s1.push(9);
        s1.push(10);
        s1.push(11);

        System.out.println(s1.capacity());
//        System.out.println("Stack Before reversing:");
//        while (!s1.isEmpty()){
//            int top = s1.peek();
//            System.out.println(top);
//            s1.pop();
//        }
        //reverse the stack
        while (!s1.isEmpty()){
            int top = s1.pop();
            s2.push(top);
        }

        System.out.println("Reversed Stack: ");
        while (!s2.isEmpty()){
            int top = s2.peek();
            System.out.println(top);
            s2.pop();
        }
    }
}
