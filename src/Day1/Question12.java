package Day1;
import java.util.Scanner;
public class Question12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int num = sc.nextInt();
		int flag = 0;
		while(num!=0) {
			int last = num%10;
			if(last == 0) {
				flag = 1;
			}
			num/=10;
		}
		if(flag != 0) {
			System.out.println("number is duck");
		}else {
			System.out.println("not dusk");
		}
	}

}
