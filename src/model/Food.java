package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "food")
public class Food {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "foodId")
	private int id;
	@Column(name = "foodType")
	private String foodType;
	@Column(name = "quantity")
	private int quantity;
	@Column(name = "camperId")
	private int camperId;

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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public int getCamperId() {
		return camperId;
	}

	public void setCamperId(int camperId) {
		this.camperId = camperId;
	}

}
