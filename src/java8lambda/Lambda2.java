package java8lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// Lambda scope
public class Lambda2 {

	static int outerStaticNum;
    int outerNum;
	
	@FunctionalInterface
	interface Converter<F, T> {
		T convert(F from);
	}
	
	public static void main(String[] args) {
		// we can access final local variables from outer scope of lambda expression
		// the final keyword can be omitted but the variable must be implicitly final
		// num can not be re-assigned
		final int num = 1;
		Converter<Integer, String> stringConverter =(from) -> String.valueOf(from + num);
		stringConverter.convert(2);
		new Lambda2().testScopes();
	}
	
	
	void testScopes() {
		// can access outer scope variable
        Converter<Integer, String> stringConverter1 = (from) -> {
            outerNum = 23;
            return String.valueOf(from);
        };
        
        // can access outer static variable
        Converter<Integer, String> stringConverter2 = (from) -> {
            outerStaticNum = 72;
            return String.valueOf(from);
        };
    }
	
}
