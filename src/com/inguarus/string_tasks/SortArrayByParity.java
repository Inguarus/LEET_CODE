package com.inguarus.string_tasks;

/*
Given an array_tasks A of non-negative integers, return an array_tasks consisting of all
the even elements of A, followed by all the odd elements of A.
You may return any answer array_tasks that satisfies this condition.
 */

class SortArrayByParity {

    public static void main(String[] args) {
    }

    public static int[] sortArrayByParity(int[] A) {
        int[] resultArr = new int[A.length];
        int oddPos = 0;
        int evenPos = A.length - 1;
        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 != 0) {
                resultArr[evenPos] = A[i];
                evenPos--;
            } else {
                resultArr[oddPos] = A[i];
                oddPos++;
            }
        }
        return resultArr;
    }
}


