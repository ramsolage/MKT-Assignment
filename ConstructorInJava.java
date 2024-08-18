package ESGProject;

public class ConstructorInJava {
	// Constructor is special type of method in java ,which does not have any return
	// type.
	// Constructor are always in non static in nature
	// always same name as class name.

	public static void main(String[] args) {
		// ConstructorInJava c = new ConstructorInJava();
//While accessing method we can directly access by creating an object without reference variable.
		new ConstructorInJava(); // this is second way
		new ConstructorInJava(10);
		new ConstructorInJava(20, 30);

	}

	ConstructorInJava() { // This is non Parameterized constructor
		System.out.println("print constructor");

	}

	ConstructorInJava(int a) { // This is Parameterized constructor (single parameter)
		System.out.println("print constructor " + a);

	}

	ConstructorInJava(int a, double b) { // This is Parameterized constructor(2 parameter)
		System.out.println("print constructor " + a + " and " + b);
//This also we can say that Constructor Overloading because same method name but different parameter
	}
}
