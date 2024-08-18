package ESGProject;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapProgram {

	public static void main(String[] args) {
		HashMap Hp=new HashMap();
		Hp.put(1,"Ram");
		Hp.put(2,"Shital");
		Hp.put(3,"Shivtej");
		Hp.put(4,"Kartik");
		Hp.put(5,"Pappu");
		System.out.println(Hp.entrySet());	
		System.out.println(Hp.keySet());
		System.out.println(Hp.values());
		System.out.println(Hp.size());
		Hp.remove(1);
		System.out.println(Hp.get(5));
		System.out.println(Hp.entrySet());
		     Iterator<Entry<Integer,String>>im=Hp.entrySet().iterator();
		     while(im.hasNext()) {
		    	 Entry<Integer,String>entry=im.next();
		    	System.out.println(entry.getKey() + " " + entry.getValue());
 		    	
		     }

	}

}
