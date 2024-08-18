package ESGProject;

import java.util.Arrays;

public class ArraySorting {

	public static void main(String[] args) {
		int array[] = { 1, 3, 4, 2, 5, 6, 7, 10, 8, 9 };
		int temp = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if(array[i]>array[j]) {
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}

			}
		}
		System.out.println("Sorted array" +" "+ Arrays.toString(array));
	}

}
