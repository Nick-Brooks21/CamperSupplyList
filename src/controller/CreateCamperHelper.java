package controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NamedQuery;
import javax.persistence.Persistence;

import model.Camper;
import model.Food;
import model.Supplies;

public class CreateCamperHelper {

	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("CamperSupplyList");

	public void addCamper(Camper c) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(c);
		em.getTransaction().commit();
		em.close();
	}

	public void addFood(Food f) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(f);
		em.getTransaction().commit();
		em.close();
	}

	public void updateFood(Food f) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.merge(f);
		em.getTransaction().commit();
		em.close();
	}

	public void addSupplies(Supplies s) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(s);
		em.getTransaction().commit();
		em.close();
	}
<<<<<<< HEAD

	public void updateSupplies(Supplies s) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.merge(s);
		em.getTransaction().commit();
		em.close();
	}

	public List<Camper> getAllCampers() {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		List<Camper> camperList = em.createQuery("SELECT c FROM Camper c").getResultList();
		return camperList;
	}
=======
	
	public List<Camper> showAllCampers() {
		EntityManager em = emf.createEntityManager();
		List<Camper> showCampers = em.createQuery("SELECT c FROM Camper c").getResultList();
		return showCampers;
	}
	
	public List<Food> showAllFood() {
		EntityManager em = emf.createEntityManager();
		List<Food> showFood = em.createQuery("SELECT f FROM Food f").getResultList();
		return showFood;
	}
	
	public List<Supplies> showAllSupplies() {
		EntityManager em = emf.createEntityManager();
		List<Supplies> showSupplies = em.createQuery("SELECT s FROM Supplies s").getResultList();
		return showSupplies;
	}
	
	
>>>>>>> 72d3e9fffa291b2f9f9bc43a53a1627ebbe3b0ac
}
