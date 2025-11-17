package com.lakshya.DataStructure.TreeDataStructure;

import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {

    // define the Node Class
    static class Node{
        // define the properties
        int data;
        Node left;
        Node right;

        // define the constructor
        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }

    }

    // define the properties
    private Node root = null;

    // define the create() methord
    public void create(int data){
        root = Insert(root,data);
    }

    // define the helper class for Creating BST
    public Node Insert(Node root ,int data){
        // calling the Node Class
        Node node = new Node(data);
        // define the base Condition
        if(root == null){
            root = node;
        }
        if(data<=root.data){
            root.left = Insert(root.left,data);
        }
        if(data>root.data){
            root.right = Insert(root.right,data);
        }
        return node;
    }

    // define the InOrder() methord
    private void inOrder(Node head){
        // define the base Condition
        if(head == null){
            return;
        }
        inOrder(head.left);
        System.out.print(head.data+" ");
        inOrder(head.right);
    }

    // define the preOrder() methord
    private void preOrder(Node head){
        // define the base Condition
        if(head == null){
            return;
        }
        System.out.print(head.data+" ");
        preOrder(head.left);
        preOrder(head.right);
    }

    // define the postOrder() methord
    private void postOrder(Node head){
        // define the base Condition
        if(head == null){
            return;
        }
        postOrder(head.left);
        postOrder(head.right);
        System.out.print(head.data+" ");
    }

    // define the LevelOrder() methord
    public void LevelOrder(Node head){
        // define the properties
        Queue<Node> queue =  new LinkedList<>();
        queue.add(head);

        // define the condition
        while(!queue.isEmpty()){
            Node current = queue.poll();
            System.out.print(current.data+" ");
            
            // define the condition
            if(current.left!=null){
                queue.add(current.left);
            }
            if(current.right!=null){
                queue.add(current.right);
            }
        }
    }

    // define the Traversal() methord
    public void traversal(Node head, int choice ){
        // define the  condition
        if(head == null){
            System.out.println("Tree is Empty");
            return;
        }
        System.out.println("Tree Result is:");
        // define the switch() case
        switch(choice){
            case 1:
                inOrder(head);
                break;
            case 2:
                preOrder(head);  
                break;
            case 3:
                postOrder(head);   
                break;
            case 4:
                LevelOrder(head); 
                break;
            default:
                System.out.println("Invalid Choice: Preforming PreOrder");
                preOrder(head);          
        }
    }

    
    // define the Search() methord
    public boolean Search(Node head, int data){
        // define the condition
        if(head == null){
            return false;
        }
        if(head.data == data){
            return true;
        }
        if(data<head.data){
            return Search(head.left, data);
        }
        else{
            return Search(head.right, data);
        }

    }

    // define the getRoot() methord
    public Node getRoot(){
        return root;
    }

    // define the Min() methord
    public int Min(Node root){
        // define the condition
        while(root.left!=null){
            root = root.left;
        }
        return root.data;
    }

    // define the Max() methord
    public int max(Node root){
        // define the condition
        while(root.right!=null){
            root = root.right;
        }
        return root.data;
    }

    // define the delete() methord
    public Node delete(int key){
        return delete(root, key);
    }
    // define the helper methord
    public Node delete(Node root, int key){
        if(root == null){
            return null;
        }
        // define the condition
        if(key<root.data){
            delete(root.left, key);
        }
        else if(key>root.data){
            delete(root.right,key);
        }
        else{
            // define the condition
            if(root.left == null && root.right == null){
                return null;
            }
            else if(root.left !=null){
                return root.right;
            }
            else if(root.right !=null){
                return root.left;
            }
            root.data = Min(root.right);
            root.right = delete(root.right, root.data);
        }
        return root;
    }
}
