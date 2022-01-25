package exam;

public class Variable {

	public static void main(String[] args) {
		// 변수 : 변하는 수.
		// 변수의 이름은 개발자가 마음대로 지을 수 있음.
		// but 규칙은 있음.
		
		// 변수명 선언의 규칙
		// 1. 숫자로 시작하면 안된다.
		// 2. $,_ 이외의 특수문자는 사용불가
		// 3. 키워드는 변수명으로 사용할 수 없음.  -- 예시) new, if, case, char, catch, for, try, this, import, throw, goto, do, while
		
		// 변수의 타입과 변수명을 작성
		// int myVariable = 10;
		// String myTest = "출력테스트";
		// System.out.println(myVariable);
		// System.out.println(myTest);
		
		// 정수형 연산(숫자연산)
		int a = 30;
		int b = 15;
		int c = 9;
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		
		System.out.println(a % c);
		System.out.println(b % c);
		
		// 증감연산
		// 기호를 이용해서 값을 증가시키거나 감소 시킬 수 있는 연산.
		int test1 = 'A';
		int test2 = 5;
		
		// 증감연산자는 부호의 위치에 따라 계산되는 순서가 다르다.
		
		//test1 ++;  //값이 참조된 후에 증가
		//test2 --;
		System.out.println(test1);  
		System.out.println(++test1);  // 값이 참조되기 전 증가
		System.out.println(--test2);
		System.out.println(test1);
		System.out.println(test2);

		
		// 자바의 자료형
		// 정수형 
		// 1. int : 기본정수형 / 4byte / -2^31 ~ 2^31-1
		// 2. byte : 1byte(8 bit) / -2^7 ~ 2^7-1 / -128 ~ 127
		// 3. short : 2byte(16 bit) / -2^15 ~ 2^15-1 / -32768 ~ 32767
		// 4. long : 8byte(64 bit) / -2^63 ~ 2^63-1
		
		// 문자열
		// 1. String
		// 2. StringBuffer
		
		// 문자형
		// 1. char : 2byte
		
		// 정수형
		// 1. float : 4byte
		// 2. double : 8byte
		
		// 논리형
		// 1. boolean : True/False
		

	}

}
