
import java.util.*;

public class FillMethod {
	public static void main(String[] argv) throws Exception
	{
		List<String> arrlist = new ArrayList<String>();
	
arrlist.add("A");
	arrlist.add("B");
		arrlist.add("C");

		System.out.println("List elements before fill: "+ arrlist);

		// fill the list
		Collections.fill(arrlist, "TAJMAHAL");

		System.out.println("\nList elements after fill: "+ arrlist);
	}
}
