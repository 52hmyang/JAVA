
public class DataShow0831 {

	public static void main(String[] args) {
		int a = 5, b = 7 ;
		char ch = 'A' ;
		char str = 65;
		System.out.print("a=" + a + ", b=" + b) ;
		System.out.printf("a=%d\n", a);
		System.out.println("ch =" + ch);
		System.out.println("str=" + str);
		System.out.printf("str=%d\n", (int)str);
		System.out.printf("str문자=%c\n", str);
		
		double dv = 3.14;
		float fv = 1.27f;
		System.out.printf("fv=%.2f\n", fv);
		System.out.printf("dv=%.2f\n", dv);
		
		final double PI = 3.14;
		//PI = 6.28;//ERROR
		
		byte c = 3;
		int price = 10;
		//price = c;
		c = (byte)price; //():casting연산자
	}

}
