package ESGProject;

interface State {
	abstract void stateroad();

	abstract void statebridges();
}

interface District extends State {
	abstract void Districtroad();

	abstract void Districtbridges();
}

public class Interface implements District {

	public static void main(String[] args) {
		System.out.println("Print Interface");
		Interface d =new Interface();
		d.statebridges();
		d.Districtbridges();
		d.Districtroad();
		d.stateroad();
		

	}

	@Override
	public void stateroad() {
		System.out.println("Print stateroad");

	}

	@Override
	public void statebridges() {
		System.out.println("Print statebridges");

	}

	@Override
	public void Districtroad() {
		System.out.println("Print Districtroad");

	}

	@Override
	public void Districtbridges() {
		System.out.println("Print Districtbridges");

	}

}
