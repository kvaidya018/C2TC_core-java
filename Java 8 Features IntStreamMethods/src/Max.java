// Java code for IntStream max()
import java.util.*;
import java.util.stream.IntStream;

class Max {

	public static void main(String[] args)
	{
		IntStream stream = IntStream.of(-9, -18, 1000, 8, 7, 14, 3);

		// OptionalInt is a container object
		// which may or may not contain a
		// int value.
		OptionalInt obj = stream.max();

		// If a value is present, isPresent() will
		// return true and getAsInt() will
		// return the value
		if (obj.isPresent()) {
			System.out.println(obj.getAsInt());
		}
		else {
			System.out.println("-1 ");
		}
	}
}
