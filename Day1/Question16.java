package Day1;
import java.util.Scanner;
public class Question16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int num = sc.nextInt();
		int temp = num;
	
		while(temp > 10) {
			temp/=10;
		}
		
		int last = num%10;
		int sum = temp + last;
		System.out.println("temp :"+temp+"last :"+last+" = "+sum);
	}

}
