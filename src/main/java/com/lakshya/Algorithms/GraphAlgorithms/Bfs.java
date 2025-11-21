package com.lakshya.Algorithms.GraphAlgorithms;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Bfs {
    
    // define the properties
    private int vertex;
    private ArrayList<ArrayList<Integer>> list;
    @SuppressWarnings("unused")
    private boolean isDirected;

    // define the constructor
    public Bfs(int vertex){
        // define the condition
        if(vertex<=0){
            throw new IllegalArgumentException("Vertex can't be zero or negative");
        }
        this.vertex =vertex;
        this.isDirected = false;
        // define the for-loop
        for(int i = 0;i<vertex;i++){
            list.add(new ArrayList<>());
        }
    }
    public Bfs(int vertex,boolean isDirected){
        // define the condition
        if(vertex<=0){
            throw new IllegalArgumentException("Vertex can't be zero or negative");
        }
        this.vertex = vertex;
        this.isDirected = isDirected;
        // define the for-loop
        for(int i = 0;i<vertex;i++){
            list.add(new ArrayList<>());
        }
    }

    // define the AddEdge() methord
    public void addEdge(int source , int destination , boolean isDirected){

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
    public void bfs(int startVertex){
        // define the condition
        if(startVertex<0 && startVertex>=vertex){
            throw new IllegalArgumentException("Start Vertex Value is Out of Bound");
        }
        System.out.println("The vertex present in Graph is: ");
        utilBfs(startVertex);
    }

    // define the helper class
    public void utilBfs(int start){
        // define the Queue 
        Queue<Integer> queue =  new LinkedList<>();
        boolean[] visited =  new boolean[vertex];
        queue.add(start);
        visited[start] = true;

        // define the condition
        while(!queue.isEmpty()){
            int elem = queue.poll();
            System.out.print(elem);

            // define the for-each loop
            for(int num : list.get(elem)){
                // define the condition
                if(!visited[num]){
                    visited[num] = true;
                    queue.add(num);
                }
            }
        }
    }
}
