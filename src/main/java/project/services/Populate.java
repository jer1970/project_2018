/**
 * name: Jeremy Staunton
 * Id:R00158317
 * class: sd2
 * COMP7013
 */
package project.services;

public class Populate {
	public void populate(){
	CreateCustomer ce =  new CreateCustomer();
	ce.createCust("Joe", "Cork");
	ce.createCust("Kevin", "Cork");
	ce.createCust("Tom", "Limerick");
	ce.createCust("Ted", "Bandon");
	CreatePhone cp = new CreatePhone();
	CreateTv ctv = new CreateTv();
	cp.createPhone(4, "smartphone", "A very good phone", "Samsung", "Galaxy S6", 80, 459.99);
	ctv.createTv(4, "tv", "Really big tv ", "Sony", 60, "LCD", true, 1190.00);
	cp.createPhone(4, "smartphone", "An amazing phone", "Apple", "iPhone 8", 64, 659.99);
	ctv.createTv(3, "tv", "3D tv ", "Panasonic", 55, "LED", true, 890.00);
	cp.createPhone(6, "smartphone", "A very nice phone", "Apple", "iPhone 6", 64, 499.99);
	ctv.createTv(5, "tv", "Surround Sound tv ", "Sony", 40, "LCD", false, 590.00);
	cp.createPhone(5, "smartphone", "A really good phone", "Nokia", "lumia 10", 64, 659.99);
	ctv.createTv(2, "tv", "Giant tv ", "Sony", 77, "LCD", true, 1890.00);
	
	Search sch = new Search();
	sch.find(2);
	sch.find(1);
	DisplayProducts dp = new DisplayProducts();
	dp.display();
	
	CreateOrder co = new CreateOrder();
	co.createOrder(1, 2, 1);
	co.createOrder(2, 3, 1);
	co.createOrder(2, 3, 1);
	co.createOrder(1, 7, 1);
	co.createOrder(3, 4, 1);
	DisplayOrders disOrd = new DisplayOrders();
	disOrd.display();
}
}
