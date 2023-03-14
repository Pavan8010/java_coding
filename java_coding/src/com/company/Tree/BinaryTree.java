package com.company.Tree;
// non-recursive java program for inorder traversal
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/* Class containing left and right child of current node and key value*/
class Node{
    int data;
    Node left, right;
    public Node(int item){
        data = item;
        left = right = null;
    }
}
/* Class to print the inorder traversal */
class TreeInfo{
    int ht;
    int diam;
    TreeInfo(int ht,int diam){
        this.ht = ht;
        this.diam = diam;
    }
}
class BinaryTree {
    static Node root;
    public static void main(String args[]){
		/* creating a binary tree and entering the nodes */
            /* Constructed binary tree is
                      1
                    /   \
                   2      3
                 /  \      \
               4     5      6
                   /  \
                  7    8
            */
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.right = new Node(6);
        tree.root.left.right.left = new Node(7);
        tree.root.left.right.right = new Node(8);

    }
    static void inorderwithoutRecurrsion(){
        if (root == null)
            return;

        Stack<Node> s = new Stack<Node>();
        Node curr = root;
        // traverse the tree
        while (curr != null || s.size() > 0){
            /* Reach the left most Node of the curr Node */
            while (curr != null){
                /* place pointer to a tree node on the stack before traversing the node's left subtree */
                s.push(curr);
                curr = curr.left;
            }
            /* Current must be NULL at this point */
            curr = s.pop();

            System.out.print(curr.data + " ");

            /* we have visited the node and its left subtree. Now, it's right subtree's turn */
            curr = curr.right;
        }
    }
    static void inorder(Node root){
        // left root right
        if(root != null){
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }
    static void preorder(Node root){
    // root left right
        if(root != null){
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }
    }
    static void postorder(Node root){
    //left right root
        if(root != null){
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + " ");
        }
    }
    static int height(Node root){
        if(root == null){
            return 0;
        }
        return Math.max(height(root.left),height(root.right))+1;
    } // TC: O(n)
    static void levelOrder(Queue<Node> q){
        while(!q.isEmpty()){
            Node curr = q.poll();
            if(curr == null) return;
            System.out.print(curr.data+ " ");
            if(curr.left!= null)q.add(curr.left);
            if(curr.right != null)q.add(curr.right);
        }
    }
    static void levelOrder2(Queue<Node> q){
        while(q.size()>1){
            Node curr = q.remove();
            if(curr == null){
                System.out.println("");
                q.add(null);
                continue;
            }
            System.out.print(curr.data+ " ");
            if(curr.left!= null)q.add(curr.left);
            if(curr.right != null)q.add(curr.right);
        }
    }
    static void levelOrder3(Queue<Node> q){
        while(!q.isEmpty()){
            int size = q.size();
            for (int i=0;i<size;i++){
                Node curr = q.poll();
                System.out.print(curr.data + " ");
                if (curr.left != null)q.add(curr.left);
                if (curr.right != null)q.add(curr.right);
            }
            System.out.println();
        }
    }
    static int sizeOfTree(Node root){
        if(root == null) return 0;

        return 1 + sizeOfTree(root.left) + sizeOfTree(root.right);
    }
    static int maximumInTree(Node root){
        if(root == null) return -1;
        return Math.max(root.data , Math.max( maximumInTree(root.left) , maximumInTree(root.right) ));
    }
    static int CountOfNodes(Node root){
        if(root == null){
            return 0;
        }
        return (1+CountOfNodes(root.left) + CountOfNodes(root.right));
    } // TC: O(n)
    static int sumOfAllNodes(Node root){
        if(root == null){
            return 0;
        }
        return sumOfAllNodes(root.left) + sumOfAllNodes(root.right) + root.data;
    }
    static int diameter(Node root){
        if(root == null){
            return 0;
        }
        int diam1 = diameter(root.left);
        int diam2 = diameter(root.right);
        int diam3 = height(root.left)+height(root.right)+1;
        return Math.max(diam3,Math.max(diam1,diam2));
    } // TC: O(n^2)
    static TreeInfo diameter2(Node root){
        if(root==null){
            return new TreeInfo(0,0);
        }
        TreeInfo left = diameter2(root.left);
        TreeInfo right = diameter2(root.right);

        int myheight = Math.max(left.ht,right.ht)+1;

        int diam1 = left.diam;
        int diam2 = right.diam;
        int diam3 = left.ht+right.ht+1;
        int mydiam = Math.max(Math.max(diam1,diam2),diam3);
        TreeInfo myInfo = new TreeInfo(myheight,mydiam);
        return myInfo;
    } //TC: O(n)

}