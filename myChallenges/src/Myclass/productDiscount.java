package Myclass;

public class productDiscount {

	public static void main(String[] args) {
		Product cellPhone = new Product();
		cellPhone.name="Nokia";
		cellPhone.price = 200;
		
		Product book = new Product("Little Prince",30);
		
		System.out.println(cellPhone.name +":"+cellPhone.discoutPrice());
		
		System.out.println(book.name +":"+book.discoutPrice());
		
	}
}
