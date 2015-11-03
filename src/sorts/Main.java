package sorts;

public class Main {

	public static void main(String[] args) {
		BubbleSort b = new BubbleSort();
		int[] input = {1,5,37,7,3,8,9,12};
		b.sort(input);
		for(int i = 0; i < input.length; i++) {
			System.out.print(input[i] + " ");
		}

	}

}
