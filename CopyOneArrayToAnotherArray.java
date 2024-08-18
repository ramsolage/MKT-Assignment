package ESGProject;

import java.util.Arrays;

public class CopyOneArrayToAnotherArray {

	public static void main(String[] args) {
		int input[] = new int[3];
		input[0] = 10;
		input[1] = 20;
		input[2] = 30;
		int output[] = new int[3];
		for (int i = 0; i <= 2; i++) {

			output[i] = input[i];
			// System.out.println(input[i]);
		}

		System.out.println(Arrays.toString(output));
		System.out.print(Arrays.toString(input));

	}

}
