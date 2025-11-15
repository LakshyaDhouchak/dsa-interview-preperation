package com.lakshya.DataStructure.HashingDataStructure;

public interface ProbingFxn {
    // define the methord
    int probe(int hash , int i , int hashSize, int key);
}

// define the LinearProbing Class
class LinearProbing implements ProbingFxn{

    @Override
    public int probe(int hash, int i, int hashSize, int key) {
        return (hash+i)%hashSize;
    }
    
}

// define the Quardratic Probing
class QuadraticProbing implements ProbingFxn{

    @Override
    public int probe(int hash, int i, int hashSize, int key) {
        return (hash * i*i)%hashSize;
    }  

}

// define the DoubleProbing class
class DoubleProbing implements ProbingFxn{
    // define the properties
    private HashFunction SecondHash;

    // define the constructor
    public DoubleProbing(HashFunction hash){
        this.SecondHash = hash;
    }
    @Override
    public int probe(int hash, int i, int hashSize, int key) {
        int step = SecondHash.hash(key);
        if(step == 0){
            step = 1;
        }
        return (hash+i*step)%hashSize;
    }
    
}
