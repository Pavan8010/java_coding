package com.company;

import java.util.LinkedList;

public class LL {
    NODE head;
    private int size;
    LL(){
        this.size = 0;
    }
    class NODE{
        String data;
        NODE next;
        NODE(String data){
            this.data=data;
            this.next=null;
            size++;
        }
    }
    //adding node to the starting of the ll
    public void addFirst(String data){
        NODE newnode = new NODE(data);
        if (head==null){
            head = newnode;
            return;
        }
        newnode.next=head;
        head = newnode;
    }

    //adding node to the end of the list
    public void addLast(String data){
        NODE newnode = new NODE(data);
        if (head==null){
            head = newnode;
            return;
        }
        NODE currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }
        currNode.next=newnode;
    }

    //print the ll
    public void printlist(){
        if(head == null){
            System.out.println("the list is empty");
            return;
        }
        NODE currNode = head;
        while(currNode != null){
            System.out.print(currNode.data + " --> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }

    public void deleteFirst(){
        if(head == null){
            System.out.println("the list is empty");
            return;
        }
        size--;
        head = head.next;
    }
    public void deleteLast(){
        if(head == null){  //empty ll
            System.out.println("the list is empty");
            return;
        }
        size--;
        if(head.next == null){ // ll with only one node
            head = null;
            return;
        }
        NODE secondLast = head;
        NODE lastNode = head.next;
        while(lastNode.next != null){
            secondLast = secondLast.next;
            lastNode = lastNode.next;
        }
        secondLast.next = null;
    }
    public int getSize(){
        return size;
    }

    public static void main(String[] args) {
        LL list = new LL();
        list.addFirst("a");
        list.addFirst("is");
        list.printlist();

        list.addLast("list");
        list.printlist();
        list.addFirst("this");
        list.printlist();

        list.deleteFirst();
        list.printlist();

        list.deleteLast();
        list.printlist();

        System.out.println(list.getSize());
        list.addFirst("This");
        System.out.println(list.getSize());
//        list = reverseLinkedList(list);

    }

}
