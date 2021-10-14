package food;

public class Order {

	private int orderId;
	private Food[] orderFoods;	//aggregation
	private double orderTotalPrice;
	private String orderStatus;
	private static int orderIdCounter;
	private Customer customer;
	
	static {
		orderIdCounter = 101;
	}
	
//	functions
//	, get the count of orders placed
	
	public Order(Food[] orderFoods, Customer customer) {
		this.orderId = Order.orderIdCounter++;
		this.orderFoods = orderFoods;
		this.orderStatus = "Ordered";
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public Food[] getOrderFoods() {
		return orderFoods;
	}

	public void setOrderFoods(Food[] orderFoods) {
		this.orderFoods = orderFoods;
	}
	
	public double getOrderTotalPrice() {
		return orderTotalPrice;
	}

	public void setOrderTotalPrice(double orderTotalPrice) {
		this.orderTotalPrice = orderTotalPrice;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	
	public double calculateTotalPrice(String paymentMode) {
		double foodPrice = 0;
		double finalPrice = 0;
		float serviceCharge = 0f;
		for (Food food : orderFoods)
			foodPrice+=food.getFoodUnitPrice()*1;
		if (paymentMode.equals("Credit Card") || paymentMode.equals("Debit Card"))
			serviceCharge = 2.0f;
		else if (paymentMode.equals("PayPal"))
			serviceCharge = 2.9f;
		finalPrice = foodPrice + foodPrice * (serviceCharge/100);
		this.setOrderTotalPrice(finalPrice);
		return finalPrice;
	}
	
	public void orderDetails() {
		System.out.println("\nOrder details \n***********");
		System.out.println("Your Order placed successfully!");
		System.out.println("Order Id : " + this.orderId);
		System.out.print("You have ordered: ");
		for (Food food : this.orderFoods)
			System.out.print(food.getFoodName() + ", ");
		System.out.println();
		System.out.println("Order status: "+ this.getOrderStatus() + "\n");
	}
	
	public static int getTotalNoOfOrders() {
		return Order.orderIdCounter - 100;
	}

	public static int getOrderIdCounter() {
		return orderIdCounter;
	}

	public static void setOrderIdCounter(int orderIdCounter) {
		Order.orderIdCounter = orderIdCounter;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}



}
