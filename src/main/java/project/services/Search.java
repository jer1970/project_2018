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
import project.entities.Phone;
import project.entities.Product;
import project.entities.Tv;
import project.gui.Display;
public class Search {
	public void find(int id) {
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("Project_2018");
		EntityManager entitymanager = emfactory.createEntityManager();
		try {
			Product product = entitymanager.find(Product.class, id);
			Tv tv = null;
			Phone phone = null;
			System.out.println("Product ID = " + product.getId());
			System.out.println("Product NAME = " + product.getName());
			System.out.println("Product Description = " + product.getDescription());
			System.out.println("Product Price = " +product.getPrice());
			if(product.getName().equals("tv")){
				tv = (Tv)product;
				System.out.println("Make = " + tv.getMake());
				System.out.println("Screensize = " + tv.getScreenSize());
				System.out.println("Type = " + tv.getType());
				System.out.println("3D capable = " + tv.isThreeDCapable());
			}
			else{
				phone = (Phone)product;
				System.out.println("Make = " + phone.getMake());
				System.out.println("Model = " + phone.getModel());
				System.out.println("Storage = " + phone.getStorageSpace());
			}
				
		} catch (Exception e) {
			System.out.println("no such id");
		}
	}
	public void findCustomer( TextField name, TextField address, int id){
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("Project_2018");
		EntityManager entitymanager = emfactory.createEntityManager();
		Customer customer = null;
		Display dis;
		try{
			 customer = entitymanager.find(Customer.class, id);
		}catch( Exception e){
			e.printStackTrace();		
			}
		//if(customer != null){
			//System.out.println("name =  " + customer.getName());
			dis = new Display();
			dis.displayCustomer(name, address, customer);
		//}
		
	}
}
