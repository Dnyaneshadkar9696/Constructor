package constructor.day2;

public class Hcf {

	int a;
	int b;

	public Hcf(int a, int b) {
		// TODO Auto-generated constructor stub

		this.a = a;
		this.b = b;
	}
	
	public void findHcf() {
		int hcf= 0;
		if(a > b) {
			
			for(int i = 2; i < a; i++) {
				if(a%i == 0 && b%i == 0) {
					hcf = i;
					
				}
			}
			
			
		}
		else {
			for(int j = 2; j < b; j++) {
				if(b%j == 0 && a%j == 0) {
					hcf = j; 
					
				}
			}
		}
		System.out.println("Hcf : "+ hcf);
	}

}
