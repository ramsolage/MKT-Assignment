package ESGProject;

import java.util.Arrays;

public class CountNoofNumericalvalueandChar {

	public static void main(String[] args) {
		String s = "rameshwar123";
		int count = 0;
		char c[] = s.toCharArray();
		for (int i = 0; i < s.length(); i++) {

			boolean b = Character.isDigit(c[i]);
			if (b == true) {
				count++;
				
			}
			

		}
		System.out.println(count);

	}

}
