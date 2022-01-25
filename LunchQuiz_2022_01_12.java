package exam;

import java.util.Scanner;

public class LunchQuiz_2022_01_12 {

	public static void main(String[] args) {
		// 1. 개인신상 이름: _나이: _키: _전화번호: _몸무게:
		Scanner in = new Scanner(System.in);
		
		System.out.println("개인 신상정보 입력순서 입니다.");
		System.out.println();
		System.out.println("이름을 입력해 주세요.");
		String name = in.nextLine();
		System.out.println("나이를 입력해 주세요.");
		int age = in.nextInt();
		System.out.println("키를 입력해 주세요.");
		float height = in.nextFloat();
		in.nextLine();
		System.out.println("전화번호를 입력해 주세요.");
		String tel_num = in.nextLine();
		System.out.println("몸무게 입력해 주세요.");
		float weight = in.nextFloat();
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("키 : " + height);
		System.out.println("전화번호 : " + tel_num);
		System.out.println("몸무게 : " + weight +"kg");


	}

}
