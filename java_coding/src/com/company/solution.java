package com.company;
import java.util.*;

public class solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        while(t-->0) {
        int x = sc.nextInt();
        if(x ==0 || x ==1)
        {
//            return x;
            System.out.println(x);
        }
        int start = 0;
        int end = x;  //8
        int res =0;
        while(start<=end)  //0<8 >>> 0<3
        {
            int mid = start + (end-start)/2; // 4 >>> 1 >>> 1
            if(mid <= x/mid) //4<2 FALSE
            {
                res = mid;
                start = mid + 1;
            }
            else //4>2 true
            {
                end = mid - 1; //3 >>> 2
            }
        }
        System.out.println(res);

//            String str = sc.next();
//            int nq =0;
//            int na = 0;
//            if(str.charAt(str.length()-1) == 'Q'){
//                System.out.println("NO");
//                break;
//            }
//            for (int i = 0; i < n; i++) {
//                if(str.charAt(i) == 'Q'){
//                    nq++;
//                }
//                else{
//                    na++;
//                }
//            }
//            if(na >= nq){
//                System.out.println("YES");
//            }
//            else{
//                System.out.println("NO");
//            }


//            int[] arr = new int[3];
//            for (int i = 0; i < 3; i++) {
//                arr[i] = sc.nextInt();
//            }
//            Arrays.sort(arr);
//            if (arr[0] + arr[1] == arr[2]){
//                System.out.println("YES");
//            }
//            else{
//                System.out.println("NO");
//            }
//            int b = sc.nextInt();
//            int c = sc.nextInt();



//            int k = sc.nextInt();
//            int[] arr = new int[n];
//            for (int i = 0; i <n ; i++) {
//                arr[i] = sc.nextInt();
//            }
//            for (int i = 0; i <k ; i++) {
//                 int even = sc.nextInt();
//                 int odd = sc.nextInt();
//
//
//            }


//            ArrayList<Integer> arrli = new ArrayList<Integer>(n);
//
//            for (int i = 0; i < n; i++) {
//                int z = sc.nextInt();
//                arrli.add(z);
//                System.out.println(arrli);
//            }
//            int max=0,min=arrli.get(0);
//            for (int i = 0; i < arrli.size(); i++) {
//                max = (max > arrli.get(i) ? max : arrli.get(i));
//                min = (min < arrli.get(i) ? min : arrli.get(i));
//            }
//            int step = 0;
//            while(arrli.contains(max) && arrli.contains(min)){
//                for (int i = 0; i<n; i++) {
////                    int s =0;
////                    int j = n-1;
//                    if (i%2==0){
//                        arrli.remove(i);
////                        s++;
//                        step++;
//                    }
//                    else{
//                        arrli.remove(arrli.size()-1);
////                        j--;
//                        step++;
//                    }
//                }
//            }
//            System.out.println(step);
            //arrli.contains(10);
//            https://codeforces.com/problemset/problem/1742/B
//            int n = sc.nextInt();
//
//            Boolean issort = true;
//            int[] arr = new int[n];
//            for (int i=0;i<n;i++){
//                arr[i] = sc.nextInt();
//            }
//            Arrays.sort(arr);
//            for (int i = 0; i < n-1; i++) {
//                if (arr[i] == arr[i+1]){
//                    issort = false;
//                }
//            }
//            if (issort){
//                System.out.println("YES");
//            }
//            else{
//                System.out.println("NO");
//            }


//https://codeforces.com/problemset/problem/1622/A
//            Arrays.sort(arr);
//            if (arr[2] == arr[0] + arr[1]) {
//                System.out.println("YES");
//            }
//            else if(arr[0] == arr[1] && arr[0] == arr[2]){
//                if(arr[0]%2 == 0){
//                    System.out.println("YES");
//                }
//                else{
//                    System.out.println("NO");
//                }
//            }
//            else if((arr[1] == arr[2]) && (arr[0] > 1) && (arr[0]%2 == 0)){
//                System.out.println("YES");
//            }
//            else{
//                System.out.println("NO");

        }
    }
//}
