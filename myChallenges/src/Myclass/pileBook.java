package Myclass;
import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
public class pileBook {
public static void main(String[] args) {
	Deque<String> books = new ArrayDeque<String>();
	
	books.add("little prince");
	books.add("DON QUIXOTE");
	books.add("The hobbit");
	
	System.out.println(books.peek());
	System.out.println(books.element());
	System.out.println(books.poll());
	System.out.println(books.pop());
	System.out.println(books.size());
}
}
