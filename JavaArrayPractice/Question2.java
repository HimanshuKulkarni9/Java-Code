package JavaArrayPractice;

public class Question2 {
	/*2) Java Program to find the frequency of each element in the array
*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10,20,10,20,30};
		
		for(int i=0;i<arr.length;i++) {
			int a = arr[i];
			boolean flag = false;
			// check repeted element
			for(int k =0 ; k<i;k++) {
				if(a==arr[k]) {
					flag = true;
				}
			}
			
			// for count uniqe element
			if(!flag) {
				int count = 0;
			for(int j=0;j<arr.length;j++) {
				if(arr[i] == arr[j] ) {
					count++;
					}	
				
				}
			System.out.println("element " + a + " time " + count);
			}
			 
		}
		
		
	}//end main

}//end class
