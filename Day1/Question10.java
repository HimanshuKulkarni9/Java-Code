package Day1;

public class Question10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 1124;
		int add = 0,sum = 1;
		
		while(num != 0) {
			int last = num % 10;
			sum = sum*last;
			add = add+last;
			
			num/=10;
		}
		if(sum == add) {
			System.out.println("sum :"+ sum );
			System.out.println("add :"+ add );
		}else {
			System.out.println("not special");
		}
	}

}
