package ESGProject;

public class CallingStaticMethodsInMainMethod {

	public static void main(String[] args) {
		System.out.println("Java First Program");
		addition();          //Static method Directly call in main method by method name
		substraction();

	}

	static void addition() {
		System.out.println("addition of two number");
	}

	static void substraction() {
		System.out.println("Substraction");
	}

}
