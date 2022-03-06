
import java.util.*;
import java.util.stream.IntStream;

class IsEmpty {
	
	public static void main(String[] args) {
	
	// creating an empty IntStream, a sequence of
	// primitive int-valued elements
	IntStream stream = IntStream.empty();
	
	// Displaying an empty sequential stream
	System.out.println(stream.count());
}
}
