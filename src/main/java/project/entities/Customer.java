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
public class Customer implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -9072797749649611165L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int custId;
	private String name;
	private String address;
	@OneToMany( targetEntity=OrderItem.class )
	private List<OrderItem> list;
	private static int CUSTID;

	public Customer(String name, String address) {
		this.custId = CUSTID++;
		this.name = name;
		this.address = address;
		this.list = new ArrayList<OrderItem>();
	}

	public Customer() {

	}

	public int getCustId() {
		return custId;
	}

	public void setCustId() {
		this.custId = CUSTID++;
	}

	public String getName() {
		String aName = this.name;
		return aName;
	}

	public String getAddress() {
		String anAddress = this.address;
		return anAddress;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<OrderItem> getList() {
		List<OrderItem> aList = this.list;
		return aList;
	}

	public void setList(ArrayList<OrderItem> list) {
		this.list = list;
	}

	public void addOrder(OrderItem p) {
		list.add(p);
	}

	public String toString() {
		return "Customer\n" + "Name: " + getName() + "\tAddress: " + getAddress();
	}
}
