
class MultithreadingDemo implements Runnable {
	public void run()
	{
		
	}
}

class Runnableinterface {
	public static void main(String[] args)
	{
		int n = 8; // Number of threads
		for (int i = 0; i < n; i++) {
			Thread object= new Thread(new MultithreadingDemo());
			object.start();
		}
	}
}
