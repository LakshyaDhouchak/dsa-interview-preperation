package com.lakshya.DataStructure.HashingDataStructure;

// implemented OverLoading() methord
public class HashFuxnMenu {
    // define the methord
    public HashFunction getHashFunction(int choice , int hashSize){
        // define the switch() case
        switch(choice){
            // define the case
            case 1:
                return new DivisionHash(hashSize);
            case 2:
                return new MultiplicationHash(hashSize);
            case 3:
                return new MidSquareHash(hashSize);
            default:
                return new DivisionHash(hashSize);               
        }
    }
    
    public HashFunction getHashFunction(int choice , int hashSize, int chuckSize){
        // define the switch() case
        switch(choice){
            case 4:
                return new FoldingHash(hashSize,chuckSize);
            default :
                return new DivisionHash(hashSize);   
        }
    }
}
