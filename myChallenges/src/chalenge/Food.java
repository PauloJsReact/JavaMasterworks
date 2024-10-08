package chalenge;

public class Food {
	String name;
	double weight;
	
	Food(){
		name="arroz";
		weight=200;
	}
	Food(String name,double weght){
		this.name =  name;
		this.weight = weght;
	}
	
	String printCurrentFood(){
		return name+","+weight+" g";
	}

}
