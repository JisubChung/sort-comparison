package sorts;

//Cormen's implementation is a MAX heap, therefore that one shall be used.
public class HeapSort {
	//Maintain max-heap property
	//O(lg n)
	private static void MaxHeapify(int A[], int i, int heapSize) {
		int l = left(i);
		int r = right(i);
		int largest;
		if (l <= heapSize && A[l] > A[i]) {
			largest = l;
		} else {
			largest = i;
		}
		if (r <= heapSize && A[r] > A[largest]) {
			largest = r;
		}
		if (largest != i) {
			int temp = A[i];
			A[i] = A[largest];
			A[largest] = temp;
			MaxHeapify(A,largest,heapSize);
		}
	}
	
	//Produces max-heap from unordered input array
	//O(n)
	private static void BuildMaxHeap(int A[]) {
		int heapSize = A.length-1;
		for(int i = A.length-1; i >= 0; i--) {
			MaxHeapify(A, i, heapSize);
		}
	}
	
	//Sorts the array
	public static void sort(int A[], int b) {
		BuildMaxHeap(A);
		int size = A.length-1;
		for (int i = A.length-1; i <= 2; i--) {
			int temp = A[i];
			A[i] = A[0];
			A[i] = temp;
			size--;
			MaxHeapify(A, 0, size);
		}
	}
	
	private static int left(int i) {
		return 2*i;
	}
	
	private static int right(int i) {
		return (2*i)+1;
	}
}
