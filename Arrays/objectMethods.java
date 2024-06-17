package Arrays;

public class objectMethods {
	int a ;
	int b;
	
	objectMethods(){
		a = 1;
		b = 2;
	}
	objectMethods(int a, int b){
		this.a = a;
		this.b = b;
	}
	
	public String toString() {
		return "a = "+a+" b = "+b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		objectMethods m1 = new objectMethods();
		System.out.println("Obj m1 => " + m1.toString());
		System.out.println("hashcode m1 => " + m1.hashCode());
		
		objectMethods m2 = new objectMethods(2,2);
		System.out.println("m2 => " + m2);
		//System.out.println("Obj m2 => " + m2.toString());
		System.out.println("hashcode m2 => " + m2.hashCode());
		
		objectMethods m3 =  m2;
		System.out.println("obj m3 = " + m3);
		System.out.println("hashcode m2 => " + m3.hashCode());
		
		System.out.println("equal m1 m2 = " + m1.equals(m2));
		System.out.println("equal m1 m3 = " + m1.equals(m3));
		System.out.println("equal m2 m3 = " + m2.equals(m3));
		
	
	}//end main

}//end class
