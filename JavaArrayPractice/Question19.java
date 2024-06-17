package JavaArrayPractice;

public class Question19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {20,30,40,50,10};
		int small = arr[0];
		for(int i =0;i<arr.length;i++) {
			if(small > arr[i]) {
				small = arr[i];
			}
		}
		System.out.println("small : " + small);
		
		int small2 = arr[0];
		for(int i =0;i<arr.length;i++) {
			if(small2 > arr[i] && arr[i] != small) {
				small2 = arr[i];
			}
		}
		System.out.println("small2 : " + small2);
	}

}
