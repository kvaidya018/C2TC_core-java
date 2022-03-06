
import java.util.*;
import java.util.stream.IntStream;

class Filter {

	public static void main(String[] args)
	{
		// Creating an IntStream
		IntStream stream = IntStream.of(3, 5, 6, 8, 9);

		// Using IntStream filter(IntPredicate predicate)
		// to get a stream consisting of the
		// elements that gives remainder 2 when
		// divided by 3
		stream.filter(num -> num % 3 == 2)
			.forEach(System.out::println);
	}
}
