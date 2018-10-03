package com.sample;

public class CandiesProblem {
    public static void main(String[] args) {
        int[] arr = {2, 4, 2, 6, 1, 7, 8, 9, 2, 1};
        candies(arr.length, arr);
    }

    static long candies(int N, int[] arr) {
        int candie[] = new int[N];
        candie[0] = 1;
        System.out.println(arr[0] + " " + candie[0]);
        for (int i = 1; i < N; i++) {
            candie[i] = 1;
            if (arr[i] > arr[i - 1]) {
                candie[i] = candie[i - 1] + 1;
            }

            System.out.println(arr[i] + " " + candie[i]);
        }
        long sum = candie[N - 1];
        for (int i = N - 2; i >= 0; i--) {
            if (arr[i] > arr[i + 1]) {
                candie[i] = Math.max(candie[i], candie[i + 1] + 1);
            }
            sum += candie[i];
        }
        return sum;
    }

}
