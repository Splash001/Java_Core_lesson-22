package abstracts;

public class Application {
	
	public static void main(String[] args) {
		
		Pet cat = () -> "� ��- �����-�����";
		Pet dog = () -> "� ���- �����-�����";
		Pet cow = () -> "� ������- ����-����";
		
		voice(cat.voice(), "�����");
		voice(dog.voice(), "����i�");
		voice(cow.voice(), "��������");		
	}
	
	public static void voice(String voice, String name) {
		System.out.println(voice + " " + name);
	}
}
