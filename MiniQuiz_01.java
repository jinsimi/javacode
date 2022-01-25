package exam;

import java.util.Scanner;

public class MiniQuiz_01 {

	public static void main(String[] args) {
		// 1. 
		String name = "김개발";
		String department = "개발부";
		String position = "대리";
		int sal = 3000000;
		
		System.out.println("이름 : " + name);
		System.out.printf("부서 : " + department + "\n");
		System.out.print("직위 : " + position + "\n" + "급여 : " + sal +"원");
		
		// 2.
		Scanner in = new Scanner(System.in);
		System.out.println("입력받은 두 숫자의 크기를 비교하는 프로그램입니다.");
		System.out.println();
		System.out.println("첫번째 숫자를 입력해 주세요.");
		int num1 = in.nextInt();
		System.out.println("두번째 숫자를 입력해 주세요.");
		int num2 = in.nextInt();
		System.out.printf("입력받은 두 숫자 중 큰 수는 %d 입니다.", (num1>num2 ? num1:num2));
		
		// 3.
		


	}

}
