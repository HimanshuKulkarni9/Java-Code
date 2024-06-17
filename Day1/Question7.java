package Day1;

public class Question7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 1234 , last;
		int sum = 0;
		while(num != 0) {
			last = num % 10;
			sum = sum + last;
			num /= 10;
		}
		System.out.println("sum of digits = "+ sum);
	}

}
