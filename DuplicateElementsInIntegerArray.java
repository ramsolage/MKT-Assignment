package ESGProject;

public class DuplicateElementsInIntegerArray {
	public static void main(String[] args) {
		// find duplicate elements in an array
		int[] a = { 1, 2, 3, 4, 2, 8 };
		System.out.println("Duplicate elements in an array: ");
		// outer loop run once and inner loop runs till condition fail
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) { // 1 ;1<9 ;2 //2 <9; 3
				if (a[i] == a[j]) { // 1 == 2,2
					System.out.print(a[j]+ " ");
				}
			}
		}
	}
}
