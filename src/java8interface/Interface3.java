package java8interface;

import model.Person;

// Use :: to pass reference of constructor instead of implementing the interface
public class Interface3 {

	interface PersonFactory<P extends Person> {
	    P create(String firstName, String lastName);
	}
	
	public static void main(String[] args) {
		PersonFactory<Person> personFactory = Person::new;
		Person person = personFactory.create("William", "Yang");
	}
	
}