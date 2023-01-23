package com.company;

public class tp {
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(strs));
    }
    public static String longestCommonPrefix(String[] strs) {
        String str = strs[0];
        if(strs.length == 1){
            return strs[0];
        }
        for (int i = 0; i < strs.length; i++){
            if(strs[i].isEmpty()){
                return "";
            }
            if(str.charAt(0) != strs[i].charAt(0)){
                return "";
            }
        }
        for (int j = 1;  j < strs.length; j++){
            while (strs[j].indexOf (str) != 0){
                str = str.substring(0,str.length()-1);
            }
        }
        return str;
    }
}
