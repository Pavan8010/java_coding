package com.company;

import java.util.ArrayList;

public class Permutation {
    public static void main(String[] args) {
        //method 1
//        permutation("","ab");
//
//        //method 2
        ArrayList<String> ans = permutationList("","abc");
        System.out.println(ans);

//        int noOfPermutaion = permutationcount("","abc");
//        System.out.println(noOfPermutaion);


    }

    static void permutation(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        for (int i=0;i<=p.length();i++){
            String start = p.substring(0,i);
            String end = p.substring(i,p.length());
            permutation(start+ch+end,up.substring(1));
        }
    }

    static ArrayList<String> permutationList(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
//            System.out.println(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        char ch = up.charAt(0);
        for (int i=0;i<=p.length();i++){
            String start = p.substring(0,i);
            String end = p.substring(i,p.length());
            ans.addAll(permutationList(start+ch+end,up.substring(1)));
        }
        return ans;
    }

    static int permutationcount(String p,String up){
        if(up.isEmpty()){
            return 1;
        }
        char ch = up.charAt(0);
        int count =0;
        for (int i=0;i<=p.length();i++){
            String start = p.substring(0,i);
            String end = p.substring(i,p.length());
            count = count + permutationcount(start+ch+end,up.substring(1));
        }
        return count;
    }
}
