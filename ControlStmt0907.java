import java.util.Scanner;

public class ControlStmt0907 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		String day = null ;
		System.out.print("���� �Է� : ") ;
		day = sc.nextLine() ;
		
		switch(day)
		{
		case "������" :
				System.out.println("���� Ÿ�� ��");
				break;
		case "ȭ����" :
		System.out.println("ȭ�� ���� �� ��");
		break;
		}
		
		for(int i = 0; i <= 10; ++i)
		{
			if( i == 6)
				break;
			
			System.out.printf("i=%d\n", i);
		}
		
		for(int i = 0; i <= 10; ++i)
		{
			// 3�� ����鸸�� ���
			// (����) continue ��ɾ �ݵ�� ��� �Ѵ�.
			if( i % 3 != 0)
				continue;
			
			System.out.printf("i=%d\n", i);
		}
		
		// �迭(Array) : [ ]
		int val[] = new int[4] ; // ���� ũ�� �迭
		val[0] = 10;	val[3] = 40;
		int []digit = new int[] {40, 50, 60};	// ��, �� ��� ������.[]
		int num[ ] = {10, 20, 30};	// ���� ũ�� �迭
		
		for( int k : digit)
			System.out.printf("k = %d\n", k);
		
		for(int i = 0; i < 3; ++i )
		{ // num�迭 ���Ҹ� 3�� ��½�Ű��.
			System.out.printf("num[%d] = %d\n", i, num[i]);
		}
		
		int score = 0;
		double grade = 0.0;	// grade : ����
		String cont = null;
		
		System.out.print("������ �Է� : ");
		grade = Double.parseDouble( sc.nextLine() );
		System.out.printf("grade = %.2f\n", grade);

		System.out.print("������ �Է� : ");
		score = Integer.parseInt( sc.nextLine() );	// Wrape class
		System.out.printf("score = %d\n", score);
		
		cont = Integer.toString(score); // ������ ���ڿ��� �ٲ���.
		System.out.printf("cont = %s\n", cont);
		
		cont = Double.toString(grade) ;
		System.out.printf("cont = %s\n", cont);
	}

}
