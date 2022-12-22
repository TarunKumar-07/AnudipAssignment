package bank;
//creating class BankB extends Bank
public class BankB extends Bank {
	// instance variable with value
	int balance = 1500;
	
	@Override //overriding getBalance method
	int getBalance() {
		// returning Balance
		return balance;
	}

}
