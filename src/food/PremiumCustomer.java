package food;

// Multilevel Inheritance
public class PremiumCustomer extends RegularCustomer {

	public PremiumCustomer(String customerName, long customerContact, Address customerAddress) {
		super(customerName, customerContact, customerAddress);
		this.setDiscountPercentage(8.0f);
	}

	// calculation of applying discount is done in the payBill() method of the parent class, so we can call parent class method in the child class method using super.
	@Override
	public double payBill(double totalPrice) {
        double finalBillAmount = super.payBill(totalPrice);
		return finalBillAmount;
	}	
	
}
