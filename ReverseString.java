package ESGProject;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		String input=sc.next();
		//String input = "aba";
		String rev = " ";
		for (int i = input.length()-1; i >=0; i--) {
			rev = rev + input.charAt(i);
		}
		System.out.println(rev);

		if(rev.equalsIgnoreCase(input)) {
			System.out.println("Given String is Palindrom");
		}
		else {
			System.out.println("Given String is not Palindrom");
		}
	}
}