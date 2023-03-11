package com.company.Stack;
import java.util.Iterator;
import java.util.Stack;
public class stack {
    public static void main(String[] args) {

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

    }
}
