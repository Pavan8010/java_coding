package com.company;

import java.util.Iterator;
import java.util.Stack;
import  java.util.LinkedList;

class queueUSingArray{
    int front_Q,rear_Q ,capacityOfQueue;
    int[] q1;

    queueUSingArray(int size){
        capacityOfQueue = size;
        q1 = new int[capacityOfQueue];
    }
    void enqueue(int value){
        if(rear_Q == capacityOfQueue) {
            System.out.println("Queue is full,you can not insert the value");
        }
        else {
            q1[rear_Q] = value;
            rear_Q++;
        }
    }
    void dequeue(){
        if(rear_Q == 0){
            System.out.println("Queue is empty,there is nothing to delete");
        }
        else {
            for (int i=0;i<rear_Q-1;i++){
                q1[i] =q1[i+1];
            }
            rear_Q--;
        }
    }
    void display(){
        if(rear_Q == 0){
            System.out.println("Queue is empty,nothing to display");
        }
        else {
            for (int i=0;i<rear_Q;i++){
                System.out.print(q1[i]+" ");
            }
        }
    }
}


public class DSA {
    public static void main(String[] args) {
 // STACK
      /*
        Stack<Integer> s1 = new Stack<>();
        //Inserting elements in the Stack
        s1.push(5 );
        s1.push(4);
        s1.push(3 );
        s1.push(2);
        s1.push(1);
        System.out.println(s1);

        // Deleting elements from stack
        s1.pop();      // Last in first out is used
        System.out.println(s1);
        s1.pop();
        System.out.println(s1);

        //peek operation
        System.out.println("peek element in stack is "+ s1.peek()); // Top most element in the stack
        // isempty operation
        boolean status = s1.empty();
        System.out.println(status);
       // search operation
        int indexfound = s1.search(3);
        System.out.println("index of the element is "+ indexfound);

        //how to iterate over a stack
        Iterator it = s1.iterator();
        System.out.print("elements in the stack: ");
        while (it.hasNext()){
            Object s2 = it.next();
            System.out.print(s2 + " ");
        }
        System.out.println();
        System.out.println("size of the stack is " + s1.size()); // size of stack

         //sorting operation
        s1.sort(null);
        System.out.println("sorted stack is "+ s1);
  */

 // QUEUE
   /*
    queueUSingArray qe = new queueUSingArray(5);
    qe.enqueue(1);
    qe.enqueue(2);
    qe.enqueue(3);
    qe.enqueue(4);
    qe.enqueue(5);
    qe.display();
    System.out.println();
    qe.dequeue(); // in queue FIFO method is used
    qe.dequeue();
    qe.display();
    */

// LINKED LIST
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
