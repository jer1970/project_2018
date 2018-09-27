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

import project.entities.Customer;
import project.entities.OrderItem;
import project.entities.OrderDetails;
import project.entities.Product;

public class CreateOrder {
	public void createOrder(int custId, int prodId, int quantity) {
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("Project_2018");
		EntityManager entitymanager = emfactory.createEntityManager();
		try {
			Customer customer = entitymanager.find(Customer.class, custId);
			Product prod = entitymanager.find(Product.class, prodId);
			entitymanager.getTransaction().begin();
			OrderDetails od = new OrderDetails(prod, quantity);
			//entitymanager.persist(od);
			OrderItem order = new OrderItem(custId);
			order.add(od);
			entitymanager.persist(od);
			entitymanager.persist(order);
			
			//customer.getList().add(order);

			customer.addOrder(order);
			entitymanager.persist(customer);
			try {
				entitymanager.getTransaction().commit();
			} catch (Exception s) {
				s.printStackTrace();
			}
			
//			entitymanager.getTransaction().begin();
//			//OrderDetails od = new OrderDetails(prod, quantity);
//			//entitymanager.persist(od);
//			OrderItem order = new OrderItem(custId);
//			order.add(od);
//			//entitymanager.persist(od);
//			entitymanager.persist(order);
//			
//			customer.addOrder(order);;
//
//			// cust.addOrder(order);
//			entitymanager.persist(customer);
//			try {
//				entitymanager.getTransaction().commit();
//			} catch (Exception s) {
//				s.printStackTrace();
//			}
			
		} finally {

			if (entitymanager.getTransaction().isActive())
				entitymanager.getTransaction().rollback();
		}
		entitymanager.close();
		emfactory.close();
	}

}
