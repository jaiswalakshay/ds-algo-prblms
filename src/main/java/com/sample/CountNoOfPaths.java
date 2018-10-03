package com.sample;

import java.util.LinkedList;

public class CountNoOfPaths {
    public static int countPaths(int m, int n){
        if (m == 1 || n == 1) return 1;
        int memo[][] = new int[m][n];
        for (int i = 0; i < m; i++){
            memo[i][0] = 1;
            memo[0][i] = 1;
        }
        for (int i = 1; i < m; i++){
            for (int j = 1; j < n; j++){
                memo[i][j] = memo[i-1][j] + memo[i][j-1];
            }
        }
        return memo[m-1][n-1];
    }

    public static void main(String[] args) {
        System.out.println(countPaths(10,10));

        LinkedList<Integer> lis = new LinkedList();
        lis.push(3);
        lis.pollFirst();
    }
}
