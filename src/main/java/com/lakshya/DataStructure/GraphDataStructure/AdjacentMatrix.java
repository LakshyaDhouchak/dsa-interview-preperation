package com.lakshya.DataStructure.GraphDataStructure;

import java.util.Scanner;

public class AdjacentMatrix {
    
    // define the properties
    private int[][] matrix;
    private int vertex;
    @SuppressWarnings("unused")
    private boolean isDirected;

    // calling the Scanner
    Scanner input =  new Scanner(System.in);

    // define the constructor
    public AdjacentMatrix(int vertex){
        // define the condition
        if(vertex<=0){
            throw new IllegalArgumentException("Vertex can't be Zero or negative ");
        }
        this.vertex = vertex;
        this.matrix = new int[vertex][vertex];
        this.isDirected = false;
    }

    public AdjacentMatrix(int vertex,boolean isDirected){
        // define the condition
        if(vertex<=0){
            throw new IllegalArgumentException("Vertex can't be Zero or negative ");
        }
        this.vertex = vertex;
        this.matrix = new int[vertex][vertex];
        this.isDirected = isDirected;
    }

    // define the addEdge() methord
    public void addWeightEdge(int source, int destination,boolean isDirected, int weight){

        if((source<0 || source>=vertex)||(destination<0 || destination>=vertex)){
            throw new IllegalStateException("Source and destination is not correct");
        }
        // define the condition
        if(isDirected){
            matrix[source][destination] = weight;
        }
        else{
            matrix[source][destination] = weight;
            matrix[destination][source] = weight;
        }
    }

    public void addEdge(int source, int destination,boolean isDirected){

        if((source<0 || source>=vertex)||(destination<0 || destination>=vertex)){
            throw new IllegalStateException("Source and destination is not correct");
        }
        // define the condition
        if(isDirected){
            matrix[source][destination] = 1;
        }
        else{
            matrix[source][destination] = 1;
            matrix[destination][source] = 1;
        }
    }

    // define the  remove() methord
    public void removeEdge(int source, int destination, boolean isDirected){

        // define the base condition
        if((source<0 || source>=vertex)||(destination<0 || destination>=vertex)){
            throw new IllegalStateException("Source and destination is not correct");
        }
        // define the condition
        if(isDirected){
            matrix[source][destination] = 0;
        }
        else{
            matrix[source][destination] = 0;
            matrix[destination][source] = 0;
        }
    }

    // define the CheckEdge() methord
    public boolean CheckEdge(int source, int destination){

        // define the base condition
        if((source<0 || source>=vertex)||(destination<0 || destination>=vertex)){
            throw new IllegalStateException("Source and destination is not correct");
        }
        return matrix[source][destination] !=0;
    }

    // define the Display() methord
    public void Display(){
        System.out.println("The Graph is:");
        // define the for-loop
        for(int i = 0;i<vertex;i++){
            // define the for-loop
            for(int j = 0;j<vertex;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    // define the IsDegree() methord
    public int[] isDegree(int vertex){
        // define the condition
        if(!isDirected){
            // define the properties
            int count = 0;
            // define the for-loop
            for(int i = 0;i<vertex;i++){
                // define the condition
                if(matrix[vertex][i] !=0){
                    count++;
                }
            }
            return new int[]{count};
        }
        else{
            // define the properties
            int inDegree = 0;
            int outDegree = 0;
            // define the for-loop
            for(int i = 0;i<vertex;i++){
                // define the condition
                if(matrix[vertex][i]!= 0){
                    inDegree++;
                }
                if(matrix[i][vertex]!=0){
                    outDegree++;
                }
            }
            return new int[]{inDegree,outDegree};
        }   
    }

}
