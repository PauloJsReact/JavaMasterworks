package chalenge;

public class Person {

	String name;
	double weght;
	double  foodWegth;
	double finalWegth;

	Person(){
		this("Daniel",150,125);
	}
	Person(String name,double weght,double foodWegth){
		this.name = name;
		this.weght = weght;
		this.foodWegth = foodWegth;
		this.finalWegth = this.weght + (foodWegth/1000) ;
	}

	
	String printCurrentPerson() {
		return this.name+" comeu "+foodWegth+ "g de arroz e bife e acabou pesando "+this.finalWegth+"kg";
	}
	
}
