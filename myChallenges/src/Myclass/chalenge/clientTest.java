package Myclass.chalenge;

import java.util.Arrays;

public class clientTest {
	public static void main(String[] args) {
	
		
		Product product1 = new Product("Manga", 26.00);
		Product product2 = new Product("Potato", 22.00);
		Product product3 = new Product("Water Melon", 35.00);
		
		
		Item item1 = new Item(product1,10);
		Item item2 = new Item(product2,5);
		Item item3 = new Item(product3,2);
		
		
		Buy chest1 = new Buy(item3);
		
		System.out.println(chest1.totalValue);
		
		Buy chest2 = new Buy(item2);
		
		System.out.println(chest2.totalValue);
		
		chest1.addItem(item1);
		System.out.println(chest1.totalValue);
		
		chest1.addItem(item2);
		System.out.println(chest1.totalValue);
		System.out.println(chest1.id);
		
		System.out.println(item1.name+" "+item1.number+Arrays.toString(item1.get(product1)));
		Item ItensArray [] = chest1.getItemArray();
		System.out.println(Arrays.toString(ItensArray));
		
		
		Object itemsInchest[][] = chest1.getArrayMatrix();
		String garbage [][] = new String[itemsInchest.length][itemsInchest[0].length];
		for (Object[] line : itemsInchest) {
			System.out.println(Arrays.toString(line));	
		}
		for (int i = 0; i < itemsInchest.length; i++) {
			for (int j = 0; j < itemsInchest[i].length; j++) {
				garbage[i][j]=String.valueOf(itemsInchest[i][j]);
			}
			
		}
		
		
		String[] header = {"NAME", "VALUE"};
		creatArchive.creator("itens.csv", header, garbage);
		
	}
}
