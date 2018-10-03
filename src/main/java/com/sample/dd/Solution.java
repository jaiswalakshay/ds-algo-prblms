package com.sample.dd;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Solution {

    // Complete the getWays function below.
    static long getWays(long n, long... c) {
        int[] temps = new int[(int) n + 1];
        temps[0] = 1;

        for (int i = 0; i < c.length; i++) {
            for (int j = 1; j <= (int) n; j++) {
                if (j >= (int) c[i]) {
                    temps[j] = temps[j] + temps[j - (int) c[i]];
                }
            }
        }
        return (long) temps[(int) n];

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        // Print the number of ways of making change for 'n' units using coins having the values given by 'c'
        System.out.print(getWays(3,8,3,1,2));
        scanner.close();

        String abc= "1A 2A 3C";
        String[] splits =abc.split("//s+");
        Set<String> hashSet = new HashSet<>(Arrays.asList(abc.split("//s+")));
        System.out.println();
        System.out.println(hashSet);
    }
}
