package java8lambda;

import java.util.Comparator;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

import model.Person;

// Common standard functions
public class Lambda3 {
	
	public static void main(String[] args) {
		Predicate<String> predicate = (s) -> s.length()>0;
		predicate.test("test");
		predicate.negate().test("test");
		
		Function<String, Integer> toInteger = Integer::valueOf;
		Function<String, String> backToString = toInteger.andThen(String::valueOf);
		
		Supplier<Person> personSupplier = Person::new;
		personSupplier.get();
		
		Consumer<Person> personConsumer = (p) -> System.out.println(p.firstName + " " + p.lastName);
		personConsumer.accept(personSupplier.get());	
		
		Comparator<Person> comparator = (p1, p2) -> p1.firstName.compareTo(p2.firstName);
		Person person1 = new Person("William", "Yang");
		Person person2 = new Person("Urey", "Fang");
		comparator.compare(person1, person2);
		comparator.reversed().compare(person1, person2);
		
		Optional<String> optional = Optional.of("");
		optional.isPresent();
		optional.get();
		optional.orElse("other");
		optional.ifPresent((s) -> System.out.println(s.charAt(0)));
	}
	
}
