package exam;

import java.util.Scanner;

public class CoffeeKun {

	public static void main(String[] args) {
//		Scanner s = new Scanner(System.in);
//		int coffee = 5;
//		int money = 0;
//		int result = 0;
//		
//		while(coffee>0) {
//			System.out.println("손님이 왔습니다.  커피를 얼마에 파시겠습니까?");
//			money = s.nextInt();
//			coffee--;
//			result += money;
//			System.out.println("남은 커피의 수는 "+coffee+"개 입니다.");
//		}
//		System.out.println("최종 정산 금액 : " + result);
		
		
		// 점수를 입력받아 80점 이상이면 합격메시지를 그렇지 않으면 불합격 메시지를 출력하는 작업을 반복하다가
		// 0에서 100점 이외의 점수가 입력되면 종료하는 프로그램을 작성해보세요.

		Scanner s = new Scanner(System.in);
		int point = 0;
		
		while(true) {
			System.out.println("성적을 입력하세요");
			point = s.nextInt();
			if (point<0 || point>100) {
				System.out.println("입력범위 오류입니다. 프로그램 종료합니다.");
				break;
			}
			if (point>=80) {
				System.out.println("합격 입니다.");
			} else {
				System.out.println("불합격입니다.");
			}
			System.out.println();
		}
		System.out.println("프로그램 종료되었습니다. ");
	}

}
