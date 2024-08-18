package ESGProject;

public class LogicalOperator {

	public static void main(String[] args) {
		int a=10;
		int b=11;
		//boolean c=true;
		if(a==10&&b==12)
		{
			System.out.println("it should show the output");
		}
		else {
			System.out.println("It should not show any output");
		}
		if(a==10||b==12)
		{
			System.out.println("it should show the output");
		}
		else {
			System.out.println("It should not show any output");
		}
		if(!(a==10&&b==11))
		{
			System.out.println("print output");
	}
		else {
			System.out.println("No output");
		}

}
}
