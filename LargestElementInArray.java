package ESGProject;

public class LargestElementInArray {
	public static void main(String[] args) {

		int[] a = { 25, 11, 7, 75, 56 };
		// System.out.println("Largest element in an array: ");
		// Initialize max with first element of array.
		int max = a[0];
		// loop through the array
		for (int i = 0; i < a.length; i++) {
			// Compare elements of array with max
			if (a[i] > max) // 25 11>25 7>25 75>25 56>75
				max = a[i];// 25 75

		}
		System.out.println("Largest element present in given array: " + max);
	}

}