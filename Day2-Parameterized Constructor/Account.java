package constructor.day2;

public class Account {

	// default constructor
	int balance;

	public void showDefaultBalance() {
		int balance = 10000;
		System.out.println("Default Balance : " + balance);
	}

	Account(int balance) {
         
		this.balance = balance;
		System.out.println("User Balance : "+ balance);
	}

}
