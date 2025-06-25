package Myclass;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class mapUsers {
public static void main(String[] args) {
	Map<Integer, String> users = new HashMap<>();
	users.put(1, "Roberta");
	users.put(2, "Rafael");
	users.put(3, "Donatelo");
	
	//System.out.println(users.get(1));
	for (String value:users.values()) {
		System.out.println(value);
	}
	
	for(int key:users.keySet()) {
		System.out.println(key);
	}
	
	
	for (int index = 1 ; index < users.size()+1; index++) {
		System.out.println(index+"--> "+users.get(index));
	}
	
	
	for(Entry<Integer, String> UserAll : users.entrySet()) {
		System.out.print(UserAll.getKey()+"=> ");
		System.out.println(UserAll.getValue());
	}
}
}
