package food;

public class Bill {

	private String billId;
	private String paymentMode;
	private static int counter;
	
	static {
		counter = 9001;
	}
	
	public Bill(String paymentMode) {
		this.paymentMode = paymentMode;
		this.billId = "B" + counter++;
	}

	public String getBillId() {
		return billId;
	}

	public void setBillId(String billId) {
		this.billId = billId;
	}

	public String getPaymentMode() {
		return paymentMode;
	}

	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}

	public static int getCounter() {
		return counter;
	}

	public static void setCounter(int counter) {
		Bill.counter = counter;
	}
	
	// Association - generateBill method makes use of the Order object to display the order details
	public void generateBill(Order order) {
		System.out.println("\nBill details \n***********");
		System.out.println("Bill Id : " + this.getBillId());
		System.out.print("Items ordered : ");
		for (Food food : order.getOrderFoods())
			System.out.print(food.getFoodName() + ", ");
//		for(int i=0;i<order.getOrderFoods().length;i++)
//			System.out.print(order.getOrderFoods()[i].getFoodName() + ", ");
		System.out.println();
		double payableAmount = order.calculateTotalPrice(this.getPaymentMode());
		System.out.println("Payable Amount : $" + (int) (payableAmount * 100) / 100.0 + "\n");
	}


}
