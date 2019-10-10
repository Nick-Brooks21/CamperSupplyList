package model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "camper")
public class Camper {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "camperId")
	private int id;
	@Column(name = "firstName")
	private String firstName;
	@Column(name = "lastName")
	private String lastName;
	@Column(name = "age")
	private int age;
	@OneToMany(cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
	@JoinTable(name = "food", joinColumns = @JoinColumn(name = "camperId"), inverseJoinColumns = @JoinColumn(name = "camperId"))
	private List<Food> foodList;
	@OneToMany(cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
	@JoinTable(name = "supplies", joinColumns = @JoinColumn(name = "camperId"), inverseJoinColumns = @JoinColumn(name = "camperId"))
	private List<Supplies> suppliesList;

	public Camper() {
		super();
	}

	public Camper(String firstName, String lastName, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}

	public String displayCamper() {
		return firstName + " " + lastName + ", " + age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public List<Food> getFoodList() {
		return foodList;
	}

	public List<Supplies> getSuppliesList() {
		return suppliesList;
	}

}
