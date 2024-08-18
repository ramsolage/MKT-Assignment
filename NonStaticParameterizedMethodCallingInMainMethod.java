package ESGProject;

public class NonStaticParameterizedMethodCallingInMainMethod {

	public static void main(String[] args) {
		
NonStaticParameterizedMethodCallingInMainMethod Np=
new NonStaticParameterizedMethodCallingInMainMethod();
//Create an Object for Calling non static method
		
		Np.addition(1, 2); //Reference variable.method name.
		Np.substraction(3, 2);

	}
	void addition(int a,int b) {      //Non Static Parameterized Method
		int sum=a+b;
		System.out.println(sum);
		

}
	void substraction(int a,int b) {      //Non Static Parameterized Method
		int sub=a-b;
		System.out.println(sub);
}
}
