package array_tasks;

public class ArrayByParity {

    public static void main(String[] args) {

    }

    public int[] sortArrayByParity(int[] A) {
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
