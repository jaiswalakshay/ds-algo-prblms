package com.sample;


import java.util.*;
import java.lang.*;

/**
 * Here, the idea is to sort the meeting by endTime, pick first meeting and then compare next startTime with previously selected endTime
 * if startTime > previously selected endTime
 *  then take it
 * else
 *  compare with next meeting startTime
 * <p>
 * keep on doing this
 */

public class OneMeetingRoom {
    public static void main(String[] args) {


        List<Integer> start = Arrays.asList(1, 3, 0, 5, 8, 5, 10, 11);

        List<Integer> end = Arrays.asList(2, 4, 6, 7, 9, 9, 15, 16);

        List<Integer> ret;

        ArrayList<IndexEndTimPair> endIndexEndTimePair = new ArrayList<IndexEndTimPair>();


        for (int i = 0; i < end.size(); i++) {
            IndexEndTimPair p = new IndexEndTimPair(i, end.get(i));
            endIndexEndTimePair.add(p);
        }

        Collections.sort(endIndexEndTimePair, new SortByEndTime());


        ret = meeting(start, endIndexEndTimePair);


        for (int i = 0; i < ret.size(); i++) {
            System.out.print(ret.get(i) + " ");
        }

        System.out.println();
    }

    static List<Integer> meeting(List<Integer> start, List<IndexEndTimPair> endIndexEndTimePair) {
        int n = start.size();

        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(endIndexEndTimePair.get(0).index);
        int end = endIndexEndTimePair.get(0).endTime;
        for (int i = 1; i < n; i++) {
            if (start.get(endIndexEndTimePair.get(i).index) > end) {
                arr.add(endIndexEndTimePair.get(i).index);
                end = endIndexEndTimePair.get(i).endTime;
            }
        }
        return (arr);
    }
}

class IndexEndTimPair {
    public int index, endTime;

    IndexEndTimPair(int index, int endTime) {
        this.index = index;
        this.endTime = endTime;
    }

    public String toString() {
        return (index + " " + endTime);
    }
}

class SortByEndTime implements Comparator<IndexEndTimPair> {

    public int compare(IndexEndTimPair C1, IndexEndTimPair C2) {
        return (C1.endTime - C2.endTime);
    }
}

