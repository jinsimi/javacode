package exam;

import java.util.Scanner;

public class Coke {

	public static void main(String[] args) {
		
		int price = 1000;
		System.out.println("자판기에 투입 할 금액을 입력하세요.");
		int into;
		Scanner sc = new Scanner(System.in);
		into = sc.nextInt();
		System.out.println(into);
		
		if(into > price) {
			System.out.printf("음료구매 후 잔액은 %d원 입니다.", (into-price));
		} else if(into == price) {
			System.out.println("음료구매 후 잔액이 없습니다.");
		} else if(into < price) {
			System.out.println("잔액이 부족하여 콜라를 뽑을 수 없습니다.");
		} else {
			System.out.println("점검이 필요합니다.");
		}
		
		


	}

}
