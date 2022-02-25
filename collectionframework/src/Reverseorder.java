
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Reverseorder {

	public static void main(String[] args)
	{
		
	List<String> items = new ArrayList<>();

		items.add("Shoes");
		items.add("Toys");

	Collections.addAll(items, "Fruits", "Bat", "Mouse");

           Collections.sort(items);

		for (int i = 0; i < items.size(); i++) {
			System.out.print(items.get(i) + " ");
			System.out.println();
		}
		
		// Sorting according to reverse ordering
		Collections.sort(items, Collections.reverseOrder());

		// Printing the reverse order
		for (int i = 0; i < items.size(); i++) {
			System.out.print(items.get(i) + " ");
		}
	}
}
