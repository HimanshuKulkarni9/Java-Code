package JavaArrayPractice;

public class Question13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10,20,30,40,50};
		
		//before rotating
				System.out.print("Before right : ");
				for(int i =0; i<arr.length;i++) {
					System.out.print(arr[i] + " ");
				}
				
				//method
				int temp = arr[arr.length - 1];
				
				for(int j =arr.length - 1;j>0;j-- ) {
					arr[j] = arr[j-1];
				}
				arr[0] = temp; 
				
				//after rotating
				System.out.println();
				System.out.print("After right : ");
				for(int i =0; i<arr.length;i++) {
					System.out.print(arr[i] + " ");
				}
	
	
	
	}

}
