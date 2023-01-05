package fiboRevThread;

public class Reverse extends Thread{

	@Override
	// creating method synchronized 
	synchronized public void run() {
		// loop for printing number from 1 to 10 in reverse
		for (int i = 10; i >0; i--) {
			System.out.println(Thread.currentThread().getName()+" : "+i);
		}
	}

}
