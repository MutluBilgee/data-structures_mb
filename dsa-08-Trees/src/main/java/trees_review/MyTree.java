package trees_review;

import java.util.LinkedList;
import java.util.Queue;

public class MyTree {
    TNode root;

    public MyTree() {
    }
    void insert(int value){
        TNode newNode=new TNode(value);
        if (root==null) {
            root=newNode;
            return;
        }
        TNode current =root;
        while(true){
            if (value<= current.value){

                if (current.leftChild==null){
                    // if left is null insert there!!!
                    current.leftChild=newNode;
                    break;
                }
                //if leftChild is not null branch into left subtree!!
                current=current.leftChild;
            }
            else {
                if (current.rightChild==null){
                    // if right is null insert there!!!
                    current.rightChild=newNode;
                    break;
                }
                //if rightChild is not null branch into right subtree!!
                current=current.rightChild;
            }
        }
    }
    // PreOrder Traversal of the tree
    // Root-Left-right
    void preOrderTraversal(TNode root){
        if(root==null) return;// termination
        System.out.print(root.value +", "); // visit root
        preOrderTraversal(root.leftChild);  // visit left subtree
        preOrderTraversal(root.rightChild); // visit right subtree
    }
    void inOrderTraversal(TNode root){
        if (root==null) return; // termination
        inOrderTraversal(root.leftChild);
        System.out.print(root.value+", ");
        inOrderTraversal(root.rightChild);
    }
    void postOrderTraversal(TNode root){
        if (root==null) return;// termination
        postOrderTraversal(root.leftChild); // branch and finish left subtree
        postOrderTraversal(root.rightChild); // branch and finish right subtree
        System.out.print(root.value+", ");  // visit root
    }
    void levelOrderTraversal(){
        if(root==null) return;
        Queue<TNode>  queue=new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            TNode toVisit=queue.poll();
            System.out.print(toVisit.value+", ");
            if (toVisit.leftChild!=null) queue.add(toVisit.leftChild);
            if (toVisit.rightChild!=null) queue.add(toVisit.rightChild);
        }
    }
    // Task 1- Implement contains(int value)
    public boolean contains(int value) {
        if(root==null) return false;
   // start from root
        TNode current=root;
        // while loop for iteration
        while(current!=null){
            if(value< current.value) current=current.leftChild;  // value less
            else if(value>current.value) current=current.rightChild;// value greater
            else return true; // equal
        }
        return false;
    }

    // Task-2 Implement isLeaf(TNode node)
    public boolean isLeaf(TNode node) {
        // if left child and right child are null it is a leaf
        return node.leftChild==null && node.rightChild==null;
    }

    // Task-3 Implement printLeaves(TNode node)
    public void printLeaves(TNode root) {
        // make a traversal, if current node is a leaf print it
        if (root==null) return;// termination
        printLeaves(root.leftChild); // branch and finish left subtree
        printLeaves(root.rightChild); // branch and finish right subtree
        if(isLeaf(root)) {
            System.out.print(root.value + ", ");  // visit root
        }
    }
    // Task -4 Implement height(TNode root)
    int height(TNode root) {
        if(root==null) return -1; // termination
        if(isLeaf(root)) return 0; // leaf height is = 0
        return 1 + Math.max(height(root.leftChild), height(root.rightChild));// 1+ max of (height (left and right subtrees) )
    }

    // Task - 5 Implement int countLeaves(Node root) # of leaves
    int countLeaves(TNode root) {
        if(root==null) return 0;
        if (isLeaf(root)) return 1;
        return countLeaves(root.leftChild)+ countLeaves(root.rightChild);
    }

    // Task-  6  Implement int findSumOfLeaves(Node root) sum of values of leaves
    int findSumOfLeaves(TNode root) {
       // if a leaf return value
        if(root==null) return 0;
        if(isLeaf(root)) return root.value;
        // branch into left and right sub
        return findSumOfLeaves(root.leftChild) + findSumOfLeaves(root.rightChild);
    }
    // Task -7 Calculate node sums
    public int calculateNodeSums(TNode root) {
       // similar approach with find Sum Of leaves
        if(root==null) return 0;
        return root.value + calculateNodeSums(root.leftChild) + calculateNodeSums(root.rightChild);
    }

}
