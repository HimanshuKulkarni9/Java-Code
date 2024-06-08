package Day1;
import java.util.Scanner;
public class Question11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the value of num:");
	    int num=sc.nextInt();
	    System.out.println(num);
	      
	    int sum = 0, rsum = 0, last;
	    while(num != 0) {
	    	last = num % 10;
	    	sum = sum + last;
	    	num /= 10;
	    }
	    System.out.println("sum of digit = " + sum);
	    
	    int temp = sum;
	    while(temp != 0) {
	    	last = temp % 10;
	    	rsum = rsum + last;
	    	temp /= 10;
	    }
	    
	    System.out.println("rsum = " + rsum);
	}

}
