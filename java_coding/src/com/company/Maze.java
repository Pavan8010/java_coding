package com.company;
import java.util.*;

public class Maze {
    public static void main(String[] args) {
//        System.out.println("No of Paths are : "+noOfPaths(51,9));

//        path("",3,3);

//        System.out.println("right and down paths:");
//        List<String> ans = pathsRet("",3,3);
//        System.out.println(ans);

//        System.out.println("diagonal , horizontal and vertical paths");
//        List<String> ans2 = pathsRetDiagonal("",3,3);
//        System.out.println(ans2);
        boolean[][] board = {
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };

        pathRestriction("",board,0,0);
//        allPaths("",board,0,0);
    }
    static int noOfPaths(int r ,int c){
        if(r==1 || c==1){
            return 1;
        }
        int left = noOfPaths(r-1,c);
        int right = noOfPaths(r,c-1);
        return left+right;
    }

    static void path(String p,int r,int c){
        if(r==1 && c==1){
            System.out.println(p);
            return;
        }
        if(r>1){
            path(p+"D" , r-1,c);
        }
        if (c>1){
            path(p+"R",r,c-1);
        }
    }

    static List<String> pathsRet(String p,int r,int c){
        if(r==1 && c==1){
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();

        if(r>1){
            list.addAll(pathsRet(p+"D",r-1,c));
        }
        if (c>1){
            list.addAll(pathsRet(p+"R",r,c-1));
        }
        return list;
    }

    static List<String> pathsRetDiagonal(String p,int r,int c){
        if(r==1 && c==1){
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if(r>1 && c>1){
            list.addAll(pathsRetDiagonal(p+"D",r-1,c-1));
        }
        if(r>1){
            list.addAll(pathsRetDiagonal(p+"V",r-1,c));
        }
        if (c>1){
            list.addAll(pathsRetDiagonal(p+"H",r,c-1));
        }
        return list;
    }

    static void pathRestriction(String p,boolean[][] maze, int r,int c){
        if(r == maze.length-1 && c==maze[0].length-1){
            System.out.println(p);
            return;
        }
        if(maze[r][c] == false){
            return;
        }

        if(r< maze.length-1){
            pathRestriction(p+"D" , maze,r+1,c);
        }
        if (c< maze[0].length-1){
            pathRestriction(p+"R",maze,r,c+1);
        }
    }

    static void allPaths(String p , boolean[][] maze, int r,int c){
        if(r == maze.length-1 && c==maze[0].length-1){
            System.out.println(p);
            return;
        }
        if(maze[r][c] == false){
            return;
        }
        maze[r][c] = false;

        if(r< maze.length-1){
            allPaths(p+"D" , maze,r+1,c);
        }
        if (c< maze[0].length-1){
            allPaths(p+"R",maze,r,c+1);
        }
        if(r>0){
            allPaths(p+'U',maze,r-1,c);
        }
        if(c>0){
            allPaths(p+'L',maze,r,c-1);
        }
        //this line is where the funcion call will be over
        // so therefore the funtion gets removed ,also remove the chnages that were made by the function
        maze[r][c] = true;
    }
}
