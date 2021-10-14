package food;

public class Tester {
	
	public static void main(String args[]) {
		
		Address address = new Address("182", "Carolina Street", "Springfield", 62702);
//		Customer customer = new Customer("Sam", 9945000009L, address);
//		customer.customerDetails(address);
		PremiumCustomer pc = new PremiumCustomer("Sam", 9945000009L, address);
		System.out.println(pc.payBill(20));
//		
//		long[] restaurantContacts = { 9992346725L, 9992346726L, 9992346727L };
//		Restaurant restaurant = new Restaurant("mcds", "khanna", restaurantContacts, 5);
//		restaurant.displayRestaurantDetails();	
//		
//		Food food = new Food("Pizza Margherita", "Italian", "Veg", 10, 8.0);
//		Food food2 = new Food("Burger", "Italian", "Veg", 5, 5.0);
//		
//		Food[] foodArray = {food, food2};
//		Order order = new Order(foodArray, customer);
//		order.orderDetails();
//		
//		Bill bill = new Bill("PayPal");
//		bill.generateBill(order);
		
	}
}

