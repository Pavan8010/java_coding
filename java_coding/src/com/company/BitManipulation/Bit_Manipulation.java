package com.company.BitManipulation;

public class Bit_Manipulation {
    public static void main(String[] args) {
//        int n = 10;
//        int[] nums = {2,4,5,2,5,6,4};
//        System.out.println("is tha num is odd: "+isodd(n));
//        System.out.println("unique ele in array is " + findunique(nums));
//        System.out.println(n<<4);
//
//        int m = 10; // 1010
//        int p = m>>>1; // 101 ----> it drops the ont bit from end
//        System.out.println(p);
//
//        String str = Integer.toBinaryString(m);
//        String s = "10";
//        int sum = Integer.b;
//        System.out.println(sum);
        double q =Math.log(8) / Math.log(2);
        System.out.println(q);
        System.out.println();

    }

    private static int findunique(int[] nums) {
        int curr = 0;
        for(int n:nums){
            curr = curr^n;
        }
        return curr;
    }

    private static boolean isodd(int n) {
        int lsb = n&1;
        return lsb==1;
    }


}
