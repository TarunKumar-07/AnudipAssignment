package myThread;

public class Main {

	public static void main(String[] args) {
		// instantiating MyFriends class objects
		MyFriends mf1 = new MyFriends();
		MyFriends mf2 = new MyFriends();
		MyFriends mf3 = new MyFriends();
		
		 // Setting names to each object
		mf1.setName("mf 1");
		mf2.setName("mf 2");
		mf3.setName("mf 3");
		
		// Starting the thread of each object
		mf1.start();
		mf2.start();
		mf3.start();
	}

}
