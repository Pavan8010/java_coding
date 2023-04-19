package com.company;

import java.util.ArrayList;
import java.util.Stack;

public class SubSequence {
    public static void main(String[] args) {
        //method1
//         subseq("","abac");

        //method 2
        ArrayList<String> ans = subseqlist("","bbbab");
        System.out.println(ans);
//        String str = "pavan";
//        System.out.println(str.substring(1,4));
//        int[] arr = {1,2,3,4};
//        Stack<Integer> st = new Stack<>();
//        st.push(10);
//        st.push(20);
//        ArrayList<Integer> list = new ArrayList<>(st);
//        System.out.println(st);
    }
    static void subseq(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        subseq(p + ch , up.substring(1));  //either we take it
        subseq(p , up.substring(1));        //or we ignore it
    }

    static ArrayList<String> subseqlist(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);

        ArrayList<String> left = subseqlist(p + ch, up.substring(1));  //either we take it
        ArrayList<String> right = subseqlist(p, up.substring(1));        //or we ignore it
        left.addAll(right);
        return left;
    }
}
