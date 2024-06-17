package JavaArrayPractice;

public class Question15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int arr[] = {1,2,3,4,5};
	
	System.out.print("Before sorting decs : ");
	for(int i =0;i<arr.length;i++) {
		System.out.print(arr[i] + " ");
	}
	
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println();
		System.out.print("After sorting decs : ");
		for(int i =0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
