package java8interface;

// Functional interface
public class Interface2 {

	@FunctionalInterface
	interface Converter<F, T> {
		T convert(F from);
	}
	
	public static void main(String[] args) {
		Converter<String, Integer> converter = (from) -> Integer.valueOf(from);
		String str = "123";
		Integer converted = converter.convert(str);
		System.out.println(converted);
	}
	
}
