package constructor.day2;

public class FactorsofNum {
	
	int num;
	
	public FactorsofNum(int num) {
		// TODO Auto-generated constructor stub
		
		this.num = num;
		
	}
	
	public void getFactor() {
		int sum = 1;
		
		for(int i = num ; i >=1; i--) {
			sum = sum * i;
			
		}
		System.out.println("Factorial of "+ num+ " is "+ sum);
	}

}
