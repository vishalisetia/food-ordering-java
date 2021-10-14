package food;

public class Restaurant {

//	list of menu items and list of orders placed
	
	private String restaurantName;
	private String restaurantAddress;
	private long[] restaurantContacts;
	private float restaurantRating;
	
	public Restaurant(String restaurantName, String restaurantAddress, long[] restaurantContacts, float restaurantRating) {
		this.restaurantName =restaurantName;
		this.restaurantAddress = restaurantAddress;
		this.restaurantContacts = restaurantContacts;
		this.restaurantRating = restaurantRating;
	}
	
	public String getRestaurantName() {
		return restaurantName;
	}

	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}

	public String getRestaurantAddress() {
		return restaurantAddress;
	}

	public void setRestaurantAddress(String restaurantAddress) {
		this.restaurantAddress = restaurantAddress;
	}

	public long[] getRestaurantContact() {
		return restaurantContacts;
	}

	public void setRestaurantContact(long[] restaurantContacts) {
		this.restaurantContacts = restaurantContacts;
	}

	public float getRestaurantRating() {
		return restaurantRating;
	}

	public void setRestaurantRating(float restaurantRating) {
		this.restaurantRating = restaurantRating;
	}

//	display menu
	
	public void displayRestaurantDetails() {
		System.out.println("\nRestaurant details \n***********");
		System.out.println("Restaurant Name : " + restaurantName);
		System.out.println("Restaurant Address : " + restaurantAddress);
		System.out.println("Restaurant Rating : " + restaurantRating);
		System.out.print("Restaurant Contacts : ");
		for (int index = 0; index < this.restaurantContacts.length; index++)
			System.out.print(this.restaurantContacts[index] + ", ");
		System.out.println("\n");
	}
	

}
