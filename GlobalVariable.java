package ESGProject;

public class GlobalVariable {// any variable declare outside the any method but inside the class
	static int a = 1000;
	static String name = "Ram Solage";
	float f = 100.01f; // Global Variable
	double d = 12222222222222.33333333;
	static int z;

	static void run() {
		int b = 2000;
		System.out.println(a + b);
	}

	void eat() {
		String fruit = "Mango";
		System.out.println(fruit);
	}

	void eat(String f) {
		System.out.println(f);
	}

	GlobalVariable() {
		System.out.println("Rameshwar Solage");
	}
	GlobalVariable(String s) {
		System.out.println(s);
	}

	public static void main(String[] args) {
		int c = 3000;
		int z = 0;
		System.out.println(c);
		System.out.println(a);
		System.out.println(name);
		System.out.println(z);
		run();
		GlobalVariable gv = new GlobalVariable();
		gv.eat();
		gv.eat("Apple");
		new GlobalVariable();
		new GlobalVariable("Kartik");

	}

}
