package JavaArrayPractice;

public class Question1 {

	/*1) Java Program to copy all elements of one array into another array */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr1[] = {10,20,30,40};
		int arr2[] = new int[arr1.length] ;
		for(int i=0; i<arr1.length; i++) {
			 arr2[i] = arr1[i];
		}
		
		//print arr 1
		for(int i=0; i<arr1.length; i++) {
			System.out.print("arr 1 = " + arr1[i] + ", ");
		}
		System.out.println();
		//print arr2
		for(int i=0; i<arr1.length; i++) {
			System.out.print("arr2 = " + arr2[i] + ", ");
		}
		
		
		
	}//end main

}//end class
