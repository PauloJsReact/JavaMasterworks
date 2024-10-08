package arrays;

import java.util.Arrays;
import java.util.Iterator;

public class Exercice {
	public static void main(String[] args) {
		double[]  studentNotesA = new double[3];
		/* this is a array to add notes to a student's name A, 
		 * it contains three positions*/
		studentNotesA[0]=22;
		studentNotesA[1]=30;
		studentNotesA[2]=50;
		
		String printF = Arrays.toString(studentNotesA);	
		System.out.println(printF);
		double result =0;
		
		for (int i = 0; i < studentNotesA.length; i++) {
			result += studentNotesA[i];
		}
		
		System.out.println(result/studentNotesA.length);
		
	}
}
