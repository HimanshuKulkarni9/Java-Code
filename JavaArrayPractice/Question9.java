package JavaArrayPractice;

public class Question9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10,20,30,40,50};
		
		
			int largest = arr[0];
			
			for(int j=0;j<arr.length;j++) {
				if(largest < arr[j]) {
					largest = arr[j];
				}
				
			}
			System.out.println("Largest element : " + largest);
		
		
	}

}
