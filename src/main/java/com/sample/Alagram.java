package com.sample;

import java.util.HashMap;
import java.util.Map;

public class Alagram {

    public static void main(String[] args) {
        System.out.print(gcd(4, 8));
    }

    private static int getMinDiff(String a, String b) {
        Integer dist = 0;
        Map<Character, Integer> count = new HashMap<>();
        if (a.length() != b.length()) {
            return -1;
        }
        Integer cnt;
        char[] a_array = a.toCharArray();
        char[] b_array = b.toCharArray();
        for (int i = 0; i < a_array.length; i++) {
            cnt = count.getOrDefault(a_array[i], 0);
            count.put(a_array[i], cnt + 1);
        }
        for (int i = 0; i < b_array.length; i++) {
            cnt = count.get(b_array[i]);
            if (cnt == null || cnt == 0) {
                dist++;
            } else
                count.put(b_array[i], cnt - 1);
        }

//        for(int i : count.values()){
//            dist = dist + i;
//        }
        return dist;
    }

    private static int gcd(int x, int y) {
        if (x == 0 || y == 0) {
            return 0;
        }
        if (x == y) {
            return x;
        }
        if (x > y)
            return gcd(x - y, y);
        return gcd(x, y - x);
    }


}
