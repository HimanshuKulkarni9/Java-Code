package Day1;

public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 123, last;
		int rev = 0;
		int temp = num ;
		while(temp != 0) {
			last = temp % 10;
			rev = rev*10 + last;
			temp /= 10;
		}
		System.out.println("reverse num = " + rev);
		System.out.println("num = " + num);
	}

}
