package Myclass.chalenge;

import java.util.Arrays;
import java.util.Scanner;

import Myclass.textMachinePrint;

public class ClientsChestList {
	public static String green = "\u001B[32m";
	public static String reset = "\u001B[0m";
	
	public static void main(String[] args) {
		String data ;
		String name ;
		String client;
		int number;
		Double value;
		Scanner textIMput = new Scanner(System.in);  
		
		
		
		print("Qual o seu nome?\n");
		client = textIMput.nextLine();
		print("\nOla "+ client +"\nO que vai ser para hoje?\nPor favor digiteo nome do produto\n");
		name = textIMput.nextLine();
		print("\nOk vai ser "+ name +"!");
		print("\nQuanto vai ser?\n ");
		number =textIMput.nextInt();
		print("\nSabe o valor?\n");
		value = textIMput.nextDouble();
		
		creatChest(client, name, number, value);
	
		
	}
	public static void print(String text) {
		 textMachinePrint.textPrint(text, 100);
	}
	
	public static void creatChest( String client,String name,int Number, Double Value) {
		Product product = new Product(name, Value);
		Item item = new Item(product, Number);
		Buy chestClient = new Buy(item);
		print("\n"+green+"Parabems o produto adicionado !!\n");
	
		matrixReturn(chestClient,client,chestClient.id);
	}
	
	
	public static void matrixReturn(Buy chest,String client,int id) {
		Object itemsInchest[][] = chest.getArrayMatrix();
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
		creatArchive.creator(client+"-9"+id+".csv", header, garbage);
		
	}
}
