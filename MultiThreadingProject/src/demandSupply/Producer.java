package demandSupply;

public class Producer{
	
	//  creating int type instance variable availableProduct stores number of products
	private static int availableProduct = 0; 
	
	/* creating a synchronized demand method
	 *  which check demand(n) with availableProduct
	 *  if available then process
	*/
	synchronized void demand(int n) {
		if (availableProduct < n) {
			System.out.println(">> Available product : "+availableProduct);
			System.out.println(">> Demaid : "+n);
			System.out.println("Please waiting for supply...");    
			try{
				wait(); // waiting for supply() to notify for further processing
				}catch(Exception e){
					System.out.println(e);
				}    
			availableProduct -= n;    // completing demand
			System.out.println("Processing...");
			System.out.println("Demand completed...");
			System.out.println(">> Available product : "+availableProduct);
			}     
		}
	
	/* creating a synchronized supply method
	 *  which increase supply(n) of availableProduct
	 *  then notify demand to process further
	*/
	synchronized void supply(int n) {
		System.out.println("Supplying "+n+" product...");  
		availableProduct = n; // increasing availableProduct
		System.out.println("Supply Complete.");
		System.out.println(">> Available product : "+availableProduct);
		notify(); // notifying here
	}

}
