package com.company;

import java.util.ArrayList;

public class SubSequence {
    public static void main(String[] args) {
        //method1
        // subseq("","abc");

        //method 2
        ArrayList<String> ans = subseqlist("","abc");
        System.out.println(ans);

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
