package project.services;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import project.entities.Customer;

public class Delete {
	public void deleteCust(int id){
	EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("Project_2018");
	EntityManager entitymanager = emfactory.createEntityManager();
	try{
	entitymanager.getTransaction().begin();
	Customer customer = entitymanager.find(Customer.class, id);
	entitymanager.remove(customer);
	entitymanager.getTransaction().commit();
	}
	catch(IllegalArgumentException i){
		System.out.println("IllegalArgumentException, no such id");
	}
		finally{
	
		if (entitymanager.getTransaction().isActive())
			entitymanager.getTransaction().rollback();
	}
	entitymanager.close();
	emfactory.close();
	}
}
