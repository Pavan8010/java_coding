package com.company;

public class math {
    public static void main(String[] args) {
        System.out.println(Gcd(10,9));
        String temp = "pavan";
//        String ans = String.;
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
}
