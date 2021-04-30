package AdvancedProgramming.Generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericsMethods {
	public static Character[] charArray = { 'a', 'h', 'o', 'v', 'c', 'e', 'q', 's' };
	public static Integer[] intArray = { 102, 203, 101, 203, 302, 208, 301, 402 };
	public static Boolean[] boolArray = { false, true, false, false, false, true, false, true };

	public static <T> List arrayToList(T[] array, List<T> list) {
		for (T object : array) {
			list.add(object);
		}
		return list;
	}

	@SuppressWarnings({ "unchecked", "unused" })
	public static void main(String[] args) {
		List<Character> charList = arrayToList(charArray, new ArrayList<>());
		List<Boolean> booleanList = arrayToList(boolArray, new ArrayList<>());
		List<Integer> integerList = arrayToList(intArray, new ArrayList<>());
		System.out.println(Arrays.toString(charArray));
		System.out.println(Arrays.toString(boolArray));
		System.out.println(Arrays.toString(intArray));
		System.out.println(booleanList.get(0));
	}
}
