/* package codechef; // don't place package name! */
package com.company;
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class s2 {
    public static void main (String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int c=0,o=0,d=0,e=0,h=0,f=0;
            String[] string = new String [n];
            for (int i = 0; i < n; i++){
                string[i] = sc.nextLine();
                String str = string[i];
                int len = str.length();
                for (int j=0;j<len;j++){
                    if (string[i].charAt(j) =='c'){
                        c++;
                    }
                    if (string[i].charAt(j) =='o'){
                        o++;
                    }
                    if (string[i].charAt(j) =='d'){
                        d++;
                    }
                    if (string[i].charAt(j) =='e'){
                        e++;
                    }
                    if (string[i].charAt(j) =='h'){
                        h++;
                    }
                    // if (charAt(j) =='e'){
                    //     e++;
                    // }
                    if (string[i].charAt(j) =='f'){
                        f++;
                    }

                }
            }
            int count=0;
            // while(c<2 || o==0 || d==0 || e<2 || h==0 || f==0)
            while (c>=2 && o>=1 && d>=1 && e>=2 && h>=1 && f>=1){
                c = c-2;
                o--;
                d--;
                e = e-2;
                h--;
                f--;
                count++;
            }
            System.out.println(count);
        }
    }
}