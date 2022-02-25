
import java.util.*;

public class Swapping {
	public static void main(String[] argv)
		throws Exception
	{	
			List<String> vector = new ArrayList<String>();

			
			vector.add("A");
			vector.add("B");
			vector.add("C");
			vector.add("D");
			vector.add("E");

			// printing the vector before swap
			System.out.println("Before swap: " + vector);

			// swap the elements
			System.out.println("\nSwapping 0th and 4th element.");
			Collections.swap(vector, 1, 4);

			// printing the vector after swap
			System.out.println("\nAfter swap: " + vector);
		}

	}
