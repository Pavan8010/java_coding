package com.company;

public class Recurssion {
    public static void main(String[] args) {
//        int n = 5;
//        print(n);

//        int a = fibonacci(10);
//        System.out.println("nth fibonacci number is:" + a);

//        int n = 6;
//        int ans = fact(n);
//        System.out.println("factorial of a number is :" + ans);

//        int n = 2568;
//        int ans = digitsum(n);
//        System.out.println("sum of the digits is : " + ans);

//        int n = 2554;
//        int ans = digitprod(n);
//        System.out.println("sum of the digits is : " + ans);


        int n = 1234;
        rev1(n);
        System.out.println(revnum);

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

    //factorail of a number
    static int fact(int n){
        if(n==0 || n==1){
            return 1;
        }
        return n * fact(n-1);
    }

    //sum of digits
    static int digitsum(int n){
        if(n==0){
            return 0;
        }
        return (n%10) + digitsum(n/10);
    }

    //product of digits
    static int digitprod(int n){
        if(n%10 == n){
            return n;
        }
        return (n%10) * digitprod(n/10);
    }

    //reverse a number
    static int revnum = 0;
    static void rev1(int n){
        if(n==0){
            return ;
        }
        int rem = n%10;
        revnum = revnum*10 + rem;
        rev1(n/10);
    }



}
