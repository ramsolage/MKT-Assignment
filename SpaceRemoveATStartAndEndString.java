package ESGProject;

public class SpaceRemoveATStartAndEndString {

	public static void main(String[] args) {
		String s = "rameshwar from pune 123";
		// System.out.println(s.trim()); //Removing space at start & at end of the string
		// System.out.println(s.replaceAll("\\s", "")); //Remove all space in the string
		System.out.println(s.replaceAll("\\s+", ""));   //Remove all space in the string 
		                                                 //and keeping single space only
		System.out.println(s.replaceAll("pune","solapur"));
		System.out.println(s.replaceAll("123",""));
		System.out.println(s.replaceAll("[123]",""));
		System.out.println(s.replaceAll("[a-z]","").trim());
		System.out.println(s.substring(14,19).trim());
		System.out.println(s.replace("r", "p"));
		System.out.println(s.replaceFirst("r", "p"));

		

	}

}
