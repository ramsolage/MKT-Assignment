package ESGProject;

public class ThrowKeyword {

	public static void main(String[] args) {
		int age = 1;
		if (age < 18) {
			// throw Arithmetic exception if not eligible to vote
			throw new ArithmeticException("Person is not eligible to vote");
		} else {
			System.out.println("Person is eligible to vote!!");
		}
	}
}
