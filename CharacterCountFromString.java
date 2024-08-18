package ESGProject;

import java.util.HashMap;

public class CharacterCountFromString {

	public static void main(String[] args) {
		String s = "Rameshwar from pune";
		HashMap<Character, Integer> h = new HashMap<Character, Integer>();
		for (int i = 0; i < s.length(); i++) {
			if (h.containsKey(s.charAt(i))) 
			{
				int count = h.get(s.charAt(i));
				h.put(s.charAt(i), ++count);
			} else {
				h.put(s.charAt(i), 1);

			}
		}
		System.out.println(h);

	}
}
