package sorts;

public class InsertionSort {
	public static int sort(int[] A, int comparisons) {
		for (int j = 1; j < A.length; j++) {
			int key = A[j];
			//Insert A[j] into the sorted sequence A[1...j-1]
			int i = j-1;
			while (i >= 0 && A[i] > key) {
				comparisons++;
				A[i + 1] = A[i];
				i = i - 1;
			}
			A[i+1] = key;
		}
		return comparisons;
	}
}