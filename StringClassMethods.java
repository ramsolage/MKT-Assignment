package ESGProject;

public class StringClassMethods {

	public static void main(String[] args) {
		String s = "world is full of beautiful people";
		String r = "remeshwar";
		String t="";
		String u="school123";
		String name = "School name is Vidya";
		System.out.println(s.length());
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		System.out.println(s.charAt(2));
		System.out.println(s);
		System.out.println(s.trim());
		System.out.println(s.equals(r));
		System.out.println(s.equalsIgnoreCase(r));
		System.out.println(s.contains("x"));
		System.out.println(s.substring(3));
		System.out.println(s.substring(0, 3));
		System.out.println(name.substring(7, 11));
		System.out.println(name.substring(12, 14));
		System.out.println(name.substring(15, 20));
		System.out.println(name.indexOf("m"));
		System.out.println(s.isEmpty());
		System.out.println(t.isEmpty());
		System.out.println(name.lastIndexOf("is"));
		System.out.println(name.replaceAll("Vidya", "Ram"));
		System.out.println(name.replaceAll("\\s",""));
		System.out.println(u.replaceAll("[0-9]", ""));
		System.out.println(u.replaceAll("[a-z]", ""));
		System.out.println(u.matches("s(.*)"));            //Multi Character search
		System.out.println(u.matches("(.*)3"));

}
}
