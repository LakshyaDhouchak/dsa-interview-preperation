package com.lakshya.DataStructure.HashingDataStructure;

public interface HashFunction {
    // define the methord
    int hash(int key);
}

// define the DivisionHash Class
class DivisionHash implements HashFunction{
    // define the properties
    private int hashSize;

    // define the constructor
    public DivisionHash(int hashSize){
        this.hashSize = hashSize;
    }

    // define the methord
    @Override
    public int hash(int key){
        return key%hashSize;
    }
}


// define the MultiplicationHash class
class MultiplicationHash implements HashFunction{
    // define the properties
    private int hashSize;
    private final double A = 0.603;

    // define the constructor
    public MultiplicationHash(int hashSize){
        this.hashSize = hashSize;
    }

    // define the methord
    @Override
    public int hash(int key){
        double fraction = (key*A) - Math.floor(key*A);
        return (int) (hashSize*fraction);
    }

}

// define the Mid-SquareHash class
class MidSquareHash implements HashFunction{
    // define the properties
    private int hashSize;

    // define the constructor
    public MidSquareHash(int hashSize){
        this.hashSize = hashSize;
    }

    // define the methord
    @Override
    public int hash(int key){
        Long square = (long) (key*key);
        String StrSquare = String.valueOf(square);

        int StrSqLength = StrSquare.length();
        int StrHashLength = (int) Math.floor(Math.log10(this.hashSize - 1)) + 1;

        // define the condition
        if(StrSqLength<= StrHashLength){
            return (int) (square%hashSize);
        }
        else{
            int start = (StrSqLength - StrHashLength)/2;
            int end = start+ StrHashLength;
            String subStr = StrSquare.substring(start, end);
            return Integer.valueOf(subStr);
        }
    }
}


// define the FoldingHash class 
class FoldingHash implements HashFunction{
    // define the properties
    private int hashSize;
    private int chunkSize;

    // define the constructor
    public FoldingHash(int hashSize,int chunkSize){
        this.hashSize = hashSize;
        this.chunkSize = chunkSize;
    }

    // define the methord
    @Override
    public int hash(int key){
        // define the condition
        int sum = 0;
        while(key>0){
            int rem = key%chunkSize;
            sum += rem;
            key = key/chunkSize;
        }
        return sum % hashSize;
    }
} 
