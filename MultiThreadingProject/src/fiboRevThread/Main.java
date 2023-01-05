package fiboRevThread;

public class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fibonacci fibo = new Fibonacci();
		Reverse rev = new Reverse();
		
		fibo.setName("Fibonacci");
		rev.setName("Reverse");
		
		fibo.start();
		rev.start();

	}

}
