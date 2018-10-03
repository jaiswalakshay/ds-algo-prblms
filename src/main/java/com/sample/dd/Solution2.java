package com.sample.dd;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Solution2 {

    public static int solution(int N, String S) {
        // write your code in Java SE 8
        int count = 0;
        if(S !=null && S.length() ==0 ){
            return 3*N;
        }
        Set<String> hashSet = new HashSet<>(Arrays.asList(S.split("\\s+")));
        for(int i=1;i<=N ; i++){
            if(!(hashSet.contains(i+"A") || hashSet.contains(i+"B") || hashSet.contains(i+"C"))){
                count++;
            }
            if(!(hashSet.contains(i+"E") || hashSet.contains(i+"F"))){
                count++;
            }
            if(!(hashSet.contains(i+"H") || hashSet.contains(i+"J") || hashSet.contains(i+"K"))){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) throws IOException {

        System.out.println(solution(2, "1A 2F 1C"));
    }
}
