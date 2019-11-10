package waterworld;

public class Application {
	
	public static void main(String[] args) {
		
		Printable eat = () -> System.out.println("I eat insects");
		Printable sleep = () -> System.out.println("I sleep alot");
		Printable swim = () -> System.out.println("I'm the best swimmer around");
		Printable walk = () -> System.out.println("I can't walk at all");
		
		eat.print();
		sleep.print();
		swim.print();
		walk.print();		
	}

}
