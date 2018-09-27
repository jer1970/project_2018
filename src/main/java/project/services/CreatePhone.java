/**
 * name: Jeremy Staunton
 * Id:R00158317
 * class: sd2
 * COMP7013
 */
package project.services;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import project.entities.Phone;
import project.entities.ProductDb;

public class CreatePhone {
	public void createPhone(int quantity, String name, String description, String make, String model, int storageSpace, double price) {
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("Project_2018");
		EntityManager entitymanager = emfactory.createEntityManager();
		try{
		entitymanager.getTransaction().begin();
		Phone phone = new Phone(name, description, make, model, storageSpace, price);
		entitymanager.persist(phone);
//		for(int i = 0; i < quantity; i++){
		ProductDb prDb = new ProductDb(phone);		
		entitymanager.persist(prDb);
//		entitymanager.flush();
//		entitymanager.clear();
//		}
		try{
		entitymanager.getTransaction().commit();
		}
		catch(Exception s){
			System.out.println("id already exists");
		}
		}	finally{
		
			if (entitymanager.getTransaction().isActive())
				entitymanager.getTransaction().rollback();
		}
		entitymanager.close();
		emfactory.close();
	}
}
