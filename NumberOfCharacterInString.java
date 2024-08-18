package ESGProject;

import java.util.Scanner;

public class NumberOfCharacterInString {

	public static void main(String[] args) {
		String s= "world is full of beautiful people";
		int count = 0;
		System.out.println(s.length());
		String s1=s.replaceAll("\\s","");
		System.out.println(s1.length());
		System.out.println(s.length());
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != ' ')
				count++;
		}
		System.out.println("Total number of characters in a string: " + count);
	}
}