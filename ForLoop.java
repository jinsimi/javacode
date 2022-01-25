package exam;

public class ForLoop {

	public static void main(String[] args) {
		// for문
		// 반복문의 일종, while문과 다르게 반복문 시작시 조건을 세부적으로 지정 후 진행하는 문법
		// for(초기식; 조건식; 증감식) { 실행문 ; }
//		int tree = 0;
//		for(int i=1; i<101; i++) {
//			System.out.println("나무를 도끼로 "+ i +"번 찍었습니다.");
//		}
		
		// while VS do-while VS for  각각 어느때에 쓰면 유리한가?
		// while : 조건 결과가 참/거짓 이거나, 사용자가 원하는 상황에서만 프로그램을 종료할 때
		// do-while : 한번은 실행 후 조건 결과가 참/거짓 이거나, 사용자가 원하는 상황에서만 프로그램을 종료할 때
		// for : 특정수의 범위, 횟수와 관련하여 반복될 때 사용, 배열과 궁합이 좋음.
		
		// for문의 초기식, 조건식, 증감식은 생략이 가능.
		// 나무에 스트레스를 푸는 벌목꾼.
//		int j = 0;
//		for(;;) {
//			System.out.println("나무를 도끼로 "+ j+"번 찍었습니다.");
//			j++;
//		}
		// for문 사용예시2 - 1~10까지 더하되 짝수는 제외
		int sum = 0;
//		for(int i=1; i<10; i+=2) {
//			sum += i;
//		}
		for(int i=1; i<10; i++) {
			if(i%2 == 0) {
				// continue : 해당 키워드를 만날 시 반복문의 
				continue;
				
			}
			sum += i;
		}
		System.out.println("합산 결과는 : " + sum);
		System.out.println();
		
		// for문의 응용
		// 구구단 출력하기
		System.out.printf("\t\t\t\t\t\t  구구단 출력 입니다. \n");
		System.out.println("2  단 \t\t 3  단 \t\t 4  단 \t\t 5  단 \t\t 6  단 \t\t 7  단 \t\t 8  단 \t\t 9  단\n");
		for(int i=1; i<10; i++) {
			for (int dan=2; dan<10; dan++) {
				System.out.printf("%d * %d = %d \t", dan, i, dan*i);
			} System.out.println();
		}
	}
}
