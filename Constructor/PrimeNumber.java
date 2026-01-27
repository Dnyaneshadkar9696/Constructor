package Constructor;

import java.util.Scanner;

public class PrimeNumber {

	public PrimeNumber() {

		Scanner sd = new Scanner(System.in);
		System.out.println("8) Check Prime Number: ");
		System.out.println("Enter the number: ");
		int v = sd.nextInt();
		int bul = 1;

		for (int i = 2; i < v; i++) {

			if (v % i == 0) {
				bul = bul - 1;
				break;
			}
		}
		if(bul == 1) {
			System.out.println(v+ " is a prime number");
		}
		else {
			System.out.println(v+ " is not a prime number");
		}
		
		

	}

}
