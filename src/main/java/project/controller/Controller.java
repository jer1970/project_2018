package project.controller;

import javafx.scene.control.TextField;
import project.services.CreateCustomer;
import project.services.Delete;
import project.services.Search;
import project.services.Update;

public class Controller {
	private CreateCustomer ce;
	private Search sch;
	private Update ud;
	private Delete del;
	
	public void createCustomer(TextField id,String name, String address){
		 ce = new CreateCustomer();
		 ce.createCust(id, name, address);		 
	}
	
	public void findCustomer(TextField txtName, TextField txtAddress, String custId){
		int id = Integer.parseInt(custId);
		sch = new Search();
		sch.findCustomer(txtName, txtAddress, id);
	}
	
	public void updateCustomer(String name, String address, String custId){
		int id = Integer.parseInt(custId);
		ud = new Update();
		ud.updateCust(name, address, id);
	}
	
	public void deleteCustomer(String custId){
		int id = Integer.parseInt(custId);
		del = new Delete();
		del.deleteCust(id);
	}
}
