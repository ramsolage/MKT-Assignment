package ESGProject;

class A { // Parent Class/SuperClass
	void MethodAA() {
		System.out.println("Method AA");
	}
}

class BB extends A { // Child Class/subclass
	void MethodBB() {
		System.out.println("Method BB");

	}
}
public class SingleLevelInheritance { // This main class create an object of child class
	public static void main(String[] args) {
		BB s = new BB();
		s.MethodAA();
		s.MethodBB();
		System.out.println("Method Main");
	}
}
