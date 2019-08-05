package Training;

import java.util.Scanner;

public class Assignment4_Lucky2 {

	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		int value = 0, reminder, quotient = 0;
		
		System.out.println("\t Lucky");
		System.out.println("\t#######\n");

		System.out.println("Please enter a number");
		value = scan.nextInt(); // value

		quotient = value;

		int[] frequency = new int[10]; // array

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


		Boolean flag = true;
		for (int index = 0; index < 9; index++) {
			if (frequency[index] > 1) {
				flag = false;
			}
		}

		if (flag == false)
			System.out.println("The number is #### Not  Lucky ####");
		else
			System.out.println("The number is #### Lucky ####");
	}
}
