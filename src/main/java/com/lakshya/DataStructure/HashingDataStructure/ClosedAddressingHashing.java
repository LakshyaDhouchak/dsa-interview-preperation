package com.lakshya.DataStructure.HashingDataStructure;

import java.util.ArrayList;
import java.util.List;

public class ClosedAddressingHashing {
    // define the properties
    private List<Integer>[] hashtable;
    private int hashSize;
    private HashFunction hashFxn;

    // define the constructor
    @SuppressWarnings("unchecked")
    public ClosedAddressingHashing(int hashSize, HashFunction hash){
        // define the condition
        if(hashSize<=0){
            throw new IllegalStateException("HashSize can't be negative aur zero");
        }
        this.hashSize = hashSize;
        this.hashFxn =  hash;
        this.hashtable = new List[hashSize];
        
        // define the for-loop
        for(int i = 0;i< hashSize;i++){
            hashtable[i] =  new ArrayList<>();
        }
    }

    //define the add() methord
    public void add(int key){
        int index = hashFxn.hash(key);
        hashtable[index].add(key);
    }
    
    //define the remove() methord
    public void remove(int key){
        int index = hashFxn.hash(key);
        hashtable[index].remove(key);
    }

    // define the Search() methord
    public boolean search(int key){
        int index = hashFxn.hash(key);
        return hashtable[index].contains(key);
    }

    // define the display() methord
    public void display(){
        System.out.println("The element present in hashTable:");
        // define the for-loop
        for(int i = 0;i<hashSize;i++){
            System.out.print(i +" -->");
            for(int j : hashtable[i]){
                System.out.print(j+" ->");
            }
            System.out.println();
        }

    }
}
