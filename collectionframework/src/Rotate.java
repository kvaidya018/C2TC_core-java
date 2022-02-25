
import java.util.*;

public class Rotate
{
	public static void main(String[] args)
	{
		List<String> mylist = new ArrayList<String>();
		mylist.add("One");
		mylist.add("Two");
		mylist.add("Three");
		mylist.add("Four");

		System.out.println("Original List : " + mylist);

		// Here we are using rotate() method
		// to rotate the element by distance 2
		Collections.rotate(mylist, 2);

		System.out.println("Rotated List: " + mylist);
	}
}
