package controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.*;

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
	
	public void addSupplies(Supplies s) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(s);
		em.getTransaction().commit();
		em.close();
	}
	
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
	
	
}
