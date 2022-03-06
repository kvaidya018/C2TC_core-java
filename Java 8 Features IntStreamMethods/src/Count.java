import java.util.*;
import java.util.stream.IntStream;

class Count {

	public static void main(String[] args)
	{
		IntStream stream = IntStream.range( 50, 100);

		// storing the count of elements
		// in a variable named total
		long total = stream.count();

		// displaying the total number of elements
		System.out.println(total);
	}
}
