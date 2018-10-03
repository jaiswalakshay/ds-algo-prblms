package com.sample;

import java.util.Scanner;

public class BirthdayDishesProblem {
    public static void main(String args[]) throws Exception {

        Scanner scanner = new Scanner(System.in);
        int tests = scanner.nextInt();
        for (int z = 0; z < tests; z++) {
            int N = scanner.nextInt();
            int K = scanner.nextInt();

            int dishes[] = new int[N];
            for (int i = 0; i < dishes.length; i++) {
                dishes[i] = Integer.valueOf(scanner.next(), 2);
            }
            int power = 1 << K;
            int min = 11;

            for (int j = 1; j < power; j++) {
                int flag = 0;

                for (int k = 0; k < N; k++) {
                    if ((j & dishes[k]) == 0) {
                        flag = 1;
                        break;
                    }
                }
                if (flag != 1) {
                    min = Math.min(min, Integer.bitCount(j));
                }
            }
            System.out.println(min);
        }
   }
}