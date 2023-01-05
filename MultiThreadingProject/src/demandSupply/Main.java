package demandSupply;

public class Main {

	public static void main(String[] args) {
		// instantiating Producer object 'p'
		Producer p = new Producer();
		
		new Thread() { // creating thread for calling demand method as a sub task
			public void run() {
				p.demand(100);
			}
		}.start();
		
		new Thread() { // creating thread for calling supply method as a sub task
			public void run() {
				p.supply(200);
			}
		}.start();
		
	}

}
