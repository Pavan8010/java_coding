package com.company;

public class Recurssion {
    public static void main(String[] args) {
//        int n = 5;
//        print(n);

//        int a = fibonacci(10);
//        System.out.println(a);


    }
    //printing a 5 4 3 2 1
    static void print(int n) {
        if (n == 0) {
            return;
        }
        System.out.print(n + " ");
        print(n-1);
    }

    //find nth fibonacci number
    static int fibonacci(int n){
        if(n<2){
            return n;
        }
        return fibonacci(n-1)+ fibonacci(n-2);
    }

}
