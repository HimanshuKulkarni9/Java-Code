package Day1;
import java.util.Scanner;
public class Question14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int num = sc.nextInt();
		int sq = num*num;
		int temp = num , flag = 0;
		while(temp != 0) {
			int t = temp%10;
			int s= sq%10;
			if(t != s) {
				flag = 1;
			}
			temp/=10;
			sq/=10;
		}
		if(flag == 0) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
	}
	

}
