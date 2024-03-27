package Myclass;

public class formatDate {
	int  day;
	int month;
	int year;
	
	
	formatDate(int day,int month,int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	String printFormatdate(){
		return String.format("%d/%d/%d", day,month,year);
	}

}
