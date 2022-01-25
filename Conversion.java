package exam;

import java.util.Scanner;

public class Conversion {

	public static void main(String[] args) {
		// 컨버전(형변환)
		// 서로 다른 자료형간 연산등의 수행을 위해 하나의 자료형으로 통일하는것
		
		// 묵시적 형 변환(자동 형 변환)
		String num = "1234";
		// int test = num;  // 묵시적 형 변환을 기대하고 바로 변수의 값을 넣어봤지만 에러상황.
		int test = Integer.parseInt(num);
		System.out.println(test);
		
		
		// 정수형 데이터를 문자형으로 바꾸기
		int n = 123;
		String a = String.valueOf(n);
		String b = Integer.toString(n);
		System.out.println(a);
		System.out.println(b);
		// 명시적 형 변환(강제 형 변환)
		
		// 실수형 추가설명 & 타입변환
		// 최근 실수타입의 변수를 사용할 때는 float 보다 double을 많이 사용
		// 이유 : 컴퓨터의 메모리 용량이 커지면서 시스템리소스 관리보다 성능에 중점을 둔다.
		float c = 123.45f;
		System.out.println(c);
		
		double d = 123.450;
		System.out.println(d);
		
		// double로의 명시적 타입 변환. 
		int test_Num_Db = 11;
		int test_Num_Db2 = 3;
		
		// 실행결과 3.0 : 이유(java에서 int형 끼리의 결과값은 언제나 int형으로 출력)
		double result2 = test_Num_Db / test_Num_Db2;
		System.out.println(result2);

		// double 타입의 변수를 선언 후 연산하면 double 형태로 출력됨.
		double test_Num_Db3 = 11;
		double test_Num_Db4 = 3;
		
		double result3 = test_Num_Db3 / test_Num_Db4;
		System.out.println(result3);


	}

}
