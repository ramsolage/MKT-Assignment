package ESGProject;

public class Array {

	public static void main(String[] args) {
		int d[] = { 1, 2, 3, 4, 5 }; // Array Declaration & Creation & initialization
		System.out.println(d[1]);

		int e[] = { 2, 4, 5, 6, 7 };
		// for(i=0;i<=e.length;i++);
		// {
		// System.out.println(e[i]);
		// }
		for (int j : e) {
			System.out.println(e[j]);
		}

	}
}
