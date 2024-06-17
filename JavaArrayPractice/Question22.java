package JavaArrayPractice;

public class Question22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10,20,33,40,55};
		
		for(int i=0; i<arr.length; i++) {
			
			if(arr[i] % 2 == 0) {
				System.out.println("even : " + arr[i]);
			}
			else {
				System.out.println("odd : " + arr[i]);
			}
		}
	}

}
