package com.lakshya.DataStructure.HashingDataStructure;

public class ProbingHashFxnMenu {
    
    // calling the hashDxnMenu Object
    HashFuxnMenu hashFuxnMenu = new HashFuxnMenu();
    
    // define the getHashFxn() methord
    public ProbingFxn getProbingHash(int choice1 , int choice2, int hashSize){
        // define the Switch case
        switch(choice1){
            case 1:
                return new LinearProbing();
            case 2:
                return new QuadraticProbing();
            case 3:
                HashFunction hash = hashFuxnMenu.getHashFunction(choice2, hashSize);  
                return new DoubleProbing(hash); 
            default:
                return new LinearProbing();         
        }
    }
}
