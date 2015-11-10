package sorts;

public class MergeSort {
	private static int merge(int A[], int start, int middle, int end, int comparisons) {
		int n1 = middle - start + 1;
		int n2 = end - middle;
		int[] left = new int[n1+1];
		int[] right = new int[n2+1];
		int i, j;
		for (i = 0; i < n1; i++) {
			left[i]  = A[start + i];
		}
		for (j = 0; j < n2; j++) {
			right[j] = A[middle+j+1];
		}
		//while this isn't the most efficient way to run MergeSort,
		// it is the one implemented by Cormen.
		left [n1] = (int) (Math.pow(left[n1-1], 2) + Math.pow(end, 2)); 
		right[n2] = (int) (Math.pow(right[n2-1], 2) + Math.pow(end, 2));
		
		i = 0;
		j = 0;
		for (int k = start; k <= end; k++) {
			comparisons++;
			if (left[i] <= right[j]) {
				A[k] = left[i];
				i++;
			} else {
				A[k] = right[j];
				j++;
			}
		}
		return comparisons;
	}
	
	private static int sort(int A[], int start, int end, int comparisons) {
		if (start < end) {
			int middle = (start+end)/2;
			int comps1 = sort(A, start, middle, comparisons);
			int comps2 = sort(A, middle+1, end, comparisons);
			comparisons+=merge(A, start, middle, end, comps1+comps2);
		}
		return comparisons;
	}

	public static int sort(int A[], int comparisons) {
		return sort(A,0,A.length-1,0);
	}
}
