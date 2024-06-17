package day2_HomeWork;

public class prog1 {

	int day,month,year;
	
	public void initDate() {
		day = 30;
		month = 2;
		year = 2021;
	}
	
	public void printDate() {
		System.out.println(day+"/"+month+"/"+year);
	}
	
	public static void main(String[] args) {
		prog1 d;
		d = new prog1(); // objct
		
		d.initDate();
		d.printDate();

	}//end main

}//endclass
