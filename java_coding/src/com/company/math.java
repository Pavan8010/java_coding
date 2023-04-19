package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class math {
    public static void main(String[] args) {
//        System.out.println(Gcd(10,9));
//        int[][] arr = {{2,4}, {5,6},{1,5},{4,9}};
//        Arrays.sort(arr, (a,b) -> a[0] - b[0]);
//
//        System.out.println(arr);
//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(2);
//        list.remove(0);
//        list.add(0);
//
//        System.out.println(list);
//        StringBuilder sb = new StringBuilder();
//        sb.append("/");
        String str = "/../";
//        sb.append(str);
        String[] ch = str.split("/");
        String ans  = String.join( "/",ch);
        System.out.println(ans);
//        for(String s:ch){
//            System.out.println(s);
//        }
//        sb.deleteCharAt(n);
//        sb.length();
//        System.out.println(sb.toString());
    }
    static int countTrilingZeroes(int n){
        int count = 0;
        for(int i=5;i<=n;i=i*5){
            count = count + n/i;
        }
        return count;
    }
    static int GCD(int a,int b){
        int res = Math.min(a,b);
        while(res>0){
            if(a%res==0 && b%res==0){
                return res;
            }
            res--;
        }
        return res;
    }
    static int Gcd(int a,int b){
        /* Euclidean Algorithm */
        if(b==0){
            return a;
        }
        return Gcd(b,a%b);

    }
    static long binpow(long a, long b) {
        long res = 1;
        while (b > 0) {
            if ((b & 1) == 1) res *= a;
            a *= a;
            b >>= 1;
        }

        return res;
    }
    static int hcf(int a, int b) {
        if (b != 0) return hcf(b, a % b);
        else return a;
    }
    static int lcm(int a, int b) {
        int hcfV = hcf(a, b);
        return (a * b) / hcfV;
    }
    static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        if(n==2){
            return true;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}

