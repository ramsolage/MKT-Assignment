package ESGProject;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("String input");
		int s = s1.nextInt();
		int s2 = s1.nextInt();
		int s3 = s + s2;
		System.out.println(s3);
		System.out.println("Enter the name");
		String S4 = s1.next();
		s1.close();
	}
}
