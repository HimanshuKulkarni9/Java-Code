package Day1;

public class Question8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 6;
		int n1 = 0, n2 = 1, n3;
		System.out.println(n1);
		System.out.println(n2);
		for(int i = 2; i<num ; i++) {
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			System.out.println(" "+n3);
		}
	}

}
