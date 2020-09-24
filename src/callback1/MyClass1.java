package callback1;

public class MyClass1 {
	
	public static void main(String[] args) {
		myMethod(new GenericMethod() {
			@Override
			public String call() {
				return "One";
			}
		});
		
		myMethod(new GenericMethod() {
			@Override
			public String call() {
				return "Two";
			}
		});
		
		myMethod(() -> { return "Three"; });
	}
	
	public static void myMethod(GenericMethod g) {
		System.out.println("This method called " + g.call());
	}
	
	public interface GenericMethod {
		public String call();
	}

}
