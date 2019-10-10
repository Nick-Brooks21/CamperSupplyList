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
}
