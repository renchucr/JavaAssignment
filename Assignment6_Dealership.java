package Training;

public class Assignment6_Dealership {
	
	public static void main(String[] args) {
		Assignment6_Employee emp1 = new Assignment6_Employee();
		emp1.setName("Ren");

		Assignment6_Vehicle v1 = new Assignment6_Vehicle();
		v1.setMake("Maruti");
		v1.setModel("Celerio");
		v1.setYear(2018);
		v1.setMilage(20);
		v1.setPrice(500000);

		Assignment6_Vehicle v2 = new Assignment6_Vehicle();
		v2.setMake("Ford");
		v2.setModel("Figo");
		v2.setYear(2019);
		v2.setMilage(18);
		v2.setPrice(500000);

		Assignment6_Customer c1 = new Assignment6_Customer();
		c1.setName("Prabha");
		c1.setAddress("Chennai");
		c1.setCashOnHand(500000);

		boolean finance = false;

		c1.purchaseVehicle(emp1, v1, finance);

	}

}
