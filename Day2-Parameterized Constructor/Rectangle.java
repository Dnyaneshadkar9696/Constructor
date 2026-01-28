package constructor.day2;

public class Rectangle {
	int length;
	int width;

	public Rectangle(int length, int width) {
		// TODO Auto-generated constructor stub

		this.length = length;
		this.width = width;

	}
	
	public Rectangle() {
		// TODO Auto-generated constructor stub
		
		int length = 10; 
		int width = 5;
		System.out.println("Area of rectangle : "+ (length * width));
	}

	public void areaofRectangle() {
		System.out.println("Area of Rectangle :" + (length * width));
	}

}
