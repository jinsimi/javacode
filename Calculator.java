package exam;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// 계산기 만들기
		// 계산기 기능 최소사항
		// 1. 최소 2개 이상의 숫자를 입력받을 것(2개도 ok)
		// 2. 입력받은 2개의 숫자의 사칙연산이 가능해야 한다.

		// 2022/01/13  Pilgeun 계산기 기능추가
		// 추가사항 : 연산별 기능정리
		//  - 수행 할 연산을 사용자가 선택하도록 처리
		
		Scanner in = new Scanner(System.in);
		// double addMinus, muxDiv;
		
		System.out.println("입력받은 두 숫자의 연산을 실행하는 프로그램입니다.");
		System.out.println();
		System.out.println("첫번째 숫자를 입력해 주세요.");
		int num1 = in.nextInt();
		System.out.println("두번째 숫자를 입력해 주세요.");
		int num2 = in.nextInt();
		System.out.println("연산하고자 하는 방법을 선택해 주세요.");
		System.out.println("1.덧셈,   2.뺄셈,   3.곱셈,   4.나눗셈");
		System.out.println("뺄셈은 음수가 출력 될 수 있습니다.");
		System.out.println("나눗셈은 큰수에서 작은수를 나누는 연산을 합니다.");
		int num3 = in.nextInt();
		
		switch(num3) {
			case 1:
				System.out.println("두 숫자의 덧셈 : " + (num1+num2));
				break;
			case 2:
				// 계산기 기능개조 1
				// 만약 num1가 num2 보다 작으면 num2-num1로 진행하세요
				System.out.println("두 숫자의 뺄셈 : " + (num1-num2));
				break;
			case 3:
				System.out.println("두 숫자의 곱셈 : " + (num1*num2));
				break;
			case 4:
				// 계산기 기능개조 2
				// 만약 num1가 num2 보다 작으면 num2/num1로 진행하세요
				System.out.println("두 숫자의 나눗셈 : " + ((num1>num2) ? num1/num2 : num2/num1 ));
				break;
			default:
				System.out.println("연산방법의 선택이 틀렸습니다.");
				System.out.println("1.덧셈,   2.뺄셈,   3.곱셈,   4.나눗셈 중에서 선택해 주세요.");
				System.out.println("계산기 동작없이 프로그램 종료합니다.");
		}
	}

}
