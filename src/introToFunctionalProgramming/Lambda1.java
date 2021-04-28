package introToFunctionalProgramming;

import java.util.Comparator;
import java.util.function.Consumer;

public class Lambda1 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Comparator<Employee> byName = new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				return o2.getName().compareTo(o2.getName());
			}
		};

		Comparator<Employee> byNameLambda1 = (Employee o1, Employee o2) -> {
			return o2.getName().compareTo(o2.getName());
		};

		Comparator<Employee> byNameLambda2 = (o1, o2) -> {
			return o2.getName().compareTo(o2.getName());
		};

		Comparator<Employee> byNameLambda3 = (o1, o2) -> o2.getName().compareTo(o2.getName());

		Runnable r = () -> {
			System.out.println("A compact Runnable");
		};

		Thread t1 = new Thread();

		Thread t2 = new Thread(() -> {
			System.out.println("An implicit Runnable");
		});

		Consumer<String> lengthPrinter = s -> System.out.println(s.length());
	}
}
