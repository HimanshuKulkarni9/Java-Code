package JavaArrayPractice;

public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10,20,10,20,30};
		
		for(int i=0;i<arr.length;i++) {
			int a = arr[i];
	
			// check duplicate element
			for(int k =0 ; k<i;k++) {
				if(a==arr[k]) {
					System.out.println(a);
				}
			}
			
			
			 
		}
	}//end main

}//end class
