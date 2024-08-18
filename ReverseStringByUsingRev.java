package ESGProject;

import java.util.Scanner;

public class ReverseStringByUsingRev {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		// String s = "Rameshwar";
		String rev = "";
		int l = s.length();
		for (int i = l - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);

		}
		System.out.println(rev);

	}
}
