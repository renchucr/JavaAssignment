package Training;

//import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
//import java.io.FileWriter;
import java.io.BufferedReader;

//import java.io.BufferedWriter;
public class Assignment7_ATMCard {
	static ArrayList<Assignment7_Card> cardList = new ArrayList<Assignment7_Card>();
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Call the file reader
		BufferedReader br = null;
		FileReader fr = null;

		try {

			fr = new FileReader("c:\\Test\\ATMCARD.txt");
			br = new BufferedReader(fr);
			String s = br.readLine();

			while (s != null && !s.isEmpty()) {
				Assignment7_Card card = new Assignment7_Card();
				String data[] = s.split(",");
				card.setCardNum(Integer.valueOf(data[0]));
				card.setName(data[1]);
				card.setBank(data[2]);
				card.setBalance(Double.valueOf(data[3]));
				card.setBalance(Double.valueOf(data[4]));
				cardList.add(card);
				s = br.readLine();
			}

		} catch (NullPointerException e) {
			e.getMessage();

		} catch (IOException e) {
			e.getMessage();
		}

		// Card withdrawal
		System.out.println("\t\tATM");
		System.out.println("\t\t***\n\n");
		System.out.println("Please enter the Card Number");
		int num = scan.nextInt();

		Assignment7_Card card = getCard(num);

		if (card == null) {
			System.out.println("No such card available");
		} else {

			System.out.println("\tHello "+card.getName());

			System.out.println("Please enter  the withdrawal Amount");
			System.out.println("Rs ");
			double amount = scan.nextDouble();

			int ROI = 1;

			switch (card.getBank()) {
			case "SBI":
				SBI s = new SBI();
				ROI = s.getRateOfInterest();
			case "ICICI":
				ICICI i = new ICICI();
				ROI = i.getRateOfInterest();
			case "HDFC":
				HDFC a = new HDFC();
				ROI = a.getRateOfInterest();
			}

			if (card.getBalance() > amount * ROI) {

				double totalBalance = card.getBalance() - amount * ROI;
				card.setBalance(totalBalance);

				System.out.println("Total Balance remaining  Rs " + card.getBalance());
			} else {
				System.out.println("\nInsufficient Fund");
			}
		}
		System.out.println("Thanks for using ATM");
	}

	// Searching the entered card
	public static Assignment7_Card getCard(int cardNo) {
		for (Assignment7_Card card : cardList) {
			if (cardNo == card.getCardNum()) {
				return card;
			}
		}
		return null;
	}
}

// SBI ROI
class SBI extends Assignment7_Bank {
	@Override
	int getRateOfInterest() {
		// TODO Auto-generated method stub
		return 5;
	}
}

// ICICI ROI
class ICICI extends Assignment7_Bank {
	@Override
	int getRateOfInterest() {
		// TODO Auto-generated method stub
		return 7;
	}
}

// HDFC ROI
class HDFC extends Assignment7_Bank {
	@Override
	int getRateOfInterest() {
		// TODO Auto-generated method stub
		return 8;
	}
}
