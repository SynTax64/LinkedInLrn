package AdvancedProgramming.Generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsExample {

	@SuppressWarnings({ "rawtypes" })
	public static void main(String[] args) {
		List names1 = new ArrayList<>();
		names1.add("David");
		String name1 = (String) names1.get(0);

		System.out.println("First name: " + name1);

		List<String> names2 = new ArrayList<>();
		names2.add("David");
		String name2 = names2.get(0);

		System.out.println("First name: " + name2);
	}
}
