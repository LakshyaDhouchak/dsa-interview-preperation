package com.lakshya.Algorithms.GraphAlgorithms;

import java.util.ArrayList;

public class Dfs {
    
    // define the properties
    private int vertex;
    private ArrayList<ArrayList<Integer>> list;
    @SuppressWarnings("unused")
    private boolean isDirected;

    // define the constructor
    public Dfs(int vertex){
        // define the condition
        if(vertex<=0){
            throw new IllegalArgumentException("Vertex can't be zero or negative");
        }
        this.vertex = vertex;
        this.isDirected = false;
        // define the for-loop
        for(int i=0;i<vertex;i++){
            list.add(new ArrayList<>());
        }
    }
    public Dfs(int vertex, boolean isDirected){
        // define the condition
        if(vertex<=0){
            throw new IllegalArgumentException("Vertex can't be zero or negative");
        }
        this.vertex = vertex;
        this.isDirected = isDirected;
        // define the for-loop
        for(int i=0;i<vertex;i++){
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

    // define the bfs() methord
    public void dfs(int startVertex){
        // define the properties
        boolean[] visited = new boolean[vertex];
        // define the condition
        if(startVertex<0 && startVertex>=vertex){
            throw new IllegalArgumentException("Start Vertex Value is Out of Bound");
        }
        System.out.println("The vertex present in graph is:");
        utilDfs(startVertex,visited);
    }

    // define the Helper Class
    public void utilDfs(int startVertex,boolean[] visited){
        System.out.print(startVertex+" ");
        visited[startVertex] = true;

        // define the for-each loop
        for(int num: list.get(startVertex)){
            // define the condition
            if(!visited[num]){
                utilDfs(num, visited);
            }
        }
    }   
}
