
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class IndexOf {

	public static void main(String[] args)
	{
		List<String> items = new ArrayList<>();

		items.add("Shoes");
		items.add("Toys");
		items.add("Horse");
		items.add("Ball");
		items.add("Grapes");
		
		Collections.sort(items);

		// BinarySearch on the List
		System.out.println("The index of Horse is "+ Collections.binarySearch(items, "Horse"));

		// BinarySearch on the List
		System.out.println("The index of Grapes is "+ Collections.binarySearch(items, "Grapes"));
	}
}

