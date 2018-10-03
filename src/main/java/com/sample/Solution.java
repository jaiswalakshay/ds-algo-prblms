package com.sample;

import java.util.Arrays;

public class Solution {

    static long countWays(int coins[], int total) {
       int[] temp =  new int[total+1];
       temp[0]=1;
       for(int i=0;i<coins.length ;i++){
           for(int j =1;j<=total;j++){
               if(j>= coins[i]){
                   temp[j] = temp[j] + temp[j-coins[i]];
               }
           }
       }
       return temp[total];
    }

    static long minimumNoOfCoins(int coins[], int total) {
        int[] temp =  new int[total+1];

        for(int i=1;i<temp.length;i++){
            temp[i] = Integer.MAX_VALUE;
        }
        temp[0]=0;
        for(int i=0;i<coins.length ;i++){
            for(int j =1;j<=total;j++){
                if(j>= coins[i]){
                    temp[j]=Integer.min(temp[j],1+temp[j-coins[i]]);
                }
            }
        }
        return temp[total];
    }

    // Driver Function to test above function
    public static void main(String args[]) {
        int arr[] = {1, 2,3,7,4};
        int n = 4;
        System.out.println(countWays(arr, n));
        System.out.println(minimumNoOfCoins(arr, n));
        System.out.println(getWays( n,arr));
        System.out.println(String.format("Akshay%nJaiswal"));


    }
    static long getWays(int n, int[] c) {
        int[] temps= new int[n+1];
        temps[0]=1;

        for(int i=0;i< c.length ;i++){
            for(int j=1; j<= n;j++){
                if(j >= c[i]){
                    temps[j]= temps[j] + temps[j-c[i]];
                }
            }
        }
        return temps[(int)n];

    }

}
