package sorts;

public class Main {

	public static void main(String[] args) {
		int comparisons = 0;
		int[] input = {5,4,3,2,1};
		
		System.out.println("---BubbleSort---");
		//comparisons = BubbleSort.sort(input, comparisons);
		for(int i = 0; i < input.length; i++) {
			System.out.print(input[i] + " ");
		}
		System.out.println("\nNumber of Comparisons: " + comparisons);

		System.out.println("---InsertionSort---");
		comparisons = InsertionSort.sort(input, comparisons);
		for(int i = 0; i < input.length; i++) {
			System.out.print(input[i] + " ");
		}
		System.out.println("\nNumber of Comparisons: " + comparisons);
	}
}
