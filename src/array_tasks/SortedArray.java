package array_tasks;

import java.util.Arrays;

public class SortedArray {

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
