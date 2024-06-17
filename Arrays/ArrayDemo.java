package Arrays;
import java.util.*;
public class ArrayDemo {

	public static void main(String[] args) {
		int arr[] = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array elements");
		for(int i=0;i<5;i++) {
			arr[i] = sc.nextInt();
		}
		
		// to print

		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}//end main

}//end class
