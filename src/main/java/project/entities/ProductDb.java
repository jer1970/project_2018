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
public class ProductDb implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4185954835105229161L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private Product product;
	// private int total;
	private static int DBID = 1;
	public ProductDb(Product prod) {
		// this.total = 0;
		this.id = DBID++;
		this.product = prod;
	}
	public ProductDb(){
	}

	public Product getProduct() {
		return product;
	}

	// public int getTotal() {
	// return total;
	// }

	// public void add(Product prod){
	// this.products.add(prod);
	// this.total++;
	// System.out.println("product successfully added.");
	// }

	// public void remove(int index){
	// products.remove(index);
	// this.total--;
	// //System.out.println("num products " + products.size());
	// }

	// public Product find(int productId){
	// if(total == 0) {
	// System.out.println("There a re no products available");
	// return null;
	// }
	// else{
	// int count = 0;
	// while(count < products.size()){
	// Product reader = products.get(count);
	// if(productId == reader.getId())
	// return reader;
	// count++;
	// }
	// System.out.println("Invalid/unknown product id.");
	// return null;
	// }
	// }
}
