
import java.util.*;

public class MinValue {
	public static void main(String[] argv)
	{
			List<Integer> list = new LinkedList<Integer>();

			list.add(10);
			list.add(20);
			list.add(30);
			list.add(40);
			list.add(50);
			list.add(60);
			list.add(70);
			
			// printing the List
			System.out.println("List: " + list);

			// getting minimum value
			// using min() method
			int min = Collections.min(list);

			// printing the min value
			System.out.println("Minimum value is: " + min);
		}
	}
