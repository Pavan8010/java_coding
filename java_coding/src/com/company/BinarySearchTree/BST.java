package com.company.BinarySearchTree;
import java.util.ArrayList;
class Node{
    int data;
    Node left = this.left;
    Node right = this.right;
    Node(int data){
        this.data = data;
    }
}

public class BST {
    static Node insert(Node root, int val){
        if(root == null){
            root = new Node(val);
            return root;
        }
        if(root.data > val){
            root.left = insert(root.left,val);
        }
        else{
            root.right = insert(root.right,val);
        }
        return root;
    }
    static boolean search(Node root , int key){ // O(H)
        if(root == null){
            return false;
        }
        if(root.data>key){
            return search(root.left,key);
        }
        else  if(root.data == key){
            return true;
        }else{
            return search(root.right,key);
        }
    }
    static Node delete(Node root,int val){
        if(root.data>val){
            return delete(root.left,val);
        }
        else if(root.data<val){
            return delete(root.right,val);
        }
        else{
            // case-1 -----> when both left and right is null
            if(root.left == null && root.right==null){
                return null;
            }

            // case-2 -----> only one child is present
            if(root.left==null){
                return root.right;
            }
            else if(root.right == null){
                return root.left;
            }

            // case-3 -----> both child are present (so we first find the inorder successor in right-sub-tree and then replae with it
            Node IS = inorderSuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right,IS.data);
        }
        return root;
    }
    static Node inorderSuccessor(Node root){
        while(root.left != null){
            root = root.left;
        }
        return root;
    }
    static void printInRange(Node root , int x , int y){
        if (root==null){
            return;
        }
        if(root.data>= x && root.data<=y){
            printInRange(root.left,x,y);
            System.out.print(root.data + " ");
            printInRange(root.right,x,y);
        }
        else if(root.data>=y){
            printInRange(root.left,x,y);
        }
        else if(root.data<=x){
            printInRange(root.right,x,y);
        }
    }
    static void inorder(Node root){
        if(root != null){
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }
    static void pritnRootToLeaf(Node root, ArrayList<Integer> path){
        if(root == null){
            return;
        }
        path.add(root.data);
        if(root.left == null && root.right==null){
            for (int i: path){
                System.out.print(i + "->");
            }
            System.out.println();
        }
        else {
            pritnRootToLeaf(root.left,path);
            pritnRootToLeaf(root.right,path);
        }
        path.remove(path.size()-1);
    }
    static int count=0,ans = 0;
    static void kthsmallest(Node root,int k){
        if (root==null){
            return;
        }
        kthsmallest(root.left,k);
        count++;
        if(count == k){
            ans = root.data;
            return;
        }
        kthsmallest(root.right,k);
    }
    static int mini = Integer.MAX_VALUE;
    static void findmin(Node root){
        if(root == null){
            return;
        }
        findmin(root.left);
        count++;
        if(count==1){
            mini = root.data;
            return;
        }
    }
    static void inorder(Node root,ArrayList<Integer> traversal){
        if(root != null){
            inorder(root.left,traversal);
//            System.out.print(root.data + " ");
            traversal.add(root.data);
            inorder(root.right,traversal);

        }
    }
    public static Node flatten(Node root){
        Node dummy = new Node(-1);
        Node[] prev = {dummy};
        ArrayList<Integer> traversal = new ArrayList<>();
        inorder(root,traversal);
        formflatten(0,prev,traversal);
        prev[0].left= null;
        prev[0].right=null;
        Node ret = dummy.right;
        dummy = null;
        return ret;
    }
    static void formflatten(int pos ,Node[] prev,ArrayList<Integer> traversal){
        if(pos == traversal.size()){
            return;
        }
        prev[0].right = new Node(traversal.get(pos));
        prev[0].left = null;
        prev[0] = prev[0].right;
        formflatten(pos+1,prev,traversal);
    }

    public static void main(String[] args) {
        int[] values = {8,5,3,1,4,6,10,11,14};
        /* Constructed binary tree  is
                      8
                    /   \
                   5      10
                 /  \      \
                3    6      11
              /  \            \
             1    4           14
        */
        Node root = null;
        for (int i=0;i< values.length;i++){
            root = insert(root,values[i]);
        }
        flatten(root);
        Node curr = root;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.right;
        }
    }

}
