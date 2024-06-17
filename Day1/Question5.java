package Day1;

public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 1221, last;
		int rev = 0;
		int temp = num ;
		while(temp != 0) {
			last = temp % 10;
			rev = rev*10 + last;
			temp /= 10;
		}
		if(num == rev) {
			System.out.println("Num is palindrome " + rev + " num = " + num);
		}else {
			System.out.println("num is not palindrome" + rev + "num" + num);
		}
	}	

}
