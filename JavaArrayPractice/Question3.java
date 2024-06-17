package JavaArrayPractice;

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10,20,30,40,50};
	
		System.out.print("Before Left rotate : ");
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i] + ",");
		}
		
		//method
		int temp = arr[0];
		int j = 0;
		for(j=0;j<arr.length - 1;j++) {
			arr[j] = arr[j+1];
		}
		arr[j] = temp;
	
		//print after rotate
		System.out.println();
		System.out.print(" After Left rotate : ");
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i] + ",");
		}
		
		
	}//end main

}//end class
