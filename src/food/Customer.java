package food;

// final payment of the bill differs for each of the customers. Thus, Customer class also exhibits polymorphism.
class Customer {

	// instance variables
	private String customerId; 
	private String customerName;
	private long customerContact;
	private Address customerAddress;
	private static int customerIdCounter;
	// delivery charge is same for all the customer objects. So, instead of storing the delivery charge separately for each and every customer object in constructor, it would have been better if we could have maintained a single copy of the delivery charge which could be accessible by all the customer objects.
	private static float deliveryCharge;
	
	static {
		deliveryCharge = 1.5f;
		customerIdCounter = 101; 
	}
	
	// Constructor overloading, Parameterless constructor
	public Customer() {
		System.out.println("Inside parameterless constructor");
	}
		
	// Constructor overloading, Parameterized constructor
	public Customer(String customerName, long customerContact, Address customerAddress) {
		this.customerId = "C" + Customer.customerIdCounter++;
		this.customerName = customerName;
		this.customerContact = customerContact;
		this.customerAddress = customerAddress;
		// Since the delivery charge will be the same for all customers, we can directly set the value inside the constructor instead of passing the value as parameter to the constructor.
		// this.deliveryCharge = 1.5f;
	}
	
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public long getCustomerContact() {
		return customerContact;
	}
	public void setCustomerContact(long customerContact) {
		this.customerContact = customerContact;
	}
	public Address getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(Address customerAddress) {
		this.customerAddress = customerAddress;
	}
	public static float getDeliveryCharge() {
		return deliveryCharge;
	}
	public static void setDeliveryCharge(float deliveryCharge) {
		Customer.deliveryCharge = deliveryCharge;
		// this.deliveryCharge = deliveryCharge; // This line will throw error 
	}
	public static int getCounter() {
		return customerIdCounter;
	}
	public static void setCounter(int customerIdCounter) {
		Customer.customerIdCounter = customerIdCounter;
	}

	public void customerDetails(Address address) {
			System.out.println("Displaying customer details \n**********");
			System.out.println("Customer Id : " + this.customerId);
			System.out.println("Customer Name : " + this.customerName);
			System.out.println("Contact Number : " + this.customerContact);
			System.out.println("Address : " + address.getAddressDetails() + "\n");
			
	}

	// Compile time polymorphism (static polymorphism) (method overloading) - fxns having same name but different signatures
	public void updateDetails(long mobile) {
		this.customerContact = mobile;
	}
	
	// Compile time polymorphism
	public void updateDetails(Address address) {
		this.customerAddress = address;
	}

	// Run time polymorphism (method overriding)
	public double payBill(double finalBillAmount) {
		System.out.println("Final amount to be paid: $");
		return finalBillAmount;
	}	

	
	
	
	
	
	
//	// Pass By Reference :- when an object is passed as a parameter
//	public void updateContact(Customer customer) { 
//	     customer.customerContact = 9786758497L; 
//	}
	
	
	
}
