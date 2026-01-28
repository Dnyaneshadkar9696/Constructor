package constructor.day2;

public class EvenOdd {
	int num;
	public EvenOdd(int num) {
		// TODO Auto-generated constructor stub
		this.num = num;
		
	}
	
	public void evenCheck() {
		if(num%2 == 0) {
			System.out.println("The number is even");
		}
		else {
			System.out.println("The number is odd");
		}
	}

}
