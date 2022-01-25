package exam;

import java.util.Scanner;

public class Input {

	public static void main(String[] args) {
		// 지금까지 데이터를 사용하려면 ? 변수로 입력받아 해당변수의 내용에서 처리.
		// Scanner 클래스를 이용해서 프로그램 사용자로부터 데이터를 입력받는것도 가능하다.
		Scanner in = new Scanner(System.in);
		
		// String test = in.next();
		// String test2 = in.nextLine();
		
		// System.out.println(test);
		// System.out.println(test2);
		
		// 숫자입력
		System.out.println("두 수의 합을 계산하는 프로그램입니다.");
		System.out.println("첫번째 숫자를 입력해 주세요.");
		int num = in.nextInt();
		System.out.println("두번째 숫자를 입력해 주세요.");
		int num2 = in.nextInt();
		System.out.println("입력받은 숫자 : " + (num+num2));
		
		// 숫자 두개를 입력받아서 더하기 결과?  묵시적 형변환에 대한 이해 필요.
		// 문자열과 숫자의 합은 문자열.  문자열처리 이전에 숫자끼리 먼저 합을 구하고 나중에 문자열과 합한다.
		
		// Scanner 메서드 정리
		// boolean : nextBoolean()
		// byte : nextByte()
		// short : nextShort()
		// int nextInt()
		// long : nextLong()
		// float : nextFloat()
		// double : nextDouble()
		// String : nextLine()  _ nextLine()은 개행을 기준으로 처리한다. 
		// String : next()  __ next()는 공백전까지만 처리한다. 공백이 포함되면 뒷부분은 버림.
		

	}

}
