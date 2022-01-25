package exam;

import java.util.Scanner;

public class Choice {

	public static void main(String[] args) {
		// 제어문
		
		// 조건문 : 주어진 조건식의 결과에 따라 별도의 명령을 수행하도록 하는 제어문
		// if~ else / switch
		
		// if문
		// if(조건식) {
		//	조건이 참일때 실행하는 코드.
		// }
		
		// 조건 생성.
		// 새벽까지 술을 마시고 택시를 타고 집에 가려하는데
		int money = 15000;
		// 잔액이 3만원 이상이면 택시를 타고 그렇지 않으면 걸어간다.
		if (money>=30000) {
			System.out.println("택시를 타고 집에 가는중 !");
		} else {
			System.out.println("돈 없어서 걸어 가는중.");
		}
		
		// 문제
		// 재산에 따라 세금을 부여하는 프로그램을 작성하세요.
		// 1. 재산이 100만원 이상이면 세금을 10만원을 납부.
		// 2. 그렇지 않으면 세금을 2만원 납부.
		// 3. 납부는 메시지로만 처리
		
		int tax;  // 재산 내용 저장
		// Scanner in = new Scanner(System.in);
		// double addMinus, muxDiv;
		
		// System.out.println("재산에 따라 납부하는 세금의 액수를 출력합니다..");
		// System.out.println();
		// System.out.println("재산이 얼마인지 입력해 주세요.");
		// int havi = in.nextInt();
		
		// if (havi >= 1000000) {
		//	tax = 100000;
		// } else {
		//	tax = 20000;
		// }
		// System.out.println(String.format("납부하실 세금은 %d원 입니다.", tax));
		// System.out.println();
		
		// 조건을 문자로 처리
		String stu1 = "고등학생";
		if(stu1 == "고등학생") {
			System.out.println("청담고등학교로 가고 있습니다.");
		}
		// 여러개의 조건을 가지는 조건문(else if)
		// 나이별 요금계산 프로그램
		// 코드에서 필요한 것들.
		// 정수형 변수(나이, 요금)
		System.out.println("환영합니다. 우리 부페식당입니다.");
		System.out.println("나이를 입력해 주세요.");
		int age, charge;
		Scanner sc = new Scanner(System.in);
		age = sc.nextInt();
		System.out.println(age);
		
		// 조건
		// 1. 0~6세 요금을 받지 않는다.
		if(age<=6) {
			System.out.println("6세까지는 요금을 받지 않습니다");
		} // 조건문 종료 블록
		// 2. 7~12세는 미취학 아동으로 분류. 요금은 5000원을 받는다
		else if(age<=12) {
			charge = 5000;
			System.out.println(String.format("미취학 아동입니다. 요금은 %d원 입니다.", charge));
		}  // 미취학아동 조건 종료 블록
		// 3. 13~19세는 청소년으로 분류. 요금은 10000원을 받는다
		else if(age<=19) {
			charge = 10000;
			System.out.println(String.format("청소년 입니다. 요금은 %d원 입니다.", charge));
		} // 청소년 조건 종료블록
		
		// 4. 20세부터는 성인으로 분류. 요금은 15000원을 받는다
		else if(age>=20) {
			charge = 15000;
			System.out.println(String.format("성인 입니다. 요금은 %d원 입니다.", charge));
		}
		else {
			System.out.println("잘못된 입력값입니다.");
		}
		
		// 문제 : 값을 입력받고 값이 0~100 이면 
		// 입력받은 값은 "입력받은값" 입니다. 를 출력하고
		// 100보다 큰 경우는 "너무 큰 값을 입력하셨습니다." 를 출력
		// 0보다 작은값을 입력했다면 "음수는 입력받을 수 없습니다."를 출력해 주세요.
		System.out.println();
		System.out.println("숫자를 입력해 주세요.");
		int in_num;
		Scanner sc_num = new Scanner(System.in);
		in_num = sc_num.nextInt();
		System.out.println(in_num);
		
		if(in_num>=0 && in_num<=100) {
			System.out.println(String.format("입력하신 값은 %d 입니다.", in_num));
		} else if(in_num>100) {
			System.out.println("너무 큰 값을 입력하셨습니다.");
		} else if(in_num<0) {
			System.out.println("음수는 입력받을 수 없습니다.");
		} else {
			System.out.println("잘못된 입력값입니다.");
		}
		
		// 문제헤결 ROADMAP
		// 0을 기준으로 움직인다.
		// 1. 0보다 작은 경우   2.0~100 사이     3. 100보다 큰 경우
		
		
		// 순서도 : 어떠한 일을 처리하는 과정을 도식으로 표현함.
		// 프로그래밍 뿐만 아니라 문제의 분석, 디자인 설계에서도 사용.
	}

}
