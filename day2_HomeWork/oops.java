package day2_HomeWork;

class Student{
	String name;
	int age;
	
	public void studentInfo() {
		System.out.println("Name : " + name);
		System.out.println("Age : " + age);
	}
	Student(String n , int a){
		name = n;
		age = a;
	}
}


public class oops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student("Himanshu" , 26);
		
		s1.studentInfo();
	}

}
