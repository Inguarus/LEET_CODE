package StringTasks;

/*
Given an array of integers A sorted in non-decreasing order,
return an array of the squares of each number, also in sorted non-decreasing order.
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
