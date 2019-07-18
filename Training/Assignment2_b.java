package Training;

import java.util.Scanner;

public class Assignment2_b {

	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] agrs) {
		Ticket t = new Ticket();
		String s = "";
		int option;
		System.out.println("\t\t\tWelcome to Ticket System");
		System.out.println("\t\t\t========================");
		System.out.println("Please choose from the menu \n   1- Create New Ticket \n   2- Exit from System");
		option = scan.nextInt();
		switch (option) {
		case 2:
			System.out.println("Exiting the System");
			System.exit(0);
			break;

		case 1:
			String type;
			System.out.println("Please enter ticket description:\n");
			s = scan.next();

			System.out.println("Please enter ticket type:\n");
			type = scan.next();

			t.setTicketDescription(s);
			t.setTicketType(type);
			double i = Math.random();
			t.setTicketNumber(i);
			t.setTicketStatus(0);
			break;
		}

		System.out.println("Please choose from the menu \n  3- Approve\n  4- Cancel/Reject");
		System.out.println("====================================\n");
		option = scan.nextInt();
		switch (option) {
		case 3:
			System.out.println("Please enter resolution:");
			s = scan.next();
			t.setTicketResolution(s);
			t.setTicketStatus(1);
			break;

		case 4:
			t.setTicketStatus(2);
			break;
		}
		System.out.println("Please choose from the menu \n  5- Close");
		System.out.println("====================================");
		option = scan.nextInt();
		if (option == 5) {
			t.setTicketStatus(3);
			System.out.println("\n\t\t\tTicket Details");
			System.out.println("\t\t\t===============\n");
			System.out.println("Ticket Description :: " + t.getTicketDescription());
			System.out.println("Ticket Type :: " + t.getTicketType());
			System.out.println("Ticket Resolution :: " + t.getTicketResolution());

		}

	}
}
