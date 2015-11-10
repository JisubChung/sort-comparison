package sorts;

public class Main {

	public static void main(String[] args) {
		int comparisons = 0;
		int[] input = {4,3,2,1};
		boolean[] doSort = {
				false, //InsertionSort
				false, //BubbleSort
				false, //MergeSort
				true, //HeapSort
				false};//QuickSort
		
		if(doSort[0]) {
			System.out.println("---InsertionSort---");
			comparisons = InsertionSort.sort(input, comparisons);
			printInfo(input, comparisons);
		}
		if(doSort[1]) {
			System.out.println("---BubbleSort---");
			comparisons = BubbleSort.sort(input, comparisons);
			printInfo(input, comparisons);
		}
		if(doSort[2]) {
			System.out.println("---MergeSort---");
			comparisons = MergeSort.sort(input, comparisons);
			printInfo(input, comparisons);
		}
		if(doSort[3]) {
			System.out.println("---HeapSort---");
//			comparisons = 
					HeapSort.sort(input, comparisons);
			printInfo(input, comparisons);
		}
		if(doSort[4]) {
			System.out.println("---QuickSort---");
//			comparisons = QuickSort.sort(input, comparisons);
			printInfo(input, comparisons);
		}
	}
	
	private static void printInfo (int input[], int comparisons) {
		for(int i = 0; i < input.length; i++) {
			System.out.print(input[i] + " ");
		}
		System.out.println("\nNumber of Comparisons: " + comparisons);		
	}
}
