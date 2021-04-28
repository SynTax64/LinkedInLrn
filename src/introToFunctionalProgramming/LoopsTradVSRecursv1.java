package introToFunctionalProgramming;

import java.util.Arrays;
import java.util.Random;

public class LoopsTradVSRecursv1 {
	public static int arraySum(int[] array) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}

		return sum;
	}

	public static int arraySum2(final int[] array, final int start) {
		if (start >= array.length) {
			return 0;
		}
		return array[start] + arraySum2(array, start + 1);
	}

	public static int[] fillArray(int sizeOfArray) {
		int[] array = new int[sizeOfArray];
		Random rnd = new Random();
		for (int i = 0; i < array.length; i++) {
			array[i] = rnd.nextInt(100);
		}

		return array;
	}

	public static void main(String[] args) {
		int[] generatedArray = fillArray(25);
		System.out.println(Arrays.toString(generatedArray));
		System.out.println(arraySum(generatedArray));
		System.out.println(arraySum2(generatedArray, 0));

	}
}
