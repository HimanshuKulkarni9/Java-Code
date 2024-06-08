package Day1;
import java.util.Scanner;
public class Question15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter num");
		int num = sc.nextInt();
		int temp = num,sum = 0;
		while(temp != 0) {
			int last = temp%10;
			int fact = 1;
			for(int i =1;i<=last;i++) {
				fact = fact * i;
			}
			System.out.println("fact = "+fact);
			sum = sum + fact;
			temp/=10;
			}
		
		if(sum == num) {
			System.out.println("sum : "+ sum +" = " + " num : " + num);
		}
		else {
			System.out.println("not number");
			
			System.out.println("sum ="+sum);
		}
	}

}
