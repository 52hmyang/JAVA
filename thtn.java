import java.util.Scanner;

// kskk1111@gmail.com
public class thtn {
	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("�Ҽ��� �Ǻ��� ���ڸ� �Է����ּ��� : ");
      int x = sc.nextInt();
     
			for( int i = 1; i < x; i++ )
			{
				if( i / 2 == 0)
				
				
				System.out.printf("%d��(��) �Ҽ��̴�\n", i);
			}
		}
	}

}
