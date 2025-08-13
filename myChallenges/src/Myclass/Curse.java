package Myclass;

import java.util.ArrayList;
import java.util.List;

public class Curse {

	String name ;
final List <Student> student = new ArrayList<>();
	Curse (String name){
		this.name = name;
	}

	void addStudent (Student student) {
		this.student.add(student);
		student.curse.add(this);
	}
}
