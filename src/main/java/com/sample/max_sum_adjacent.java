package com.sample;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class max_sum_adjacent {

    static int cost(int[] B) {
        int length = B.length;
        List<List<Integer>> combinations = new ArrayList<>();
        int hi = 0, low = 0;
        int high_to_low_diff, low_to_high_diff, high_to_high_diff;
        for (int i = 1; i < length; i++) {
            high_to_low_diff = Math.abs(B[i - 1] - 1);
            low_to_high_diff = Math.abs(B[i] - 1);
            high_to_high_diff = Math.abs(B[i] - B[i - 1]);
            int low_next = Math.max(low, hi + high_to_low_diff);
            int hi_next = Math.max(hi + high_to_high_diff, low + low_to_high_diff);
            low = low_next;
            hi = hi_next;
        }
        return Math.max(hi, low);

    }


    public static void main(String[] args)  {


            int result = cost(new int[]{100,100,100,100});
            System.out.println(result);

    }
}
