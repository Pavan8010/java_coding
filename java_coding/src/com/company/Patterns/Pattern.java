package com.company.Patterns;

public class Pattern {
    public static void main(String[] args) {
        int n =5;
//        printSquare(n);
//        printTriangle(n);
//        printTrianglenum(n);
//        printTrianglesamesum(n);
//        printTriangle2rev(n);
//        printDiamond(n);
//        printTriangleoneside(n);
          printTriangleSpecial1(n);
    }
    static void printSquare(int n) {
        /*
        * * * * *
        * * * * *
        * * * * *
        * * * * *
        * * * * *
         */
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    static void printTriangle(int n) {
        /*
         *
         * *
         * * *
         * * * *
         * * * * *
         */
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    static void printTrianglenum(int n) {
        /*
        1
        1 2
        1 2 3
        1 2 3 4
        1 2 3 4 5
         */
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(j+1 + " ");
            }
            System.out.println("");
        }
    }

    static void printTrianglesamesum(int n) {
        /*
        1
        2 2
        3 3 3
        4 4 4 4
        5 5 5 5 5
         */
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(i+1 + " ");
            }
            System.out.println("");
        }
    }

    static void printTrianglerev(int n) {
        /*
         1 2 3 4 5
        1 2 3 4
        1 2 3
        1 2
        1
         */
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j<n-i){
                    System.out.print(j+1 + " ");
                }
            }
            System.out.println("");
        }
    }

    static void printTriangle2(int n) {
        /*
         *
         ***
         *****
         *******
         *********
         */
        int star = 1;
        for(int i=0;i<n;i++){
            int space = n-1-i;
            for(int j=0;j<space;j++){
                System.out.print(" ");
            }
            for(int j=0;j<star;j++){
                System.out.print("*");
            }
            star = star + 2;
            System.out.println("");
        }
    }

    static void printTriangle2rev(int n) {
        /*
         *********
         *******
         *****
         ***
         *
         */
        int star = 1+(n-1)*2; // 1 + 4*2 = 1+8 = 9
        int space = 0;
        for(int i=0;i<n;i++){
            // int space = n-1-i;
            for(int j=0;j<space;j++){
                System.out.print(" ");
            }
            for(int j=0;j<star;j++){
                System.out.print("*");
            }
            space++;
            star -= 2;
            System.out.println("");
        }
    }

    static void printDiamond(int n) {
        /*
             *
            * *
           * * *
          * * * *
         * * * * *
         * * * * *
          * * * *
           * * *
            * *
             *
         */
        int space = n-1;
        int star = 1;
        for(int i=0;i<n*2;i++){
            if(i<n){
                for(int j=0;j<space;j++){
                    System.out.print(" ");
                }
                for(int j=0;j<star;j++){
                    System.out.print("* ");
                }
                System.out.println("");
                space -= 1;
                star += 1;

            }
            else{
                if(i==n){
                    space = 0;
                    star = n;
                }
                for(int j=0;j<space;j++){
                    System.out.print(" ");
                }
                for(int j=0;j<star;j++){
                    System.out.print("* ");
                }
                System.out.println("");
                space += 1;
                star -= 1;
            }
        }
    }

    static void printTriangleoneside(int n) {
        /*
         *
         * *
         * * *
         * * * *
         * * * * *
         * * * *
         * * *
         * *
         *
         */
        int star =1;
        for(int i=0;i<(2*n)-1;i++){
            if(i<n){
                for(int j=0;j<star;j++){
                    System.out.print("* ");
                }
                System.out.println("");
                star++;
            }else{
                if(i==n){
                    star = n-1;
                }
                for(int j=0;j<star;j++){
                    System.out.print("* ");
                }
                System.out.println("");
                star--;
            }
        }
    }

    static void printTrianglebinary(int n) {
        /*
        1
        0 1
        1 0 1
        0 1 0 1
        1 0 1 0 1
         */
        int p = 1;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(p+" ");
                if(p==1)p=0;
                else p =1;
            }
            if(i%2==1)p=1;
            else p=0;
            System.out.println("");
        }
    }

    static void printTrianglemirror(int n) {
        /*
        1                 1
        1 2             2 1
        1 2 3         3 2 1
        1 2 3 4     4 3 2 1
        1 2 3 4 5 5 4 3 2 1
         */
        int space = (n-1)*4;// 1 +4*4 = 17
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(j+1+ " ");
            }
            for(int j=0;j<space;j++){
                System.out.print(" ");
            }
            for(int j=i;j>=0;j--){
                System.out.print(j+1+ " ");
            }
            space -=4;
            System.out.println("");
        }
    }

    static void printTriangleseries(int n) {
        /*
        1
        2 3
        4 5 6
        7 8 9 10
        11 12 13 14 15
         */
        int p = 1;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(p + " ");
                p++;
            }
            System.out.println("");
        }
    }

    static void printTrianglealpha(int n) {
        /*
        A
        AB
        ABC
        ABCD
        ABCDE
         */
        char p ='A';
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(p);
                p++;
            }
            p = 'A';
            System.out.println("");
        }
    }

    static void printTrianglealpharev(int n) {
        /*
        ABCDE
        ABCD
        ABC
        AB
        A
         */
        char p ='A';
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                System.out.print(p);
                p++;
            }
            p = 'A';
            System.out.println("");
        }
    }

    static void printTrianglealphasame(int n) {
        /*
        A
        BB
        CCC
        DDDD
        EEEEE
         */
        char p ='A';
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(p);
            }
            p++;
            // p = 'A';
            System.out.println("");
        }
    }

    static void printTrianglealpha2(int n) {
        /*
           A
          ABA
         ABCBA
        ABCDCBA
         */
        char ch = 'A';
        int space = n-1;
        for(int i=0;i<n;i++){
            for(int j=0;j<space;j++){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print(ch);
                ch++;
            }
            ch--;
            for(int j=0;j<i;j++){
                ch--;
                System.out.print(ch);
            }
            // star += 2;
            space--;
            System.out.println("");
        }
    }

    static void printTrianglealphasamerev(int n) {
        /*
        E
        E D
        E D C
        E D C B
        E D C B A
         */
        char p = (char)('A' + n-1);
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(p + " ");
                p--;
            }
            // p++;
            p = (char)('A' + n-1);
            System.out.println("");
        }
    }

    static void printTriangleSpecial1(int n) {
        /*
         **********
         ****  ****
         ***    ***
         **      **
         *        *
         *        *
         **      **
         ***    ***
         ****  ****
         **********
         */
        int space = 0;
        int star = n;
        for (int i = 0; i < n * 2; i++) {
            if (i < n) {
                for (int j = 0; j < star; j++) {
                    System.out.print("*");
                }
                for (int j = 0; j < space; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < star; j++) {
                    System.out.print("*");
                }
                space += 2;
                star--;
                System.out.println("");
            } else {
                if (i == n) {
                    space -= 2;
                    star++;
                }
                for (int j = 0; j < i - n + 1; j++) {
                    System.out.print("*");
                }
                for (int j = 0; j < space; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < i - n + 1; j++) {
                    System.out.print("*");
                }
                space -= 2;
                star++;
                System.out.println("");
            }
        }
    }

    static void printTriangleSpecial2(int n) {
        /*
         *        *
         **      **
         ***    ***
         ****  ****
         **********
         ****  ****
         ***    ***
         **      **
         *        *
         */
        int star = 1;
        int space = (n-1)*2; // 0 + 4*2 = 8
        for(int i=0;i<(n*2)-1;i++){
            if(i<n){
                for(int j=0;j<star;j++){
                    System.out.print("*");
                }
                for(int j=0;j<space;j++){
                    System.out.print(" ");
                }
                for(int j=0;j<star;j++){
                    System.out.print("*");
                }
                space -=2;
                star++;
                System.out.println("");
            }else{
                if(i==n){
                    space = 2;
                    star = n-1;
                }
                for(int j=0;j<star;j++){
                    System.out.print("*");
                }
                for(int j=0;j<space;j++){
                    System.out.print(" ");
                }
                for(int j=0;j<star;j++){
                    System.out.print("*");
                }
                space +=2;
                star--;
                System.out.println("");
            }
        }
    }

    static void printSquareSpecial3(int n) {
        /*
         ****
         *  *
         *  *
         ****
         */
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==0 || j==0 || i==n-1 || j==n-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }

    static void printSquareSpecial4(int n) {
        /*
        4 4 4 4 4 4 4
        4 3 3 3 3 3 4
        4 3 2 2 2 3 4
        4 3 2 1 2 3 4
        4 3 2 2 2 3 4
        4 3 3 3 3 3 4
        4 4 4 4 4 4 4
         */
        int i,j,p;
        for(i=1;i<n*2;i++){
            p = n;
            if(i<n){
                for(j=1;j<n*2;j++){
                    System.out.print(p + " ");
                    if(i>j)
                        p--;
                    if((i+j)>=(n*2))
                        p++;
                }
            }else{
                for(j=1;j<n*2;j++){
                    System.out.print(p + " ");
                    if((i+j)<n*2){
                        p--;
                    }
                    if(j>=i){
                        p++;
                    }
                }
            }
            System.out.println("");
        }
    }
}
