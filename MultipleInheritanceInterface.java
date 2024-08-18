package ESGProject;

interface Building {
	abstract void bedroom();

	abstract void kitchen();
}

interface Home {
	abstract void Hall();

	abstract void Jina();
}

public class MultipleInheritanceInterface implements Building, Home {

	public static void main(String[] args) {
		System.out.println("By using interface we can achieve MultipleInheritance");
		MultipleInheritanceInterface Mi=new MultipleInheritanceInterface();
		Mi.bedroom();
			Mi.Hall();
			Mi.Jina();
			Mi.kitchen();

	}

	@Override
	public void Hall() {
		System.out.println("Hall");

	}

	@Override
	public void Jina() {
		System.out.println("Jina");

	}

	@Override
	public void bedroom() {
		System.out.println("bedroom");

	}

	@Override
	public void kitchen() {
		System.out.println("kitchen");

	}

}
