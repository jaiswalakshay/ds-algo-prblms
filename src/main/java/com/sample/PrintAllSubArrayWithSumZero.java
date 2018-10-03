package com.sample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PrintAllSubArrayWithSumZero {
    public static void main(String[] args) {
       // printallSubarrays(new int[]{-84, 84, 0, 34, -15, -19, 1});
      //  printAll(new int[]{-84, 84, 0, 34, -15, -19, 1},0);
        printAll(new int[]{1,2,-1,4,-6,3,8},3);


    }

    private static void printAll(int[] array,int k) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        insertValue(0, -1, map);
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
             if (map.containsKey(sum-k)) {
                for (int value : map.get(sum-k)) {
                    System.out.println("" + (value + 1) + "...." + i);
                }
            }
            insertValue(sum, i, map);

        }
        System.out.println("");
    }

    private static void insertValue(int key, int value, Map<Integer, List<Integer>> map) {
        if (!map.containsKey(key)) {
            map.put(key, new ArrayList<>());
        }
        map.get(key).add(value);
    }

    private static <K, V> void insert(Map<K, List<V>> hashMap, K key, V value) {
        // if the key is seen for the first time, initialize the list
        if (!hashMap.containsKey(key)) {
            hashMap.put(key, new ArrayList<>());
        }

        hashMap.get(key).add(value);
    }

    // Function to print all sub-arrays with 0 sum present
    // in the given array
    public static void printallSubarrays(int[] A) {
        // create an empty Multi-map to store ending index of all
        // sub-arrays having same sum
        Map<Integer, List<Integer>> hashMap = new HashMap<>();

        // insert (0, -1) pair into the map to handle the case when
        // sub-array with 0 sum starts from index 0
        insert(hashMap, 0, -1);

        int sum = 0;

        // traverse the given array
        for (int i = 0; i < A.length; i++) {
            // sum of elements so far
            sum += A[i];

            // if sum is seen before, there exists at-least one
            // sub-array with 0 sum
            if (hashMap.containsKey(sum)) {
                List<Integer> list = hashMap.get(sum);

                // find all sub-arrays with same sum
                for (Integer value : list) {
                    System.out.println("Subarray [" + (value + 1) + ".." +
                            i + "]");
                }
            }

            // insert (sum so far, current index) pair into the Multi-map
            insert(hashMap, sum, i);
        }
    }
}
