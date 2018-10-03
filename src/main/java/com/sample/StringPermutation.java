package com.sample;

public class StringPermutation {

    public static void main(String args[]) {

        String str = "ABCD";
        printPermute(str, 0, str.length() - 1);

    }


    public static void printPermute(String str, int l, int r) {
        if (l == r) {
            System.out.println(str);
        } else {
            for (int i = l; i <= r; i++) {
                str = swap(str, l, i);
                printPermute(str, l + 1, r);
                str = swap(str, i, l);
            }
        }

    }

    public static String swap(String str, int i, int j) {
        char[] arr = str.toCharArray();

        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

        return String.valueOf(arr);
    }
}
