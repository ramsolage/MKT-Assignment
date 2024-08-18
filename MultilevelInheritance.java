package ESGProject;

class A1 { // A Parent Class/SuperClass
	void MethodA() {
		System.out.println("Method 1");
	}
}

class B1 extends A1 { // B Child Class
	int a=200;
	void MethodB() {
		System.out.println("Method 2");

	}
}

class C1 extends B1 {
	int b=100;
	void MethodC() {
		System.out.println("Method 3");

	}
}

   class MultilevelInheritance { // Child Class/subclass
	public static void main(String[] args) {
		C1 M = new C1();                     //Last Child object created
		//OR
		//MultilevelInheritance M1=new MultilevelInheritance();
		System.out.println("MultilevelInheritance");
		M.MethodA();
		M.MethodB();
		M.MethodC();
		System.out.println(M.a);
		System.out.println(M.b);
	}

}
