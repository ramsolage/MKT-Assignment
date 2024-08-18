package ESGProject;

public class NonStaticMethodCallInMainMethod {
	int a=12;
	int b=20;

	public static void main(String[] args) {
		System.out.println("Main Method");
		NonStaticMethodCallInMainMethod add=new NonStaticMethodCallInMainMethod();
		add.addition();
		add.substraction();
		

	}
	void addition() {
		System.out.println("Addition of two number = " + (a+b));
		
	}
	void substraction() {
		System.out.println("Substraction of two number = " + (a-b));
		
	}
	

}
