package LabManual_day_1;

public class LM_LE_1_PS_1 {

	
		int day,month,year;
		
		public void initDate() {
			day = 21;
			month = 02;
			year = 2024;
		}
		public void printDate()
		   {
			System.out.println("Date:"+" "+day+"/"+month+"/"+year);	
		   }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LM_LE_1_PS_1 d = new LM_LE_1_PS_1();
		d.initDate();
		  d.printDate();
	}

}
