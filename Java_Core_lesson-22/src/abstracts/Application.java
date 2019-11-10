package abstracts;

public class Application {
	
	public static void main(String[] args) {
		
		Pet cat = () -> "ί κ³ς- Μÿσσσ-Μÿσσσ";
		Pet dog = () -> "ί οερ- Γΰσσσ-Γΰσσσ";
		Pet cow = () -> "ί κξπξβΰ- Μσσσ-Μσσσ";
		
		voice(cat.voice(), "Πθζθκ");
		voice(dog.voice(), "Αΰπρiκ");
		voice(cow.voice(), "Ασπόξνκΰ");		
	}
	
	public static void voice(String voice, String name) {
		System.out.println(voice + " " + name);
	}
}
