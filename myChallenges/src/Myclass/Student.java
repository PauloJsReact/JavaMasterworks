package Myclass;

import java.util.ArrayList;
import java.util.List;

public class Student {

		String name;
		final List<Curse> curse = new ArrayList<>();
		
		 Student(String name) {
			this.name = name;
		}
		
		void addCurse (Curse curse) {
				this.curse.add(curse);
				curse.student.add(this);
		}
		
		Curse searchCurseForName (String name) {
			for(Curse  curse: this.curse) {
				if (curse.name.equalsIgnoreCase(name)) {
					return curse;
				}
				}
			return null;
			
			
		}
		public String toString() {
		return name;
		}
}
