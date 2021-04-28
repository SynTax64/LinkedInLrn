package introToFunctionalProgramming;

import java.util.Comparator;

public class Interfaces {
	public static void main(String[] args) {
		Employee david = new Employee("David", 3000), joanne = new Employee("Joanne", 3200);
		Comparator<Employee> byName = new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {

				return o1.getName().compareTo(o2.getName());
			}
		};
		System.out.println("By Name: ");
		System.out.println(byName.compare(david, joanne));

		try {
			System.out.println(byName.compare(david, null));
		} catch (NullPointerException e) {
			System.out.println("NullPointerException");
		}

		Comparator<Employee> byNameThenNull = Comparator.nullsLast(byName);

		System.out.println("Then null: ");
		System.out.println(byNameThenNull.compare(david, joanne));
		System.out.println(byNameThenNull.compare(david, null));

		Comparator<Employee> nullThenByDecreasingName = byNameThenNull.reversed();

		System.out.println("Reversed: ");
		System.out.println(byNameThenNull.compare(david, joanne));
		System.out.println(byNameThenNull.compare(david, null));
	}
}
