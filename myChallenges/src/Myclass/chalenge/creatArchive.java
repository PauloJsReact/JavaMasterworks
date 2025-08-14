package Myclass.chalenge;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class creatArchive {
	
	public static void generateCSV(String archiveName) {
	    String [] head = {"Product","Value"};
		String [][] data ={ {"Banana","23"},{"Potato","45"}};
		
		
		try(FileWriter writer = new FileWriter(archiveName)){
			writer.append(String.join(",", head));
			writer.append("\n");
			
			
			for(String [] line: data) {
				writer.append(String.join(",", line));
				writer.append("\n");
			System.out.println("Achive crated sucessful");
			}
		}catch (  IOException e) {
			System.out.println("Error in creation archive"+e);
		}
	}
	
	public static  void creator(String archiveName, String [] head, String [][] data) {
			try(FileWriter writer = new FileWriter(archiveName)){
				writer.append(String.join(",", head));
				writer.append("\n");
				
				
				for(String [] line: data) {
					writer.append(String.join(",", line));
					writer.append("\n");
				System.out.println("Achive crated sucessful");
				}
			}catch (  IOException e) {
				System.out.println("Error in creation archive"+e);
			}
	}
	


	/*
	public static void main(String[] args) {
		generateCSV("newarchive.csv");
	}*/
}
