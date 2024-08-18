package ESGProject;

public class LocalVariable { //any variable declare in inside the any method.

	void show() { // Non static method
		int a = 10; // Local Variable having scope only in method to method.
		System.out.println(a);
	}

	static void show(int b) { // static method
		System.out.println(b);
	}

	static void add() {
		String name = "ram";         //Local Variable
		System.out.println(name);

	}

	void sub() {
		String name = "rameshwar";   //Local Variable
		System.out.println(name);

	}

	public static void main(String[] args) {
		LocalVariable lv = new LocalVariable(); // Create an object
		lv.show(); // Called non static method with the help of reference variable.
		show(20); // static method can directly in main method.
		add();
		lv.sub();
	    int a=200;   //Local Variable
	    System.out.println(a);
	}

}
