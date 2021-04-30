package lambdaExpressions;

public class TypeInference {
	public static <T> T getLast(T[] array) {
		return array[0];

	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		String[] strarray = { "one", "three", "two", "four" };

		System.out.println(getLast(strarray));
	}
}
