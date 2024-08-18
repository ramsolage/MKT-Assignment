package ESGProject;
//Developing multiple method with same name but variation in arguments is called Method over loading
public class MethodOverloading {

	public static void main(String[] args) {
		add(2);
		add();
		add(10, "Ram");
		MethodOverloading Md = new MethodOverloading();
		// for calling not static method created object
		Md.add(10, "kartik", 20);
		// with the help of reference variable we can access the not static method

	}

	static void add() // static non parameterized method
	{
		System.out.println("Static method");

	}

	static void add(int a) { // static single parameterized method
		System.out.println("Print valaue of a =" + a);
	}

	static void add(int b, String name) {// static parameterized method same method name(add)
		System.out.println("Print valaue of a = " + b + " and " + " print value of name = " + name);
	}

	void add(int c, String name, double d) { // Non static parameterized method
		System.out.println("Print valaue of a =" + c + " " + " " + name + " " + d);

	}
}
