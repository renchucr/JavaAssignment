package Training;

public class Assignment6_Employee {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void handleCustomer(Assignment6_Customer c1, Assignment6_Vehicle v1, boolean finance) {

		if (finance) {
			double loanAmount = v1.getPrice() - c1.getCashOnHand();
			this.processLoan(c1, loanAmount);
		} else {
			processTransaction(c1, v1);
		}

	}

	private void processTransaction(Assignment6_Customer c1, Assignment6_Vehicle v1) {
		System.out.println(c1.getName() + "  purchased " + v1.getModel() + "\n" + "Milage of car is: " + v1.getMilage()
				+ "\n" + "Year or Make:" + v1.getYear() + "\n" + "Price of the car:" + v1.getPrice());

	}

	public void processLoan(Assignment6_Customer c1, double loanAmount) {
		if (loanAmount > 500000) {
			System.out.println("Cannot process the loan amount");
		} else {
			System.out.println("Loan request is registered and it is in Progress for Loan Amount:" + loanAmount);
		}
	}

}
