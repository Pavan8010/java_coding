package com.company;

import java.util.Collections;
import java.util.LinkedList;

public class linkedList {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.addFirst("a");
        list.addFirst("is");
        System.out.println(list);
        list.addLast("list");
        list.addFirst("this");
        System.out.println(list);

        list.add(3,"linked");
        System.out.println(list);

        System.out.println(list.get(0));
        System.out.println(list.size());
        list.removeFirst();
        list.removeLast();
        System.out.println(list);
        System.out.println(list.getFirst());
        list.push("this");
        System.out.println(list);

        Collections.reverse(list);
        System.out.println(list);

    }
}
