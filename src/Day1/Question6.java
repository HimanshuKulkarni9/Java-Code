package Day1;

public class Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 17;
		int flag = 0;
		for(int i = 2; i < num /2; i++) {
			if(num % i == 0) {
				flag = 1;
			}
		}
		if(flag != 1) {
			System.out.println("prime");
		}
		else {
			System.out.println("not prime");
		}
	}

}
