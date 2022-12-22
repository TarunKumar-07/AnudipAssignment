package bank;
// creating class BankA extends Bank
public class BankA extends Bank {
	// instance variable with value
	int balance = 1000;
	
	@Override //overriding getBalance method
	int getBalance() {
		// returning Balance
		return balance;
	}

}
