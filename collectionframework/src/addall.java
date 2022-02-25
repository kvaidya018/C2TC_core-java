
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


class addall {

public static void main(String[] args)
	{
				List<String> items = new ArrayList<>();

		items.add("tennis");
		items.add("football");
		
		Collections.addAll(items, "kabbadi", "hockey", "cricket");
		
		
		for (int i = 0; i < items.size(); i++) {
			System.out.println(items.get(i) + " ");
		}
	}
}
