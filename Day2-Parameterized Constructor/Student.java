package constructor.day2;

public class Student {

	String name;
	int Id;

	public Student() {
		// TODO Auto-generated constructor stub

		System.out.println("Welcome Student ");
	}

	public Student(String name, int Id) {

		this.name = name;
		this.Id = Id;

	}
	
	public void studentInfo() {
		System.out.println("Student Name : " + name);
		System.out.println("Student ID : " + Id);
	}

}
