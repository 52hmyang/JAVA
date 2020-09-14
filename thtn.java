import java.util.Scanner;

// kskk1111@gmail.com
public class thtn {
	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("소수를 판별한 숫자를 입력해주세요 : ");
      int x = sc.nextInt();
     
			for( int i = 1; i < x; i++ )
			{
				if( i / 2 == 0)
				
				
				System.out.printf("%d은(는) 소수이다\n", i);
			}
		}
	}

}
