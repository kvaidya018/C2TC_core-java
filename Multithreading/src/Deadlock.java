
public class Deadlock {
	
public static void main(String[] args) {

	try {

	// Print statement
	System.out.println("Entering into Deadlock");

	// Joining the current thread
	Thread.currentThread().join();
	}

	// Catch block to handle the exceptions
	catch (InterruptedException e) {

	}
}
}
