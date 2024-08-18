package ESGProject;

public class FinalVariable {
	final static int a=10;
	int b=100;
	void area() {
		final double pi=Math.PI;
		//final int r=2;
		final double r=Math.random();
		System.out.println(pi*r*r);
	}
	void circumference() {
		final double pi=Math.PI;
		//final int r=2;
		final double r=Math.random();
		System.out.println(2*pi*r);
	}

	public static void main(String[] args) {
		final String c="Ram";
		final String d ="Kartik";
		System.out.println(a);
		System.out.println(c);
		System.out.println(d);
		FinalVariable fn=new FinalVariable();
		System.out.println(fn.b);
		fn.area();
		fn.circumference();

	}

}
