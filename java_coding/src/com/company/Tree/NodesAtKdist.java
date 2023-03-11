package com.company.Tree;
/* Class containing left and right child of current node and key value*/
public class NodesAtKdist {
    static Node root;
    public static void main(String[] args) {
//        BinaryTree tree = new BinaryTree();
        NodesAtKdist treee = new NodesAtKdist();
        treee.root = new Node(1);
        treee.root.left = new Node(2);
        treee.root.right = new Node(3);
        treee.root.left.left = new Node(4);
        treee.root.left.right = new Node(5);
        treee.root.right.right = new Node(6);
        treee.root.left.right.left = new Node(7);
        treee.root.left.right.right = new Node(8);
        /* Constructed binary tree is
                      1             level 0
                    /   \
                   2      3         level 1
                 /  \      \
               4     5      6       level 2
                   /  \
                  7    8            level 3
            */
        Nodes_At_K_Distance_from_root(root,1);
    }
    static void Nodes_At_K_Distance_from_root(Node root, int k){
        if(root == null) return;
        if(k==0){
            System.out.print(root.data + " ");
        }
        else{
            Nodes_At_K_Distance_from_root(root.left,k-1);
            Nodes_At_K_Distance_from_root(root.right,k-1);
        }
    }

}
