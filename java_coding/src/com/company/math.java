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

