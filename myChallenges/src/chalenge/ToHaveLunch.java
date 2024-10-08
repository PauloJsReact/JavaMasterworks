package chalenge;

import java.util.ArrayList;
import java.util.Scanner;

public class ToHaveLunch {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		ArrayList<Food> foodList = new ArrayList<>();
		ArrayList<Person> personList = new ArrayList<>();
		
		String textBoxname;
		double texBoxwheigth;
		
		String textBoxnamePerson;
		double texBoxwheigthPerson;
		
		String text ="";
	
		
		text  = "This is the app to plan your dinner."
			+   "\nAnd there will be five courses. One for each person.";
		typeWinter(text, 100);

		for (int i = 1; i < 4; i++) {
			//Person:
			
			text = "\nPlease tell me the person's name "+ i +" :";
			typeWinter(text, 100);
			textBoxnamePerson  = scanner.nextLine();
			text = "\nPlease tell me the weight of "+textBoxnamePerson+"?";
			typeWinter(text, 100);
			texBoxwheigthPerson = scanner.nextDouble();
			scanner.nextLine();
		
			
			//food:
			text = "\nPlease choose the name of the meal from "+textBoxnamePerson;
			typeWinter(text, 100);
			textBoxname = scanner.nextLine();
			
			text =  "\nAlright, what will be the quantity in grams of "+textBoxname+"?";
			typeWinter(text, 100);
			texBoxwheigth = scanner.nextDouble();
			scanner.nextLine();
			
			Food food = new Food(textBoxname,texBoxwheigth);
			foodList.add(food);
			Person person =new Person(textBoxnamePerson,texBoxwheigthPerson,texBoxwheigth);
			personList.add(person);
		}
		scanner.close();
		
		text ="Here are the people who will have dinner:";
		typeWinter(text, 100);
		for (Person person: personList) {
			typeWinter("\n-->"+person.printCurrentPerson(), 100);
		}
		
		text = "\n\nHere are the planned dishes:";
		typeWinter(text, 100);
		for(Food food: foodList) {
			typeWinter("\n - "+food.printCurrentFood(), 100);
		}
		
		
	}
	
	public  static void typeWinter(String text,int delay) {
		for (char ch : text.toCharArray()) {
			System.out.print(ch);
	
			try {
				Thread.sleep(delay);
			}catch (Exception e) {
				e.printStackTrace();
			}
				
		}
		System.out.flush();
	}
}
