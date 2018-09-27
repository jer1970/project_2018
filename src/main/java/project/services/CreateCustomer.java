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

import javafx.scene.control.TextField;
import project.entities.Customer;
import project.gui.Display;

public class CreateCustomer {
	Display dis;
	public void createCust(TextField txtId,String name, String address) {
		dis = new Display();
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("Project_2018");
		EntityManager entitymanager = emfactory.createEntityManager();
		try{
		entitymanager.getTransaction().begin();
		Customer customer = new Customer();
		customer.setName(name);
		customer.setAddress(address);
		customer.setCustId();
		entitymanager.persist(customer);
		dis.displayId(txtId,customer.getCustId());
		try{
		entitymanager.getTransaction().commit();
		}
		catch(Exception s){
			s.printStackTrace();
		}
		}	finally{
		
			if (entitymanager.getTransaction().isActive())
				entitymanager.getTransaction().rollback();
		}
		entitymanager.close();
		emfactory.close();
	}
	
	public void createCust(String name, String address) {
		dis = new Display();
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("Project_2018");
		EntityManager entitymanager = emfactory.createEntityManager();
		try{
		entitymanager.getTransaction().begin();
		Customer customer = new Customer();
		customer.setName(name);
		customer.setAddress(address);
		customer.setCustId();
		entitymanager.persist(customer);
		try{
		entitymanager.getTransaction().commit();
		}
		catch(Exception s){
			s.printStackTrace();
		}
		}	finally{
		
			if (entitymanager.getTransaction().isActive())
				entitymanager.getTransaction().rollback();
		}
		entitymanager.close();
		emfactory.close();
	}
}
