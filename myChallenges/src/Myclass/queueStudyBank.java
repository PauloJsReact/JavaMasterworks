package Myclass;

import java.util.LinkedList;
import java.util.Queue;


public class queueStudyBank {
	public static void main(String[] args) {
		Queue<String> bankList =new LinkedList<>();
		bankList.add("Ana");
		bankList.offer("Aroudo");
		bankList.add("Francisca");
		bankList.offer("Eduard");
		
		System.out.println(bankList.peek());
	}
}
