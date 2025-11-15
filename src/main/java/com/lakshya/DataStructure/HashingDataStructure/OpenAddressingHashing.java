package com.lakshya.DataStructure.HashingDataStructure;

public class OpenAddressingHashing {
    // define the properties
    private Integer[] HashTable;
    private int hashSize;
    private HashFunction hash;
    private ProbingFxn probingFxn;

    // define the constructor
    public OpenAddressingHashing(int hashSize, HashFunction hash , ProbingFxn probingFxn){
        this.HashTable= new Integer[hashSize];
        this.hashSize = hashSize;
        this.hash = hash;
        this.probingFxn = probingFxn;
    }

    // define the add() methord
    public void add(int key){
        int index = hash.hash(key);
        // define the for-loop
        for(int i = 0;i<hashSize;i++){
            // define the condition
            int probeIndex = probingFxn.probe(index,i,hashSize,key);
            if(HashTable[probeIndex] == null){
                HashTable[i] = key;
                return;
            }
        }
        throw new IllegalStateException("HashTable is Full");
    }

    // define the delete() methord
    public void delete(int key){
        int index = hash.hash(key);
        // define the for-loop
        for(int i = 0;i<hashSize;i++){
            int probeIndex = probingFxn.probe(index, i, hashSize, key);
            // define the condition
            if(HashTable[probeIndex] == null){
                return;
            }
            if(HashTable[probeIndex] == key){
                HashTable[probeIndex] = null;
                return;
            }

        }
    }

    // define the Search() methord
    public boolean Search(int Key){
        int index = hash.hash(Key);
        // define the for-loop
        for(int i = 0;i<hashSize;i++){
            int probeIndex = probingFxn.probe(index, i, hashSize, Key);
            // define the condition
            if(HashTable[probeIndex] == Key){
                return true;
            }
        }
        return false;
    }

    // define the display() methord
    public void dispay(){
        System.out.println("The element present in HashTable is:");
        // define the for-loop
        for(int i = 0;i<hashSize;i++){
            System.out.print(HashTable[i]+" ");
        }
        System.out.println();
    }

}
