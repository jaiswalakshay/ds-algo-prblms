package com.sample;

import java.util.PriorityQueue;

public class Sample {
    public static void main(String... args){
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>();

        priorityQueue.add(5);
        priorityQueue.add(4);
        priorityQueue.add(3);
        priorityQueue.add(6);
        priorityQueue.add(7);
        priorityQueue.add(8);

        Integer x;
        while ( (( x=priorityQueue.remove())!=null)){
            System.out.println(" " + x);
        }

    }

}
