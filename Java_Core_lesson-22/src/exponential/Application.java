package exponential;

public class Application {
	public static void main(String[] args) {
		
		Printable result = message -> System.out.println(message);
		
		result.print("Min Double - " +  Double.MIN_VALUE);
		result.print("Max Double - " +  Double.MAX_VALUE);
		result.print("Min Float - " +  Float.MIN_VALUE);
		result.print("Max Float - " +  Float.MAX_VALUE);
		
	}
}
