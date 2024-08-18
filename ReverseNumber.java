package ESGProject;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		/*Scanner s = new Scanner(System.in);
		System.out.println("Enter num");
		int num = s.nextInt();
		int a = num;*/
		int num=123;
		int remainder;
		int reverse = 0;
		int temp=num;
		while (num > 0) {
			remainder = num % 10;
			reverse = reverse * 10 + remainder;
			num = num / 10;
		}
		System.out.println(reverse);
		if (temp==reverse) {
			System.out.println("Given number is palindrom");
		} else {
			System.out.println("Given number not is palindrom");
		}
	}
	}
