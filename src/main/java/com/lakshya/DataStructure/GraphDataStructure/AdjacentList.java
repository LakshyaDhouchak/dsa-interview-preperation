package com.lakshya.DataStructure.GraphDataStructure;

import java.util.ArrayList;

public class AdjacentList {
    
    // define the properties
    private ArrayList<ArrayList<Integer>> list;
    private int vertex;
    private boolean isDirected;

    // define the constructor
    public AdjacentList(int vertex){
        // define the condition
        if(vertex<=0){
            throw new IllegalArgumentException("Vertex Can' be Zero aur negative");
        }
        this.vertex = vertex;
        this.isDirected = false;
        // define the for-loop
        for(int i = 0;i<vertex;i++){
            list.add(new ArrayList<>());
        }
    }

    public AdjacentList(int vertex, boolean isDirected){
        // define the condition
        if(vertex<=0){
            throw new IllegalArgumentException("Vertex Can' be Zero aur negative");
        }
        this.vertex = vertex;
        this.isDirected = isDirected;
        // define the for-loop
        for(int i = 0;i<vertex;i++){
            list.add(new ArrayList<>());
        }
    }


    // define the addEdge() methord
    public void addEdge(int source, int destination, boolean isDirected){

        if((source<0 || source>=vertex)||(destination<0 || destination>=vertex)){
            throw new IllegalStateException("Source and destination is not correct");
        }
        // define the condition
        if(isDirected){
            list.get(source).add(destination);
        }
        else{
            list.get(source).add(destination);
            list.get(destination).add(source);
        }
    }

    // define the RemoveEdge() methord
    public void RemoveEdge(int source, int destination, boolean isDirected){
        // define the condition
        if((source<0 || source>=vertex)||(destination<0 || destination>=vertex)){
            throw new IllegalStateException("Source and destination is not correct");
        }
        if(isDirected){
            list.get(source).remove(destination);
        }
        else{
            list.get(source).remove(destination);
            list.get(destination).remove(source);
        }
    }

    // define the CheckEdge() methord
    public boolean CheckEdge(int source, int destination){
        // define the condition
        if((source<0 || source>=vertex)||(destination<0 || destination>=vertex)){
            throw new IllegalStateException("Source and destination is not correct");
        }
        return list.get(source).contains(destination); 
    }


    // define the display() methord
    public void display(){
        System.out.println("The AdjacentList is:");
        // define the for-loop
        for(int i = 0;i<vertex;i++){
            System.out.println("Vertex "+i+" :");
            for(int num : list.get(i)){
                System.out.println(num+" ");
            }
            System.out.println();
        }
    }


    // define the Degree() methord
    @SuppressWarnings("unused")
    public int[] Degree(int vertex){
        // define the condition
        if(!isDirected){
            // define the properties
            int count = 0;
            // define the for-each loop
            for(int num: list.get(vertex)){
                count++;
            }
            return new int[]{count};
        }
        else{
            // define the properties
            int inDegree = 0;
            int OutDegree = 0;

            // define the for-loop
            for(int i = 0;i<vertex;i++){
                // define the condition
                if(list.get(vertex).contains(i)){
                    OutDegree++;
                }
                if(list.get(i).contains(vertex)){
                    inDegree++;
                }
            }
            return new int[]{inDegree,OutDegree};
        }
    }

}
