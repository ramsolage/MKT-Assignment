package ESGProject;

public class CapitalizeEachWordInString {

	public static void main(String[] args) {
		String s = "i am kartik from pune";
		String[] str = s.split(" ");
		for (String st : str) {
			System.out.print(st.substring(0, 1).toUpperCase() + 
					st.substring(1, st.length()) + " ");

		}

	}

}
