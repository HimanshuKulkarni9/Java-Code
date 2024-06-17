package Day1;
import java.util.Scanner;
public class Question13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int num = sc.nextInt();
		
		int sum = num*num;
		int temp =sum , add = 0;
		while(temp !=0) {
			int last = temp%10;
			add = add + last;
			temp/=10;
		}
//		System.out.println(sum + add);
		if(num == add) {
			System.out.println("num ="+ num + " = " + "add=" + add );
		}else {
			System.out.println("not neon number");
		}
		
	}

}
