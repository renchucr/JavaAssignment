package Training;

import java.util.Scanner;

public class Assignment4_Lucky2 {

	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		int length = 0;
		Boolean flag = true;
		int[] arnumber;

		System.out.println("\t Lucky");
		System.out.println("\t#######\n");

		System.out.println("Please enter a length of array");
		length = scan.nextInt();

		arnumber = new int[length];

		for (int index = 0; index < length; index++) {
			System.out.println("Please enter " + (index+1) + " position value");
			arnumber[index] = scan.nextInt(); // value
		}

		for (int i = 0; i < length; i++) {
			for (int j = i + 1; j < length; j++) {
				if (arnumber[j] == arnumber[i]) {
					flag = false;
					break;
				}
			}
		}

		if (flag == false)
			System.out.println("The number is #### Not  Lucky ####");
		else
			System.out.println("The number is #### Lucky ####");
	}
}
