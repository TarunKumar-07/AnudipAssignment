package bank;

public class BankMain {

	public static void main(String[] args) {
		// instantiating object of class BankA, BankB, BankC
		BankA a = new BankA();
		BankB b = new BankB();
		BankC c = new BankC();
		
		// calling getBalance() method of all classes to print deposit of Boy 
		System.out.println("List of deposited money by boy in each bank:");
		System.out.println("Bank A : Rs "+a.getBalance());
		System.out.println("Bank B : Rs "+b.getBalance());
		System.out.println("Bank C : Rs "+c.getBalance());
		System.out.println("\n Total Amount : "+(a.getBalance()+b.getBalance()+c.getBalance()));

	}

}
