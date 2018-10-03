package com.sample.dd;

class Solution3 {
    public static int solution1(int[] A) {

        int max = Integer.MIN_VALUE;
        boolean isAlternate = false;
        for (int i = 0; i < A.length - 1; i++) {
            for (int j = 1; j < A.length; j++) {
                boolean isPrevPostive = false;
                isAlternate = false;
                if (A[i] >= 0)
                    isPrevPostive = true;
                else
                    isPrevPostive = false;

                for (int k = i; k < j; k++) {
                    if (isPrevPostive && A[k] >= 0) {
                        isAlternate = false;
                    } else if (isPrevPostive && A[k] <= 0) {
                        isAlternate = true;
                    } else if (!isPrevPostive && A[k] >= 0) {
                        isAlternate = true;
                    } else if (isPrevPostive && A[k] >= 0) {
                        isAlternate = false;
                    }
                }
                if (isAlternate && (j - i) > max) {
                    max = j - 1;
                }
            }
        }
        return max;
    }

    public static void main(String... args) {
        solution1(new int[]{5, 4, -3, 2, 0, 1, -1, 0, 2, -3, 4, -5});
    }

    public int solution(int[] A) {
        int max = 1;
        boolean isAlternate = false;
        for (int i = 0; i < A.length - 1; i++) {
            for (int j = 1; j < A.length; j++) {
                boolean isPrevPostive = false;
                isAlternate = false;
                if (A[i] >= 0)
                    isPrevPostive = true;
                else
                    isPrevPostive = false;

                for (int k = i; k < j; k++) {

                    if (A[k] == 0) {
                        isAlternate = true;
                        isPrevPostive = !isPrevPostive;
                    } else if (isPrevPostive && A[k] >= 0) {
                        isAlternate = false;
                        break;
                    } else if (isPrevPostive && A[k] <= 0) {
                        isAlternate = true;
                        isPrevPostive = !isPrevPostive;

                    } else if (!isPrevPostive && A[k] >= 0) {
                        isAlternate = true;
                        isPrevPostive = !isPrevPostive;

                    } else if (isPrevPostive && A[k] >= 0) {
                        isAlternate = false;
                        break;
                    }
                    isPrevPostive = (A[i] >= 0) ? true : false;
                }
                if (isAlternate && (j - i) > max) {
                    max = j - 1;
                }
            }
        }
        return max;
    }

    public int solutions(int[] A) {
        int start = 0, max = 1;
        for (int i = 1; i < A.length; i++) {
            if ((A[i] <= 0 && A[i - 1] >= 0) || (A[i] >= 0 && A[i - 1] <= 0)) {
                if (i == A.length - 1) {
                    int length = i - start + 1;
                    if (length > max) {
                        max = length;
                    }
                } else {
                    int length = i - start;
                    if (length > max) {
                        max = length;
                    }
                    start = i;
                }
            }
        }
        return max;

    }


}