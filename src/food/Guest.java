package food;

// Hierarchical Inheritance
public class Guest extends Customer {
	
//	private float deliveryCharge;
	
	public Guest(String customerName, long customerContact, Address customerAddress) {
		super(customerName, customerContact, customerAddress);
	}

//	public float getDeliveryCharge() {
//		return deliveryCharge;
//	}
//
//	public void setDeliveryCharge(float deliveryCharge) {
//		this.deliveryCharge = deliveryCharge;
//	}
	
}
