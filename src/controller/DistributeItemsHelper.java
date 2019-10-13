package controller;

import java.util.List;
import java.util.Random;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Camper;
import model.Food;
import model.Supplies;

public class DistributeItemsHelper {

	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("CamperSupplyList");
	CreateCamperHelper ch = new CreateCamperHelper();
	List<Food> food = ch.showAllFood();
	List<Supplies> supplies = ch.showAllSupplies();
	List<Camper> campers = ch.showAllCampers();
	int numberOfCampers = campers.size();
	Random rn = new Random();

	/**
	 * Takes all supplies and food, and distributes them across each camper
	 * randomly. Does not account for even distribution, may leave some campers with
	 * more/less than others
	 */
	public void DistributeItems() {

		for (Food foodItem : food) {
			if (foodItem.getCamperId() <= 0) {
				Camper currentCamper = campers.get(rn.nextInt(numberOfCampers));
				currentCamper.addFoodToList(foodItem);
			}

		}

	}

}
