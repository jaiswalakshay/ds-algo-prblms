package com.sample;

import java.util.*;

public class SubArraySumZero {

    public static void main(String[] args) {
        findSubArray(0, 11, -84, 84, 0, 34, -15, -19, 1);
    }

    private static void findSubArray(int k, int... input) {
        Map<Integer, List<Integer>> map = new HashMap<Integer, List<Integer>>();
        List<Integer> initial = new ArrayList<Integer>();
        initial.add(-1);
        map.put(0, initial);
        int preSum = 0;

        // Loop across all elements of the array
        for (int i = 0; i < input.length; i++) {
            preSum += input[i];
            // If point where sum = (preSum - k) is present, it means that between that
            // point and this, the sum has to equal k
            if (map.containsKey(preSum - k)) {   // Subarray found
                List<Integer> startIndices = map.get(preSum - k);
                for (int start : startIndices) {
                    System.out.println("Start: " + (start + 1) + "\tEnd: " + i);
                }
            }

            List<Integer> newStart = new ArrayList<Integer>();
            if (map.containsKey(preSum)) {
                newStart = map.get(preSum);
            }
            newStart.add(i);
            map.put(preSum, newStart);
        }
    }
}
