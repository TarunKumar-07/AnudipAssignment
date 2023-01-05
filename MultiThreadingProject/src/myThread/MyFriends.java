package myThread;

// creating MyFriends class as a thread by using extending Thread class
public class MyFriends extends Thread{

	@Override
	public void run() {
		// creating an string array with initialization of ten names
		String[] friendsName = {"Aman","Kartik","Naksh","Naman","Ishank","Darsh","Aashray","Hitansh","Disha","Myra"};
		
		//printing all names stored in the array
		for (String string : friendsName) {
			// Thread.currentThread().getName() used to print the thread name
			System.out.println(Thread.currentThread().getName()+" : "+string);
		}
		
	}

}
