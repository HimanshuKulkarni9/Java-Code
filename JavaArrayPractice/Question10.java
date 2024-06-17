package JavaArrayPractice;

public class Question10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10,20,30,40,50};
		int smallest = arr[0];
		
		for(int j=0;j<arr.length;j++) {
			if(smallest > arr[j]) {
				smallest = arr[j];
			}
			
		}
		System.out.println("smallest element : " + smallest);
	}

}
