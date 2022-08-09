package com.company;

import java.util.Random;
import java.util.Scanner;



// Method overloading
/*
//    static void name(int a){
//        System.out.println("hello " + a );
//    }
//    static void name(int a, int b){
//         System.out.println("hello " + a );
//    }
//    static void name(int a ,int b, int c){
//        System.out.println("hello " + a );
//    }
   public static void main(String[] args) {
  name(a:10);
  name(a:10 , b:20);
  name(a:10 , b: 20 , c: 30);
    }
    }
 */

// Variable Arguments (varargs)
/*
//    static int add(int ...arr){
//
//        int sum = 0;
//        for (int a : arr){
//            sum += a;
//        }
//        return sum;
//    }
  public static void main(String[] args) {
   System.out.println("The sum of 1 and 2 is: " + sum(...arr 1,2));
   System.out.println("The sum of 40 and 2 is: " + sum(...arr 40,2));
   System.out.println("The sum of 507 and 189 is: " + sum(...arr 507,189));
   System.out.println("The sum of 50 and 100 is: " + sum(...arr 50,100));
    }
 }
*/

// Recursion in java
/*    static int factorial_recursive(int n){
         if(n == 0 || n== 1){
             return  1;
         }
         else{
              return  n*factorial_recursive(n-1);
         }
     }
     static int factorial_iterative(int n){
        if(n == 0 || n== 1){
            return  1;
        }
        else{
            int prod = 1;
            for (int i= 1 ; i<= n ; i++) {
                prod *= i;
            }
            return prod;
        }
    }
      public static void main(String[] args) {
         int x = 5;
         int y = 6;
         System.out.println(factorial_recursive(x));
         System.out.println(factorial_iterative(y));
    }
}
 */

//Q1) Print Multipication Table
/*
    static void multiplication(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.format("%d X %d = %d\n", n, i, n * i);
        }
    }
  public static void main(String[] args) {
        multiplication(5);
    }
}
*/

//Q2) Print the following pattern
/*
//If n=5
//*
//**
//***
//****
//*****
 static void pattern(int n) {
        for (int i = 0; i <= n-1; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
 public static void main(String[] args) {
        pattern(5);
    }
}
*/

//Q3) Write a Recursive Function to calculate sum of first n Natural Number.
/*
static int sumRec(int n){
    if(n == 1){
        return 1;
    }
    else {
        return n + sumRec(n-1);
    }
}
 public static void main(String[] args) {
     System.out.println(sumRec(3));
    }
}
 */

//Q4) write s Function to Print nth term of Fibonacci Series using Recursive
/*
// fibonacci Series - 0,1,1,2,3,5,8,13...
 static int fibo(int n) {
    if (n == 1) {
        return 0;
    } else if (n == 2) {
        return 1;
    } else {
        return fibo(n - 1) + fibo(n - 2);
    }
}
public static void main (String[]args){
        int result = fibo(5);
        System.out.println(result);
    }
 }
*/


//Q5) Write a function to find average of a set of numbers passed as arguments.(WE USED VarArgs METHOD HERE)
/*
static int avarage(int... arr) {
         int avg=0;
         int favg=0;
        for (int a: arr) {
            avg += a;

            favg = avg / (arr.length);
        }
        return favg;
        }
public static void main(String[] args) {
    System.out.println(avarage(10,20,30,40,50));
    }
}
*/

//Q6) Repeat Q2 using Recursive.
/*
static void patternRec(int n) {
    if(n>0){
        patternRec(n - 1);
        for (int i = 0; i < n; i++) {
           System.out.print("*");
        }
        System.out.println("");
    }
}
public static void main(String[] args) {
        patternRec(5);
    }
}
*/


 // Q ) Create a class Game , which allows a user to play "Guess the number game once ."
     /* game should have the following methods
        1. Constructor to generate the random number
        2. takeUserInput() to take a user input of number
        3. isCorrectNumber() to detect wheather the number by the user is true
        4. getter and setter for noOfGusses
        use properties such as noOfGusses(int) , etc to get this task done!
      */
class  Main{
     public static void main(String[] args) {

     }





 }



