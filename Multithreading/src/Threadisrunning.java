
class MultithreadingDemo extends Thread {
	public void run()
	{
		try {
			// Displaying the thread that is running
			 System.out.println("Thread " + Thread.currentThread().getId()+ " is running");
		}
		     catch (Exception e) {
			
			 System.out.println("Exception is caught");
		}
	}
}
public class Threadisrunning {
	public static void main(String[] args)
	{
		int n = 10; // Number of threads
		for (int i = 0; i < n; i++) {
			MultithreadingDemo object= new MultithreadingDemo();
			object.start();
		}
	}
}
