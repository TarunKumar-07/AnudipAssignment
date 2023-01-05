package fiboRevThread;

public class Fibonacci extends Thread{

	@Override
	// creating method synchronized 
	synchronized public void run() {
		
		int i=0, j=1, n;
		System.out.println(Thread.currentThread().getName()+" : "+i+" <- Initial value");
		System.out.println(Thread.currentThread().getName()+" : "+j+" <- Initial value");
		// loop for printing first 10 Fibonacci number including 0 & 1
		for (int k = 0; k < 8; k++) {
			n = i + j;
			i = j;
			j = n;
			System.out.println(Thread.currentThread().getName()+" : "+n );
		}
	}

}
