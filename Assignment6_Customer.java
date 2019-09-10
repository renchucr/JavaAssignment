package Training;

public class Assignment6_Customer {

	 
	 private String name;  
 	private String address;  
 	private double cashOnHand;  
 	public String getName() {  
 		return name;  
	}  
 	public void setName(String name) {  
		this.name = name;  
 	}  
 	public String getAddress() {  
 		return address;  
 	}  
 	public void setAddress(String address) {  
 		this.address = address;  
 	}  
 	public double getCashOnHand() {  
 		return cashOnHand;  
	}  
 	public void setCashOnHand(double cashOnHand) {  
 		this.cashOnHand = cashOnHand;  
 	}  
 	  
 	  
 	public void purchaseVehicle(Assignment6_Employee emp1, Assignment6_Vehicle v1, boolean finance) {  
 		emp1.handleCustomer(this,v1,finance);  
 	}  
  
}
