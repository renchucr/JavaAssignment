package Training;

import java.util.Scanner;

public class Assignment4_Lucky2 {

	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		int  reminder, quotient = 0, length = 0;
		Boolean flag = true;
		int[] arnumber;

		System.out.println("\t Lucky");
		System.out.println("\t#######\n");

		System.out.println("Please enter a length of array");
		length = scan.nextInt();

		arnumber = new int[length];

		for (int index = 0; index < length; index++) {
			System.out.println("Please enter " + index + " position value");
			arnumber[index] = scan.nextInt(); // value
		}

		

		int[] frequency = new int[10]; // array
		for (int index = 0; index < length; index++) {
			quotient = arnumber[index];

			do {

				reminder = quotient % 10;
				quotient = quotient / 10;
				switch (reminder) {
				case 0:
					frequency[0] += 1;
					break;
				case 1:
					frequency[1] += 1;
					break;
				case 2:
					frequency[2] += 1;
					break;
				case 3:
					frequency[3] += 1;
					break;
				case 4:
					frequency[4] += 1;
					break;
				case 5:
					frequency[5] += 1;
					break;
				case 6:
					frequency[6] += 1;
					break;
				case 7:
					frequency[7] += 1;
					break;
				case 8:
					frequency[8] += 1;
					break;
				case 9:
					frequency[9] += 1;
					break;

				}
			} while (quotient > 0);

			for (int i = 0; i < 9; i++) {
				if (frequency[i] > 1) {
					flag = false;
				}
			}
		}

		if (flag == false)
			System.out.println("The number is #### Not  Lucky ####");
		else
			System.out.println("The number is #### Lucky ####");
	}
}
