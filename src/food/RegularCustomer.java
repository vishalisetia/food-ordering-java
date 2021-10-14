package food;

// Hierarchical Inheritance
public class RegularCustomer extends Customer {
	
	private float discountPercentage;
	
	public RegularCustomer(String customerName, long customerContact, Address customerAddress) {
		super(customerName, customerContact, customerAddress); // Invoking the parent class parameterized constructor
		this.discountPercentage = 5.0f;
	}

	public float getDiscountPercentage() {
		return discountPercentage;
	}

	public void setDiscountPercentage(float discountPercentage) {
		this.discountPercentage = discountPercentage;
	}
	
	@Override
	public double payBill(double totalPrice) {
		System.out.println("Delivery Charges: " + getDeliveryCharge());
		double priceAfterDiscount = totalPrice * (1 - (discountPercentage / 100));
        double finalBillAmount = priceAfterDiscount + Customer.getDeliveryCharge();
        System.out.print("Final amount to be paid: $");
		return finalBillAmount;
	}	

}
