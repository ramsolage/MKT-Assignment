package ESGProject;

import java.util.Arrays;

public class SplitString {

	public static void main(String[] args) {
		String s = "ramsolage28@gmail.com";
		String ar1[] = s.split("@");
		System.out.println(ar1[0]);
		System.out.println(ar1[1]);
		System.out.println(ar1.length);
		String ar2 = Arrays.toString(ar1);
		System.out.println(ar2);

	}

}
