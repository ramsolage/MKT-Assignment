package ESGProject;

class parent{
	void boss()
	{
		System.out.println("Main person in the home");
	}
}
class childfirst extends parent{
	void firstchild() {
		System.out.println("First child in the home");
		
	}
}
class childsecond extends parent{
	void secondchild() {
		System.out.println("Second child in the home");
		
	}
}
public class HierarchialInheritance {
public static void main(String[] args) {
	childfirst cf=new childfirst();
	childsecond cs=new childsecond();
	cf.boss();
	cs.boss();
	cf.firstchild();
	cs.secondchild();
	
	
}
}
