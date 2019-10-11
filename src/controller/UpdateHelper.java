package controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import model.*;

public class UpdateHelper {
	
	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("CamperSupplyList");
	
	public Camper searchByCamperId(int idToDelete) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		Camper found = em.find(Camper.class, idToDelete);
		em.close();
		return found;
	}
	
	public Food searchByFoodId(int idToDelete) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		Food found = em.find(Food.class, idToDelete);
		em.close();
		return found;
	}
	
	public Supplies searchBySupplyId(int idToDelete) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		Supplies found = em.find(Supplies.class, idToDelete);
		em.close();
		return found;
	}
	
	public void deleteCamper(Camper toDelete) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
		TypedQuery<Camper>camperQuery = em.createQuery("select c from Camper c where c.firstName = :selectedFirstName and c.lastName = :selectedLastName and c.age = :selectedAge", Camper.class);
		
		camperQuery.setParameter("selectedFirstName", toDelete.getFirstName());
		camperQuery.setParameter("selectedLastName", toDelete.getLastName());
		camperQuery.setParameter("selectedAge", toDelete.getAge());		
		camperQuery.setMaxResults(1);

		Camper result = camperQuery.getSingleResult();

		em.remove(result);
		em.getTransaction().commit();
		em.close();
	}
	
	public void deleteFood(Food toDelete) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
		TypedQuery<Food>foodQuery = em.createQuery("select f from Food f where f.foodType = :selectedFoodType and f.quantity = :selectedQuantity", Food.class);
		
		foodQuery.setParameter("selectedFoodType", toDelete.getFoodType());
		foodQuery.setParameter("selectedQuantity", toDelete.getQuantity());
		foodQuery.setMaxResults(1);
		
		Food result = foodQuery.getSingleResult();
		
		em.remove(result);
		em.getTransaction().commit();
		em.close();
	}
	
	public void deleteSupplies(Supplies toDelete) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
		TypedQuery<Supplies>supplyQuery = em.createQuery("select s from Supplies s where s.supplyItem = :selectedSupplyItem and s.quantity = :selectedQuantity", Supplies.class);
		
		supplyQuery.setParameter("selectedFirstName", toDelete.getSupplyItem());
		supplyQuery.setParameter("selectedLastName", toDelete.getQuantity());
		supplyQuery.setMaxResults(1);
		
		Supplies result = supplyQuery.getSingleResult();
		
		em.remove(result);
		em.getTransaction().commit();
		em.close();		
	}

}
