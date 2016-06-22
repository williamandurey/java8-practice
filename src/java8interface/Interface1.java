package java8interface;

// Default and static method in interface
public class Interface1 {

	interface Fomula {
		double calculate(int a);

	    default double sqrt(int a) {
	        return Math.sqrt(a);
	    }
	    
	    static int positive(int a) {
	        return a > 0 ? a : 0;
	    }
	}
	
	public static void main(String[] args) {
		Fomula fomula = new Fomula() {
			@Override
			public double calculate(int a) {
				return Math.sqrt(100*a);
			}
		};
		fomula.calculate(100);
		fomula.sqrt(100);
		Fomula.positive(-1);
	}
	
}
