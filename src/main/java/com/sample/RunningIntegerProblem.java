package com.sample;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RunningIntegerProblem {
    public static void main(String[] args) {

        List<Integer> runningIntegers = Arrays.asList(1,4,56,32,5,6,7,8,4);
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        Pattern pattern = Pattern.compile("");
       Matcher m = pattern.matcher("");
       m.matches();


        for(int i : runningIntegers) {
//            addInteger();
//            rebalanceHeaps();
//            getMedian();
        }
    }

}
