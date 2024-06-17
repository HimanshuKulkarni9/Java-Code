package JavaArrayPractice;

public class Question17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10,20,30,40,50};
		int large = arr[0];
		for(int i =0;i<arr.length;i++) {
			if(large < arr[i]) {
				large = arr[i];
			}
		}
		System.out.println("large : " + large);
		int large2 = arr[0];
		for(int i =0;i<arr.length;i++) {
			if(large2 < arr[i] && arr[i] != large) {
				large2 = arr[i];
			}
		}
		System.out.println("large2 : " + large2);
	}

}
