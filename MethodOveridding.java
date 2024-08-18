package ESGProject;

class AB { // A Parent Class/SuperClass

	void MethodA() {

		System.out.println("Method A");

	}

}

class BA extends AB { // B Child Class

	void MethodA() {

		System.out.println("Method B");

		super.MethodA();                 //By super keywords we can access the Parent method

	}                    //suppose if not used super keyword then parent class output will not got 
                          // because method is overriding
}

public class MethodOveridding {

	public static void main(String[] args) {

		BA M = new BA();                       //Created object of the child class
		System.out.println("MultilevelInheritance");

		M.MethodA();

	}

}
