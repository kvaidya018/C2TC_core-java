
import java.util.*;
import java.util.stream.IntStream;

class FindAny {

	public static void main(String[] args)
	{
		// Creating an IntStream
		IntStream stream = IntStream.of(6, 7, 8, 9);

		// Using IntStream findAny() to return
		// an OptionalInt describing some element
		// of the stream
		OptionalInt answer = stream.findAny();

		// if the stream is empty, an empty
		// OptionalInt is returned.
		if (answer.isPresent()) {
			System.out.println(answer.getAsInt());
		}
		else {
			System.out.println("no value");
		}
	}
}
