// Encapsulation(ĸ��ȭ)
class Human
{
	private int age = 0;	
	// private : Access Specifier or Modifier
	private String name = null;
	
	public void setName(String pname)
	{ name = pname; }
	public String getName()
	{ return name; }
	
	public int getAge()
	{ return age; }
	public void setAge(int page)
	{ age = page ; }
	
	public void talk()		// method, �ǻ������ �ȵǱ⶧����
	{
		age = 42;
		System.out.println("Human�� ���Ѵ�.");
	}
	public void see()		// method
	{ System.out.println("Person�� ����."); }
}

public class HumanEx200914 {

	public static void main(String[] args) {
		
		Human hyunjin = new Human(  );	// ��Constructor(������) method
		// �١١١ٰ�ü Ÿ�� �ſ� �߿���.
		/*hyunjin.age = 42;*/	// �ٸ� �͵� ������ ������ ����� ���� �����Ҽ��ִ�
		hyunjin.setAge(42);
		System.out.printf(
				"hyunjin.age = %d\n", hyunjin.getAge());
		// hyunjin.name = "������";
		hyunjin.setName("������");
		System.out.printf(
				"hyunjin.name = %s\n", hyunjin.getName());
		
		
		// ��ü���⿡�� �߱��ϴ� ö�а� ��������.
		
	}

}
