package Myclass.chalenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Item {
	String name ;
	int number;
	List<Product> product =new ArrayList<>();
	
	 	Item(Product product,int number ) {
		this.name = product.name;
		this.number= number;
	}
	void addProduct(Product product) {
		this.product.add(product);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	public String[] get(Product product) {
		String[] matrix= {product.name,product.value.toString()};
		return matrix;
	}
	
	public String[] getAll() {
		
		return (String[]) this.product.toArray();
	}
}
