package Constructor;
import java.util.Scanner;

public class ConstructorEvencheck {
	
	public ConstructorEvencheck() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("2) Enter the number to check even or odd");
		int a = sc.nextInt();
		
		if(a%2 == 0) {
			System.out.println("->Even number");
		}
		else {
			System.out.println("->Odd number");
		}
	
	}

}
