package ESGProject;

public class ReverseStringByStringBuilder {

	public static void main(String[] args) {
		String s = "Solage";
		StringBuilder b = new StringBuilder(s);
		StringBuilder rev=b.reverse();
		System.out.println(rev);	
		}
	
}
