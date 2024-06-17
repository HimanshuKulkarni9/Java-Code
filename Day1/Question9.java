package Day1;
import java.util.Scanner;
public class Question9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a");
		int a = sc.nextInt();
		System.out.println("enter b");
		int b = sc.nextInt();
		
		int add = a+b;
		int mul = a*b;
		
		int sum = add + mul;
		
		if(a*10+b == sum) {
			System.out.println("special number = " + add +"+"+ (mul) + "=" + sum);
		}
		
		
	}

}
