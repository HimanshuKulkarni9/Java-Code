package JavaArrayPractice;

public class Question14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {5,4,3,2,1};
		
		System.out.print("Before sorting Asc : ");
		for(int i =0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		System.out.println();
		System.out.print("After sorting asc : ");
		for(int i =0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		
	}

}
