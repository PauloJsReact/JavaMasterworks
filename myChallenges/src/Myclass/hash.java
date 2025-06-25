package Myclass;

import java.util.HashSet;

public class hash {
public static void main(String[] args) {
	HashSet<Users> userAll = new HashSet<Users>();
	
	userAll.add(new Users("Piter", null, 0));
	userAll.add(new Users("Guilherme",null,0));
	userAll.add(new Users("Aroudo",null,0));
	
	boolean result = userAll.contains(new Users("Daniel", null, 0));
	
	System.out.println(result);
}
}
