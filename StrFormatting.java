package exam;

public class StrFormatting {

	public static void main(String[] args) {
		// StrFormatting
		//문자열 포메팅 : 문자열 안에 어떠한 값을 삽입하는 방법
		int money = 15000;
		String day = "tomorrow";
		System.out.println(String.format("i need %d money %s", money, day));
		System.out.println(String.format("i need %s money %d", day, money));
		
		// 문자열 포맷 코드
		// %s : 문자열
		// %c : char
		// %d : 정수
		// %f : 부동소수점
		// %o : 8진수
		// %x : 16진수
		// %% : 문자 % 그 자체
		
		// 문제
		// 다음의 문장을 출력해 보세요.
		// 출력할 문장 : error clean 95%
		// 조건 : 문자는 문자대로, 숫자는 숫자대로 타입 맞춰야 함.
		
		int percent = 95;
		System.out.println(String.format("error clean %d%%", percent));
		
		// 포메팅 코드와 숫자사용
		// 포멧코드 + 숫자의 사용으로 유연한 사용가능.
		// 문자열 삽입 후 공백처리
		System.out.println(String.format("%6s",  "test"));
		System.out.println(String.format("%10s",  "test"));
		// 포멧코드안의 숫자의 의미는 전체길이를 의미함. 우측정렬 후 나머지는 빈공백으로 채운다.
		
		System.out.println(String.format("%-10s, friend~", "hi"));
		// 만약 숫자가 음수라면 대입된 값은 왼쪽으로 정렬 후 나머지는 공백으로 처리한다.
		
		// format 메서드 대신 아래와 같은 형태로도 사용가능
		// 차이점은 printf는 결과값 출력만 진행. format 메서드는 결과값 반환(리턴)
		System.out.printf("%-10s, friend~", "hi");

	}

}
