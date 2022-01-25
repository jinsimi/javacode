package exam;

public class DoWhileLoop {

	public static void main(String[] args) {
		// do/while은 루프를 먼저 실행하고 조건식을 검사
		
		// do/while 문법
		// do{
		//		조건식 결과가 참인동안 반복적으로 실행하는 명령문;
		//	} while (조건식);
		
		int a = 0;
		do {
			System.out.println("나는 멈추지 않는 8톤 트럭" + a);
			a++;
		} while ( a<10 );

	}

}
