package ESGProject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArraylistProgram {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		ArrayList l = new ArrayList();
		l.add("Shital");
		l.add("Ram");
		l.add("Shivtej");
		l.add(null);
		l.add("Ram");
		l.add(1);
		l.add("R");
		l.add(true);
		l.add(10.5);
		l.add(null);
		System.out.println(l);
	    l.add(1,"Kartik");
	    System.out.println(l);
	    l.remove(5);
	    System.out.println(l);
	    l.set(7, false);
	    System.out.println(l);
	    System.out.println(l.get(2));
		System.out.println(l.get(0));
		System.out.println(l.size());
		Iterator it = l.iterator();        //iterator Method
		while (it.hasNext()) {
		System.out.println(it.next());
		}
		for(Object x:l)                    //For Each loop
		{
			System.out.println(x);
		}
	}

}
