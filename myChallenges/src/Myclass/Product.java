package Myclass;


public class Product {
	String name;
	double price;
 	final static double discount = 0.25;
 
 	//Constructor
 	Product(){
 	}
 	
 	Product(String firstName,double firstPrice){
 		name = firstName;
 		price = firstPrice ;
 	}
 	
 	double discoutPrice () {
 		return price * (1- discount);
 	}
 	
}
