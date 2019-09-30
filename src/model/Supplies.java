package model;

public class Supplies {
	
	private String supplyItem;
	private int quantity;
	
	public Supplies() {
		super();
	}
	
	public Supplies(String supplyItem, int quantity) {
		this.supplyItem = supplyItem;
		this.quantity = quantity;
	}
	
	public String displaySupplies() {
		return supplyItem + " | " + quantity;
	}
	
	public String getSupplyItem() {
		return supplyItem;
	}
	public void setSupplyItem(String supplyItem) {
		this.supplyItem = supplyItem;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	

}
