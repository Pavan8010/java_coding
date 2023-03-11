package com.company.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class linked_list {
    public static void main(String[] args) {
        LinkedList<Integer> li = new LinkedList<>();
        //Adding elements to Linked list
        li.add(5);        //5
        li.add(10);       // 5 10
        li.add(15);       // 5 10 15
        li.add(2,50);  // 5 10 50 15 (it insert element at the index)
        //Removing elements from linked list
        li.remove(1); // 5 50 15
        // li.removeFirst();   // 50 15
        // li.removeLast();    // 50

        Iterator it = li.iterator();
        while (it.hasNext()){
            System.out.print(it.next() + " ");
        }
        //size of linked list
        System.out.println();
        System.out.println("size of linked list: "+ li.size());

        //Searching in the list
        boolean b1 = li.contains(50);
        System.out.println(b1);

        //copy elements from stack to linked list

        Stack<String> s1 = new Stack<>();
        LinkedList<String> l2 = new LinkedList<>();

        s1.push("hello");
        s1.push("Everyone");
        l2.addAll(s1);

        Iterator it2 = l2.iterator();
        while (it2.hasNext()){
            System.out.print(it2.next() + " ");
        }
        int a = 5;
        int b = 10;

    }

}
