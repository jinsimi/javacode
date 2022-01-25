package exam;

public class Operand {

	public static void main(String[] args) {
		// 연산자와 항
		// 항(operand) : 연산에 사용되는 값
		// 연산자(operator) : 항을 이용하여 연산하는 기호
		// 연산자의 종류 : 산술연산자, 대입연산자, 증감연산자, 비교연산자, 논리연산자, 삼항연산자, instanceof 연산자
		// 1. 산술연산자(사칙연산)
		// 2. 대입연산자 - 변수에 값을 대입할 때 사용 ( =, +=, -=, *=, /=, %=, &=, |=, ^= )
		int a=1, b=2;
		a += b;
		System.out.println(a);
		System.out.println(b);
		
		int c = 40, d = 50;
		int result1 = c -= d;
		int result2 = c =- d;
		System.out.println(result1);
		System.out.println(result2);
		// 3. 증감연산자
		// 4. 비교연산자
		//  a==b(a와 b가 같으면 true), a!=b(a와 b가 다르면 true), a>b(a가 b를 초과하면 true), a>=b(a가 b 이상이면 true), a<b(a가 b 미만이면 true), a<=b(a가 b 이하이면 true)
		int num1 = 10;
		int num2 = 20;
		System.out.println(num1 <= num2);
		System.out.println();
		
		// 5. 논리연산자 - 주어진 논리식을 판단해 참과 거짓을 결정하는 연산자. 주로 조건문에서 많이 활용된다.
		int test1 = 30, test2=40;
		boolean result10, result11;
		// AND 조건 예시
		result10 = (test1 > 20) && (test2 > 50);
		// OR 조건 예시
		result11 = (test1 > 20) || (test2 > 50);
		System.out.println(result10);
		System.out.println(result11);
		System.out.println();
		// AND OR 조건 예시
		// 1. 회원가입을 받는데 나이가 20살 이상이고 학력이 대졸인 사람. (AND)
		// 1. 회원가입을 받는데 나이가 20살 이상이거나 학력이 대졸인 사람. (OR)
		// 2. 쌀을 사러 마트에 왔는데 쌀이 이천에서 만들어졌고 가격이 6만원 이하인 쌀. (AND)
		// 2. 쌀을 사러 마트에 왔는데 쌀이 이천에서 만들어졌거나 가격이 6만원 이하인 쌀. (OR)
		// NOT : 결과가 참이면 거짓을, 거짓이면 참을 출력
		// ! (not), && (and), || (or)
		
		// 6. 삼항연산자
		// 피연산자가 3개인 조건연산자.  ex)  조건식? 리턴값1:리턴값2
		// ? 앞의 조건식에 따라 결과값이 참이면 리턴값 1번 출력, 결과값이 거짓이면 리턴값 2번 출력
		int threeOper1 = 15, threeOper2 = 20;
		String result20;
		
		// 조건식? 리턴값1:리턴값2
		result20 = (threeOper1-threeOper2)>0 ? "양수":"음수";
		System.out.println(result20);
		
		// 문제. 

	}

}
