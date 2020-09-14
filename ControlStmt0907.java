import java.util.Scanner;

public class ControlStmt0907 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		String day = null ;
		System.out.print("요일 입력 : ") ;
		day = sc.nextLine() ;
		
		switch(day)
		{
		case "월요일" :
				System.out.println("월급 타는 날");
				break;
		case "화요일" :
		System.out.println("화가 많이 난 날");
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
			// 3의 배수들만을 출력
			// (조건) continue 명령어를 반드시 써야 한다.
			if( i % 3 != 0)
				continue;
			
			System.out.printf("i=%d\n", i);
		}
		
		// 배열(Array) : [ ]
		int val[] = new int[4] ; // 고정 크기 배열
		val[0] = 10;	val[3] = 40;
		int []digit = new int[] {40, 50, 60};	// 앞, 뒤 모두 가능함.[]
		int num[ ] = {10, 20, 30};	// 가변 크기 배열
		
		for( int k : digit)
			System.out.printf("k = %d\n", k);
		
		for(int i = 0; i < 3; ++i )
		{ // num배열 원소를 3개 출력시키자.
			System.out.printf("num[%d] = %d\n", i, num[i]);
		}
		
		int score = 0;
		double grade = 0.0;	// grade : 학점
		String cont = null;
		
		System.out.print("학점을 입력 : ");
		grade = Double.parseDouble( sc.nextLine() );
		System.out.printf("grade = %.2f\n", grade);

		System.out.print("점수를 입력 : ");
		score = Integer.parseInt( sc.nextLine() );	// Wrape class
		System.out.printf("score = %d\n", score);
		
		cont = Integer.toString(score); // 정수를 문자열로 바꿔줌.
		System.out.printf("cont = %s\n", cont);
		
		cont = Double.toString(grade) ;
		System.out.printf("cont = %s\n", cont);
	}

}
