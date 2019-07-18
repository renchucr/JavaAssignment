package Training;

import java.util.Scanner;

public class Assignment2_c {

	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = 0;
		String reenter;
		do {
			System.out.print("Enter the if 2 for doing 2 parameter or 3 for doing 3 parameter u \n");
			int count = scan.nextInt();
			if (count < 2 || count > 3) {
				System.out.println("Sorry wrong value entered");
				System.exit(1);
			} else {
				System.out.println("Enter the calculation you want to perform from the menu below");
				System.out.println(" 1: Addition \n 2: Subtraction\n 3: Multiplication \n 4:Division\n");
				int operator = scan.nextInt();

				int[] value = new int[3];
				for (int i = 0; i < count; i++) {
					System.out.print("\nEnter the " + (i + 1) + " value\n");
					value[i] = scan.nextInt();
				}

				if (count == 2) {
					switch (operator) {
					case 1:
						result = Calculator.add(value[0], value[1]);
						break;
					case 2:
						result = Calculator.sub(value[0], value[1]);
						break;
					case 3:
						result = Calculator.mul(value[0], value[1]);
						break;
					case 4:
						result = Calculator.div(value[0], value[1]);
						break;
					}
				} else {
					switch (operator) {
					case 1:
						result = Calculator.add(value[0], value[1], value[2]);
						break;
					case 2:
						result = Calculator.sub(value[0], value[1], value[2]);
						break;
					case 3:
						result = Calculator.mul(value[0], value[1], value[2]);
						break;
					case 4:
						result = Calculator.div(value[0], value[1], value[2]);
						break;
					}
				}

				System.out.print("\n\nResult is " + result);
			}
			System.out.print("\n\nDo you want to continue(Y/N)");
			reenter = scan.next();
		} while (reenter == "Y" || reenter == "y");

	}
}
