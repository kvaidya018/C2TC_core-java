
import java.util.*;
import java.util.stream.IntStream;

class ForEach{
	public static void main(String[] args)
	{
		// Creating an IntStream
		IntStream stream = IntStream.of(7, 8, 9, 10,11);

		// Using IntStream.forEach
		stream.forEach(System.out::println);
	}
}
