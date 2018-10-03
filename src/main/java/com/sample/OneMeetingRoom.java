package com.sample;


import java.util.*;
import java.lang.*;
import java.io.*;

class pair {
    public int n1, n2;

    pair(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public String toString() {
        return (n1 + " " + n2);
    }
}

class sortby implements Comparator<pair> {

    public int compare(pair C1, pair C2) {
        return (C1.n2 - C2.n2);
    }
}


public class OneMeetingRoom {
    public static void main(String[] args) {


        List<Integer> start = Arrays.asList(1, 3, 0, 5, 8, 5,10,11);

        List<Integer> end = Arrays.asList(2, 4, 6, 7, 9, 9,15,16);

        List<Integer> ret ;

        ArrayList<pair> endpair = new ArrayList<pair>();


        for (int i = 0; i < end.size(); i++) {
            pair p = new pair(i, end.get(i));
            endpair.add(p);
        }

        Collections.sort(endpair, new sortby());


        ret = meeting(start, endpair);

        //  for (int i = 0; i < n; i++){
        //      // Spair p = new pair(i, end.get(i));
        //      System.out.println(endpair.get(i));
        //  }

        for (int i = 0; i < ret.size(); i++) {
            System.out.print(ret.get(i) + " ");
        }

        System.out.println();
    }

    static List<Integer> meeting(List<Integer> start, List<pair> endpair) {
        int n = start.size();

        ArrayList<Integer> arr = new ArrayList<Integer>();

        arr.add(endpair.get(0).n1 + 1);
        // int
        int end = endpair.get(0).n2;
        for (int i = 1; i < n; i++) {

            // int nextIndex = endpair.get(i).n1;
            if (start.get(endpair.get(i).n1) > end) {
                arr.add(endpair.get(i).n1 + 1);
                end = endpair.get(i).n2;
            }
            // int nextStart =
        }
        return (arr);
    }
}