package constructor.day2;

public class ReverseNumber {
	
	int num; 
	
	// global variable 
	
	public ReverseNumber(int num) {
		// TODO Auto-generated constructor stub
		this.num = num;
		// parameterized constructor
	}
	
	// logic for reverse of the number is in method 
	
	public void reverseNumber() {
		int reverse = 0;
		while( num > 0) {
			
		
		int digit  = num%10;
		// it will give the last number 
		reverse = reverse * 10 + digit;
		
		num = num / 10;
		
		}
		
		System.out.println("Reverse Number : "+ reverse);
		
		
	}

}
