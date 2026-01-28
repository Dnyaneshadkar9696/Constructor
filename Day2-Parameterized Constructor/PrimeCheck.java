package constructor.day2;

public class PrimeCheck {
	
	int number;
	
	public PrimeCheck(int number) {
		// TODO Auto-generated constructor stub
		
		this.number = number;
	}
	
	public void primenumCheck() {
		int bul = 1; 
		for(int i = 2 ; i < number; i++) {
			if(number%i == 0) {
				bul = bul - 1;
				break;
			}
		}
		if(bul == 1) {
			System.out.println("The number is a prime number");
		}
		else {
			System.out.println("The number is not a prime number");
		}
	}

}
