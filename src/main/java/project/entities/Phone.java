/**
 * name: Jeremy Staunton
 * Id:R00158317
 * class: sd2
 * COMP7013
 */
package project.entities;

import java.io.Serializable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table
public class Phone extends Product implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 8115721082019501971L;
	private	String make;
	private String model;
	private int storageSpace;
	public Phone(String name, String description , String make, String model, int storageSpace, double price){
			super(name, description, price);
			this.make = make;
			this.model = model;
			this.storageSpace = storageSpace;			
	}
	public Phone(){
		super();
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getStorageSpace() {
		return storageSpace;
	}
	public void setStorageSpace(int storageSpace) {
		this.storageSpace = storageSpace;
	}
	public void print(){
		super.print();
		System.out.println("make: " + getMake() + "\tModel: " + getModel() + "\tStorage Space: " + getStorageSpace());
	}
}
