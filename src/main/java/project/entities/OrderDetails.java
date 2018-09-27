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
import javax.persistence.Table;

@Entity
@Table
public class OrderDetails implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -2756028025055046272L;
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int odId;
	private	Product prod;
	private int quantity;
	
	private static int ODID;
	public OrderDetails (Product prod, int quantity){
		this.prod = prod;
		this.quantity = quantity;
		this.odId = ODID++;
		//print();
	}
	public OrderDetails(){
	}

	public Product getProd() {
		return prod;
	}

	public int getQuantity() {
		return quantity;
	}
	public void print(){
		Phone phone;
		Tv tv;
		if(getProd().getName().equals("smartphone")){
			phone = (Phone) getProd();
			System.out.println("\nProduct: " + phone.getModel() + " ID " + phone.getId() + "\tQuantity: " + getQuantity());
		}
		else{
			tv = (Tv) getProd();
			System.out.println("\nProduct: " + tv.getMake() + " ID " + tv.getId() + "\tQuantity: " + getQuantity());
		}
	}
}

