package ESGProject;

public class ReverseNumberByStringBuilder {

	public static void main(String[] args) {
		int num = 130;
		int reverse = 0;
		int remainder;
		int temp = num;
		while (num > 0) {
			remainder = num % 10;
			reverse = reverse * 10 + remainder;
			num = num / 10;

		}
		System.out.println(reverse);
		if (temp == reverse) {
			System.out.println("Given number is palindrom");
		} else {
			System.out.println("Given number is not palindrom");
		}
	}
}
