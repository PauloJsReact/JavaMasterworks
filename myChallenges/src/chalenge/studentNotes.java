package chalenge;

import java.util.Arrays;
import java.util.Scanner;

import org.w3c.dom.Text;

public class studentNotes {

public static void main(String[] args) {
	String text;
	@SuppressWarnings("resource")
	String stringLength;
	Scanner scanner = new Scanner(System.in);
	
	text ="In this app you are a teacher!"
		+ "\nPlease how many grades will you give this student?\n";
	typeWinter(text, 100);
	
	//Here comes the size of the Array
	stringLength = scanner.nextLine();
	int arraySize = Integer.parseInt(stringLength);
	
	//Here the Array array is created
	double studetGrades[]= new double[arraySize] ;
	
	
	//System.out.println(Arrays.toString(studetGrades));
	
	//At this stage, note by note is entered according to the index
	for (int i = 0; i < studetGrades.length; i++) {
		int num= i +1;
		String imput;
      typeWinter("\nTell me which one is "+ num +"º?\n", 100);
   
      imput = scanner.nextLine();
      
      studetGrades[i]=Integer.parseInt(imput);
	}
	
	
	//System.out.println(Arrays.toString(studetGrades));
	
	typeWinter("\nThis is the end result\n", 100);
	int total=0;
	for(double grade :studetGrades) {
		System.out.println(grade);
		 total += grade;
	}
	
	double average = total / studetGrades.length;
	typeWinter("\nThis student's average is "+average, 100);
}	

	
	
	public static void typeWinter(String text , int delay ) {
		for (char ch : text.toCharArray()) {
			System.out.print(ch);
			try {
				Thread.sleep(delay);
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
