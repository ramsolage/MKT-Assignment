package ESGProject;

public class PalindromNumber {
	public static void main(String[] args) {

		int num = 121;
		int remainder;
		int reverse = 0;
		int temp = num;

		while (num > 0) {
			remainder = num % 10;
			reverse = reverse * 10 + remainder;
			num = num / 10;
		}
		if (temp == reverse) {
			System.out.println("Given number is palindrom");
		} else {
			System.out.println("Given number not is palindrom");
		}
	}
}
