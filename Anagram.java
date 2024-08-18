package ESGProject;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {

		String s1 = "ear";

		String s2 = "are";

		char[] array1 = s1.toCharArray();

		char[] array2 = s2.toCharArray();

		Arrays.sort(array1);

		Arrays.sort(array2);

		if (Arrays.equals(array1, array2) == true) {

			System.out.println("Number is Alaram");

		} else {

			System.out.println("Number is not Alaram");

		}

	}

}
