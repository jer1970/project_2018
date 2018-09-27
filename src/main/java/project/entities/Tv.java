/**
 * name: Jeremy Staunton
 * Id:R00158317
 * class: sd2
 * COMP7013
 */
package project.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table
public class Tv extends Product implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 6890625971076405719L;
	private	String make;
	private int screenSize;
	private String type;
	private boolean threeDCapable;
		
	public Tv(String name, String description, String make, int screenSize, String type, boolean threeDCapable, double price){
		super(name, description, price);
		this.make = make;
		this.screenSize = screenSize;
		this.type = type;
		this.threeDCapable = threeDCapable;
	}
	public Tv(){		
		super();
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public int getScreenSize() {
		return screenSize;
	}

	public void setScreenSize(int screenSize) {
		this.screenSize = screenSize;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public boolean isThreeDCapable() {
		return threeDCapable;
	}

	public void setThreeDCapable(boolean threeDCapable) {
		this.threeDCapable = threeDCapable;
	}
	
	public void print(){
		String threeD;
		super.print();
		if(this.isThreeDCapable())
			threeD = " Yes.";
		else threeD = "No.";
		System.out.println("Make: " + getMake() + "\tScreenSize: " + getScreenSize() + "\tType: " + getType() + "\t3D capable, " + threeD);
	}
}
