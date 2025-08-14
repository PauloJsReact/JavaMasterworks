package Myclass.chalenge;

import java.util.ArrayList;
import java.util.List;

public class Buy {
	int id ;
	String itemName;
	int totalValue;
	
	List<Item> item = new ArrayList<>();
	
	 Buy(Item item) {
		 this.id = 1000 + (int) (Math.random() * 9000);
		 this.item.add(item);
		 totalValue = Math.addExact(item.number, totalValue);
	}
	 
	public void addItem(Item item) {
		this.item.add(item);
		totalValue = Math.addExact(item.number, totalValue);
	}
	
	public List<Item> printMatrix() {
		return this.item;
	}
	
	public Item[] getItemArray() {
		return this.item.toArray(new Item[0]);
	}
	
	public Object[][] getArrayMatrix() {
		Object matrix[][] = new Object[this.item.size()][2];
		for (int i = 0; i < this.item.size(); i++) {
			matrix[i][0] = this.item.get(i).name;
			matrix[i][1] = this.item.get(i).number;
		}
		return matrix;
	}
}
