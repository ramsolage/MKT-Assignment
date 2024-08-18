package ESGProject;

class AbstractClass {

	public static void main(String[] args) {

		System.out.println("Print Mian method");

		car s = new car();
		s.fourWheeler();

	}

}

abstract class Vehical {

	abstract void twoWheeler1();
	void twoWheeler() {

		System.out.println("Child Class");

	}

}

class car extends Vehical {

	void fourWheeler() {

		System.out.println("Child Class");

	}

	@Override
	void twoWheeler1() {
		// TODO Auto-generated method stub
		
	}

}
