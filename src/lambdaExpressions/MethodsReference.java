package lambdaExpressions;

import java.util.Comparator;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

import introToFunctionalProgramming.Employee;

public class MethodsReference {

	public static <T> void printAll(T[] array, Function<T, String> toStringFun) {
		int i = 0;
		for (T t : array) {
			System.out.println(i++ + ":\t" + toStringFun.apply(t));
		}
	}

	public static void main(String[] args) {

		Supplier<Thread> s1 = Thread::currentThread;

		ThreadSupplier ts = Thread::currentThread;

		Employee denis = new Employee("Denis", 2300);
		Integer i = denis.getSalary();
		Supplier<Integer> s2 = denis::getSalary;
		System.out.println(s2.get());

		Consumer<String> c1 = System.out::println;

		Function<Employee, Integer> f1 = Employee::getSalary;
		Integer denisSalary = f1.apply(denis);

		Comparator<Employee> byName = Comparator.comparing(Employee::getSalary);
		main2();

	}

	public static void main2() {
		Employee[] dept = new Employee[5];
		dept[0] = new Employee("David", 3000);
		dept[1] = new Employee("Joanne", 3200);
		dept[2] = new Employee("Nika", 3600);
		dept[3] = new Employee("Bran", 4000);
		dept[4] = new Employee("Eva", 5000);

		printAll(dept, Employee::getName);
		System.out.println();

		printAll(dept, emp -> "" + emp.getSalary());
	}
}

interface ThreadSupplier {
	Thread giveMeThread();
}
