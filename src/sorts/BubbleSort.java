package sorts;

public class BubbleSort {
	public static int sort(int[] A, int comparisons) {
		for (int i = 0; i <= A.length-1; i++) {
			for (int j = A.length-1; j >= i+1; j--) {
				comparisons++;
				if (A[j] < A[j-1]) {
					int temp = A[j];
					A[j] = A[j-1];
					A[j-1] = temp;
				}
			}
		}
		return comparisons;
	}
}
