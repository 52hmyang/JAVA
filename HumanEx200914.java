// Encapsulation(캡슐화)
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
	
	public void talk()		// method, 의사소통이 안되기때문에
	{
		age = 42;
		System.out.println("Human이 말한다.");
	}
	public void see()		// method
	{ System.out.println("Person이 본다."); }
}

public class HumanEx200914 {

	public static void main(String[] args) {
		
		Human hyunjin = new Human(  );	// ☆Constructor(생성자) method
		// ☆☆☆☆객체 타입 매우 중요함.
		/*hyunjin.age = 42;*/	// 다른 것도 나오는 이유는 상속을 배우고 이해할수있다
		hyunjin.setAge(42);
		System.out.printf(
				"hyunjin.age = %d\n", hyunjin.getAge());
		// hyunjin.name = "류현진";
		hyunjin.setName("류현진");
		System.out.printf(
				"hyunjin.name = %s\n", hyunjin.getName());
		
		
		// 객체지향에서 추구하는 철학과 맞지않음.
		
	}

}
