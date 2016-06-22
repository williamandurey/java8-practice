package java8lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// Basic lambda usage
public class Lambda1 {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("william", "urey", "laomi", "xiaomi");
		
		Collections.sort(names, new Comparator<String>() {
			@Override
			public int compare(String a, String b) {
				return b.compareTo(a);
			}
		});
		
		Collections.sort(names, (String a, String b) -> {
			return b.compareTo(a);
		});
		
		Collections.sort(names, (String a, String b) -> b.compareTo(a));
		
		Collections.sort(names, (a,b) -> b.compareTo(a));
	} 
	
}
