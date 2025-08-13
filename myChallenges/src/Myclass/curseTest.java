package Myclass;

import java.util.Iterator;

public class curseTest {

		public static void main(String[] args) {
			Student student1 = new Student("Jhon");
			Student student2 = new Student("Ana");
			Student student3 = new Student("Fransis");

			Curse curse1 = new Curse("Starting Js");
			Curse curse2 = new Curse("Starting pyton");
			Curse curse3 = new Curse("Starting C#");
			
			
			curse1.addStudent(student1);
			curse1.addStudent(student2);
			curse1.addStudent(student3);
			
			student1.addCurse(curse2);
			student2.addCurse(curse2);
			student3.addCurse(curse2);
			
			curse3.addStudent(student1);
			curse3.addStudent(student2);
			curse3.addStudent(student3);
			
			
			for (Student student : curse3.student) {
				String text =" \nMy name  is ... "+student.name
						+" I an student for curse... "+ curse3.name;
				textMachinePrint.textPrint(text, 200);
			}
			
			System.out.println("\n"+student1.curse.get(0).student);
			textMachinePrint.textPrint("\n"+student2.searchCurseForName("Starting pyton").student, 200);
			
	
		}
}
