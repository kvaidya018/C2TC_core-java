
import java.util.*;
import java.util.stream.IntStream;

class Reduce {

	public static void main(String[] args)
	{
		IntStream stream = IntStream.range(0, 10);

		// Using IntStream reduce
		// (int identity, IntBinaryOperator op)
		int answer = stream.reduce(0, (num1, num2)
										-> (num1 + num2) - 2 * (num1 - num2));

		// Displaying the result
		System.out.println(answer);
	}
}
