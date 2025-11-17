package com.lakshya.DataStructure.TreeDataStructure;

import java.util.LinkedList;
import java.util.Queue;
import java.lang.Math; 

public class BinaryTree {

    // define the Node Class
    static class Node {
        int data;
        Node left;
        Node right;

        // Constructor
        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // define the properties
    private Node root = null;

    // define the insert() methord
    public void insert(int data) { 
        Node newNode = new Node(data);

        if (root == null) {
            root = newNode;
            return;
        }

       
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node current = queue.poll();

            if (current.left == null) {
                current.left = newNode;
                return;
            } else {
                queue.add(current.left);
            }

          
            if (current.right == null) {
                current.right = newNode;
                return;
            } else {
                queue.add(current.right);
            }
        }
    }

   // define the getRoot() methord
    public Node getRoot() {
        return root;
    }
    
    // define the Size() methord
    public int size() {
        return size(root);
    }
    
    // Helper method should be private for encapsulation
    private int size(Node node) {
        if (node == null) {
            return 0;
        }
        int leftSize = size(node.left);
        int rightSize = size(node.right);
        return leftSize + rightSize + 1;
    }

    // define the height() methord
    public int height() {
        return height(root);
    }
    
    // Helper method should be private for encapsulation
    private int height(Node node) {
        if (node == null) {
            return -1; 
        }
        int leftHeight = height(node.left);
        int rightHeight = height(node.right);
       
        return Math.max(leftHeight, rightHeight) + 1;
    }

   // define the isBalanced() methord
    public boolean isBalanced() {
        return isBalanced(root);
    }

    // Helper method should be private for encapsulation
    private boolean isBalanced(Node node) {
        if (node == null) {
            return true;
        }

        int leftSubtreeHeight = height(node.left);
        int rightSubtreeHeight = height(node.right);

        int balanceFactor = Math.abs(leftSubtreeHeight - rightSubtreeHeight);
        if (balanceFactor > 1) {
            return false;
        }

        return isBalanced(node.left) && isBalanced(node.right);
    }

   // define the traversal() methord
    public void traversal(int choice) { 
        if (root == null) {
            System.out.println("Tree is empty.");
            return;
        }
        System.out.print("Traversal Result: ");
        switch (choice) {
            case 1:
                inOrder(root);
                break;
            case 2:
                preOrder(root);
                break;
            case 3:
                postOrder(root); 
                break;
            case 4:
                levelOrder(); 
                break; 
            default:
                System.out.print("Invalid choice. Performing PreOrder: ");
                preOrder(root); 
                break; 
        }
        System.out.println(); 
    }

    // define the preOrder
    private void preOrder(Node node) {
        if(node == null){
            return;
        }
        System.out.print(node.data+" ");
        preOrder(node.left);
        preOrder(node.right);
    }

    // define the InOrder
    private void inOrder(Node node) {
        if(node == null){
            return;
        }
        inOrder(node.left);
        System.out.print(node.data+" ");
        inOrder(node.right);
    }

   // define the postOrder 
    private void postOrder(Node node) {
        if(node == null){
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.data+" ");
    }

    // define the levelOrder
    private void levelOrder() { 
        if (root == null) return;

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){
            Node current = queue.poll();
            System.out.print(current.data+" ");
            if(current.left!=null){
                queue.add(current.left);
            }
            if(current.right!=null){
                queue.add(current.right);
            }
        }
    }
}