package JavaArrayPractice;

public class Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10,20,30,40,50};
		
		//printing orignal array
		System.out.println("orignal array :");
		for(int i = 0; i<arr.length; i++) {
			System.out.print( " " + arr[i] + " ");
		}
		
		System.out.println();
		//method
		for(int i = 0; i<arr.length/2; i++) {
			int temp = arr[i];
			arr[i] = arr[arr.length - 1 - i];
			arr[arr.length - 1 - i] = temp;
		}
		
		//printing reverse array
		System.out.println("reverse array :");
		for(int i = 0; i<arr.length; i++) {
			System.out.print( " " + arr[i] + " ");
		}
		
		
	}//end main

}//end class
