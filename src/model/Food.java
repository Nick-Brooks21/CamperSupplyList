package model;

public class Food {
	
	private String foodType;
	private int quantity;
	
	public Food() {
		super();
	}
	
	public Food(String foodType, int quantity) {
		this.foodType = foodType;
		this.quantity = quantity;
	}
	
	public String displayFood() {
		return foodType + " | " + quantity; 
	}
	
	public String getFoodType() {
		return foodType;
	}
	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
