package JavaArrayPractice;

public class Question21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10,20,10,30,40};
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i] == arr[j]) {
					System.out.println();
				}
			}
			
		}
		
		
		
	}

}
