package Day1;

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 153;
		int arm = 0;
		int n = num;
		int n1;
		while(n != 0) {
			n1 = n%10;
			arm = arm + n1*n1*n1;
			n = n/10;
		}
		
		if(arm == num) {
			System.out.println("num is armstrong");
		}else {
			System.out.println("not arm strong");
		}
	}

}
