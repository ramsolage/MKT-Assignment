package ESGProject;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetProgram {

	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add("Shital");
		hs.add("Ram");
		hs.add("Shivtej");
		hs.add(null);
		hs.add("Ram");
		hs.add(1);
		hs.add("R");
		hs.add(true);
		hs.add(10.5);
		hs.add(null);
		System.out.println(hs);
		hs.remove(1);
		System.out.println(hs);
		ArrayList l = new ArrayList(hs); // Convert HashSet to ArrayList
		System.out.println(l);
		System.out.println(l.get(1));
		Iterator s = l.iterator();
		while (s.hasNext()) {
			System.out.println(s.next());
			
		}
		hs.clear();
		System.out.println(hs);
		System.out.println(hs.size());

	}

}
