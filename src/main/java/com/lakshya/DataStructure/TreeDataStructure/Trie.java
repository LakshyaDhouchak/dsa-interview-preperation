package com.lakshya.DataStructure.TreeDataStructure;

public class Trie {
    
    // define the Static TrieNode class
    static class TrieNode{
        
        // define the properties
        TrieNode[] children;
        boolean isEndOfWord;

        // define the constructor
        public TrieNode(){
            this.children = new TrieNode[26];
            this.isEndOfWord = false;
        }
    }

    // define the properties
    private TrieNode root;

    // define the constructor
    public Trie(){
        this.root = new TrieNode();
    }

    // define the insert() methord
    public void insert(String s){
        TrieNode curr = root;

        // define the for-each loop
        for(char ch: s.toCharArray()){
            int index = ch-'a';
            // define the condition
            if(curr.children[index] == null){
                curr.children[index] = new TrieNode();
            }
            curr = curr.children[index];
        }
        curr.isEndOfWord = true;
    }

    // define the isEmpty() methord
    public boolean isEmpty(){

        TrieNode node = root;
        // define the for-each loop
        for(TrieNode child: node.children){
            // define the condition
            if(child != null){
                return false;
            }
        }
        return true;
    }

    // define the Search() methord
    public boolean Search(String s){

        TrieNode node = root;
        // define the for-each loop
        for(char ch: s.toCharArray()){
            int index = ch-'a';
            // define the condition
            if(node.children[index] == null){
                return false;
            }
            node = node.children[index];
        }
        return node.isEndOfWord;
    }

    // define the prefixStartWith() methord
    public boolean prefixStartWith(String s){

        TrieNode node = root;
        // define the for-each loop
        for(char ch: s.toCharArray()){
            int index = ch-'a';
            // define the condition
            if(node.children[index] == null){
                return false;
            }
            node = node.children[index];
        }
        return true;
    }


    // define the display() methord
    public void display(){
        System.err.println("Trie Word is:");
        RecDisplay(root,"");
    }
    public void RecDisplay(TrieNode root, String s){
        // define the base condition
        if(root.isEndOfWord){
            System.out.println(s);
        }

        // define the for-loop
        for(int i = 0;i<26;i++){
            TrieNode child = root.children[i];
            // define the condition
            if(child != null){
                char c = (char)('a'+ i);
                RecDisplay(child,s+c);
            }
        }
    }
}
