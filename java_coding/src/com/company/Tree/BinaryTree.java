package com.company.Tree;
// non-recursive java program for inorder traversal
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
//        System.out.println("<--------------------------Inorder Traversal ----------------------------->");
//        tree.inorderwithoutRecurrsion();
//        System.out.println();
//        tree.inorder(root);
//        System.out.println("<--------------------------Pre Traversal ----------------------------->");
//        tree.preorder(root);
//          System.out.println("<--------------------------postTraversal ----------------------------->");
//          tree.postorder(root);
        System.out.println("heighht of the tree is: " + height(root));
    }
    // left root right
    void inorderwithoutRecurrsion(){
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
    void inorder(Node root){
        if(root != null){
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    // root left right
    void preorder(Node root){
        if(root != null){
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }
    }

    //left right root
    void postorder(Node root){
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
    }
}