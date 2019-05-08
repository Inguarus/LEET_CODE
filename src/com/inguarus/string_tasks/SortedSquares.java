package com.inguarus.string_tasks;

/*
Given an array_tasks of integers A sorted in non-decreasing order,
return an array_tasks of the squares of each number, also in sorted non-decreasing order.
 */

import java.util.Arrays;

public class SortedSquares {
    public static void main(String[] args) {
    }

    public int[] sortedSquares(int[] A) {
        int[] resultSquare = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            resultSquare[i] = A[i] * A[i];
        }
        Arrays.sort(resultSquare);
        return resultSquare;
    }
}
