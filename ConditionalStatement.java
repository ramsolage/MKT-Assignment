package ESGProject;

public class ConditionalStatement {

	public static void main(String[] args) {
		int age = 18;
		String M = "Male";
		String F = "Female";
		if (age < 18) {
			System.out.println("Humans are eligible for Election Voter");
		} else {
			if (F == "Female")
				System.out.println("Female are not eligible for Election Voter");
		}
		if (M == "Male") {
			System.out.println("Male are Eligible for Voter");
		}
	}
}
