package Arrays;

public class StaticDemo {
	
	int sid;
	String sname;
	
	static int count;
	static
	{  //static block 1..
		count = 100;
	}
	
	StaticDemo() {
		sid = ++count;
		sname = "Himanshu";
	}
	StaticDemo(String name){
		this.sid = ++count;
		this.sname = name;
	}
	
	public void display() {
		System.out.println("Sid :" + sid);
		System.out.println("Sname : " + sname);
	}
	
	public static void displayCount() {
		System.out.println("total student : " + (count - 100));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticDemo s1 = new StaticDemo();
		s1.display();
		StaticDemo s2 = new StaticDemo("kulkarni");
		s2.display();
		StaticDemo s3 = new StaticDemo("kulkarni");
		s3.display();
		
		StaticDemo.displayCount();

	}

}
