package exam;

import java.util.Scanner;

public class ForExam {

	public static void main(String[] args) {
		// for + 배열 -> 숫자 입력받아 출력하기.
		
		// 필요한 변수들
		int count = 0; // 1. 입력받을 숫자의 개수
		int[] num; // 2. 입력받을 배열
		int findNum = 0;  // 3. 검색 할 숫자
		
		Scanner scn = new Scanner(System.in);
		// 1. 배열의 크기를 사용자에게서 입력받음
		System.out.println("생성 할 배열의 크기를 입력하세요.");
		count = scn.nextInt();
		num = new int[count];
		// 2. 배열의 크기만큼 숫자를 배열에 삽입
		// System.out.printf("%d 개의 숫자를 입력하세요. \n", count);
		
		for(int a=0; a<num.length; a++) {
			// num[a] = scn.nextInt();
			double dValue = Math.random();
			num[a] = (int) (dValue * 99);
		}
		System.out.print("num = [");
		for(int a=0; a<num.length; a++) {
			System.out.print(" " +num[a]);
		}System.out.print(" ]\n");
		// 3. 배열에 들어있는 숫자를 검색
		System.out.println("검색 할 숫자를 입력하세요.");
		boolean chk = false;
		findNum = scn.nextInt();
		for(int a=0; a<num.length; a++) {
			if(findNum == num[a]) {
				chk = true;
				System.out.printf("%d의 위치는 %d번째 입니다.\n", findNum, a+1);
			}  // if end
		} // for end
		if(!chk) {
			System.out.printf("%d는 존재하지 않습니다.\n", findNum);
		}

	}

}
