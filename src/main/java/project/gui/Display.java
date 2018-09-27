package project.gui;

import javafx.scene.control.TextField;
import project.entities.Customer;

public class Display {
	public void displayCustomer(TextField name, TextField address, Customer customer){
		name.clear();
		address.clear();
		if(customer != null){
		name.setText(customer.getName());
		address.setText(customer.getAddress());
		System.out.println("name =  " + customer.getName() + " address = " + customer.getAddress());
		}
	}
	
	public void displayId(TextField txtId, int id){
		txtId.setText(""+id);
	}
}
