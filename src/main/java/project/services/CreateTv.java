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

import project.entities.ProductDb;
import project.entities.Tv;

public class CreateTv {
	public void createTv(int quantity, String name, String description, String make, int screenSize, String type, boolean threeDCapable, double price) {
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("Project_2018");
		EntityManager entitymanager = emfactory.createEntityManager();
		try{
		entitymanager.getTransaction().begin();		
		Tv tv = new Tv(name, description, make, screenSize, type, threeDCapable, price);
		entitymanager.persist(tv);
//		for(int i = 0; i < quantity; i++){
		ProductDb prDb = new ProductDb(tv);		
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
//"tv", "Really big tv ", "Sony", 60, "LCD", true, 1190.00