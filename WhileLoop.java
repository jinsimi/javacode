package exam;

public class WhileLoop {

	public static void main(String[] args) {
		// 가장 많이 사용하는 제어문
		// 1. while 문
		// 2. do/while 문
		// 3. for 문
		// 4. Enhanced for문
		
		// 반복문 진짜 필요할까?
		// 반복문을 통해 불필요한 작업을 최소화 할 수 있다.
		
		// while
		// 특정한 조건을 만족할 때 까지 계속해서 주어진 명령문을 반복실행.
		// while문은 조건이 참인동안 계속 실행하는 반복문이기 때문에 종료지점이 명확하지 않으면 무한반복이 된다.
		// while문 사용시 반드시 종료조건을 잘 달아주어야 한다.
		
		// while문의 종료조건 부여방법 1
		// while문을 컨트롤 할 변수를 선언하고 그 변수의 값을 증가시켜서 결국에는 false 조건을 만족하도록 처리한다
		int cnt = 0;
		while (true) {
			// 조건식의 결과가 참인동안 반복적으로 실행하고자 하는 명령문.
			System.out.printf("while 반복문 %d번째 실행중입니다.", cnt);
			System.out.println();
			cnt += 1;
			if (cnt > 10) {
				break;
			}
		}

	}

}
