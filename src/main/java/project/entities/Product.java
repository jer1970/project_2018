/**
 * name: Jeremy Staunton
 * Id:R00158317
 * class: sd2
 * COMP7013
 */
package project.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table
@Inheritance( strategy = InheritanceType.TABLE_PER_CLASS )
public class Product implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1438213115080772797L;
	private	String name;
	private String description;
	private double price;
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int id;
	
	private static int PRODUCTID = 1;
	
	public Product(String name, String description, double price){		
		this.id = PRODUCTID++;
		this.name = name;
		this.description = description;
		this.price = price;		
	}
	
	public Product(){		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void print(){
		System.out.println("\nName: " + getName() + " \tDescription: " + getDescription() + " \nPrice: " + getPrice() + "\tProduct Id: " + getId());
	}
	
}
