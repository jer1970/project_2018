package project.services;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import project.entities.Customer;


public class Update {
	public void updateCust(String name, String address, int id) {
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("Project_2018");
		EntityManager entitymanager = emfactory.createEntityManager();
		try{
		entitymanager.getTransaction().begin();
		Customer customer = entitymanager.find(Customer.class, id);
		customer.setName(name);
		customer.setAddress(address);
		entitymanager.getTransaction().commit();
		}finally{
			if(entitymanager.getTransaction().isActive())
				entitymanager.getTransaction().rollback();
		}
		// after update
		
		entitymanager.close();
		emfactory.close();
	}
}
