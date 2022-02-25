
import java.util.*;

public class Shuffle {

	public static void main(String[] args)
	{
		ArrayList<String> mylist = new ArrayList<String>();

		mylist.add("One");
		mylist.add("Two");
		mylist.add("Three");
		mylist.add("Four");
		mylist.add("Five");
		mylist.add("Six");

		// Printing list before shuffling
		System.out.println("Original List : \n" + mylist);

		// Shuffling the list
		Collections.shuffle(mylist);

		// Printing list after shuffling
		System.out.println("\nShuffled List : \n" + mylist);
	}
}
