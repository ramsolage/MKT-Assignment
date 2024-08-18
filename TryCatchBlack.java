package ESGProject;

public class TryCatchBlack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = null;
		try {
			//System.out.println(100 / 0);
			System.out.println(s.length());

		}

		//catch (ArithmeticException e) {
			//System.out.println("Handled Arithemtic Exception");
			//System.out.println(e.getMessage());

		//} 
		catch (NullPointerException e) {
			System.out.println("Handled Null pointer Exception");
			System.out.println(e.getMessage());

		}

	}

}
