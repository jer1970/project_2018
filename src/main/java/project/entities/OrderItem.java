/**
 * name: Jeremy Staunton
 * Id:R00158317
 * class: sd2
 * COMP7013
 */
package project.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table
public class OrderItem implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -2466195084485425933L;
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int orderNum;
	@OneToMany( targetEntity=OrderDetails.class )
	private List<OrderDetails> orderDetails;
	private int custId;
	//private int total;

		
	private static int ORDERNUM;
		
	public OrderItem(int custId){
		orderDetails = new ArrayList<OrderDetails>();
		//this.total = 0;
		this.orderNum = ORDERNUM++;
		this.custId = custId;
		}
	public OrderItem(){
	}
	public OrderItem(OrderDetails od){
		orderDetails.add(od);
	}
	
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public void add(Product prod, int quantity){
		OrderDetails oD = new OrderDetails(prod, quantity);
		orderDetails.add(oD);
	}
	public void add(OrderDetails od){
		orderDetails.add(od);
	}
	
	public List<OrderDetails> getOrderDetails(){
		return this.orderDetails;
	}
	
	public void print(){
		for(int i = 0; i < this.orderDetails.size(); i++)
			this.getOrderDetails().get(i).print();
	}
}

