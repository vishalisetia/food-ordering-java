package food;

public class Food {

	private String foodName;
	private String foodType;	
	private String foodCuisine;
	private int foodQuantityAvailable;
	private double foodUnitPrice;
	
	public Food(String foodName, String foodType, String foodCuisine, int foodQuantityAvailable, double foodUnitPrice) {
		this.foodName = foodName;
		this.foodType = foodType;
		this.foodCuisine = foodCuisine;
		this.foodQuantityAvailable = foodQuantityAvailable;
		this.foodUnitPrice = foodUnitPrice;
	}
	
	public String getFoodName() {
		return foodName;
	}
	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}
	public String getFoodType() {
		return foodType;
	}
	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}
	public String getFoodCuisine() {
		return foodCuisine;
	}
	public void setFoodCuisine(String foodCuisine) {
		this.foodCuisine = foodCuisine;
	}
	public int getFoodQuantityAvailable() {
		return foodQuantityAvailable;
	}
	public void setFoodQuantityAvailable(int foodQuantityAvailable) {
		this.foodQuantityAvailable = foodQuantityAvailable;
	}
	public double getFoodUnitPrice() {
		return foodUnitPrice;
	}
	public void setFoodUnitPrice(double foodUnitPrice) {
		this.foodUnitPrice = foodUnitPrice;
	}

}
