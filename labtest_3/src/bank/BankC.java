package bank;
//creating class BankC extends Bank
public class BankC extends Bank{
	// instance variable with value
	int balance = 2000;
	
	@Override //overriding getBalance method
	int getBalance() {
		// returning Balance
		return balance;
	}

}
