package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="supplies")
public class Supplies {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="supplyId")
	private int id;
	@Column(name="supplyItem")
	private String supplyItem;
	@Column(name="quantity")
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
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	

}
