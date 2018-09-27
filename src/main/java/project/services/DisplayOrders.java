/**
 * name: Jeremy Staunton
 * Id:R00158317
 * class: sd2
 * COMP7013
 */
package project.services;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import project.entities.Phone;
import project.entities.Product;
import project.entities.Tv;

public class DisplayOrders {
	public void display() {
		Phone phone = null;
		Tv tv = null;
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("Project_2018");
		EntityManager entitymanager = emfactory.createEntityManager();
		CriteriaBuilder criteriaBuilder = entitymanager.getCriteriaBuilder();
		CriteriaQuery<Object> criteriaQuery = criteriaBuilder.createQuery();
		Root<Product> from = criteriaQuery.from(Product.class);
		// select all records
		System.out.println("Select all records");
		CriteriaQuery<Object> select = criteriaQuery.select(from);
		TypedQuery<Object> typedQuery = entitymanager.createQuery(select);
		List<Object> resultlist = typedQuery.getResultList();
		for (Object o : resultlist) {
			Product product = (Product) o;
			System.out.println("Product ID : " + product.getId());
			System.out.println("Product Name = " + product.getName());
			String name = product.getName();
			System.out.println("Product Description = " + product.getDescription());
			System.out.println("Product Price = " + product.getPrice());
			if (name.equals("smartphone")) {
				phone = (Phone) product;
				System.out.println("Make = " + phone.getMake());
				System.out.println("Model = " + phone.getModel());
				System.out.println("Storage = " + phone.getStorageSpace());
			}
			else{
				tv = (Tv)product;
				System.out.println("Make = " + tv.getMake());
				System.out.println("Screensize = " + tv.getScreenSize());
				System.out.println("Type = " + tv.getType());
				System.out.println("3D capable = " + tv.isThreeDCapable());
			}
		}
		entitymanager.close();
		emfactory.close();
	}
}
