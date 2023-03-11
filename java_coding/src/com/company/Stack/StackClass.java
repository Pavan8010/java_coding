package com.company.Stack;
import  java.util.*;

public class StackClass {
    public static void pushAtBottom(int data,Stack<Integer> s){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(data, s);
        s.push(top);

    }
    public static void reverse(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top = s.pop();
        reverse(s);
        pushAtBottom(top,s);
    }
    public static void main(String[] args) {

        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.add(3,5);
        System.out.println("index of 3 is " + s.search(3));
        System.out.println("size of the stack is " + s.size());

        //s.clear(); //delete the whole stack

        pushAtBottom(8,s); // push at bottom function
        reverse(s);

        while (!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}