package exam;

import java.util.Arrays;
import java.util.Scanner;

public class SearchMax {

	public static void main(String[] args) {
		int count = 0;
		int[] num;
		int MaxNum =0;
		
		Scanner sc = new Scanner(System.in);
		// 입력받을 숫자 개수 
		System.out.print("입력 할 숫자의 개수는? (1000개 미만)");
		count = sc.nextInt();
		num = new int[count];
		
		// 숫자 입력받기
		System.out.println("1000 미만의 숫자만 가능합니다.");
		System.out.println(count + " 개의 숫자를 입력하세요! :");
		for(int i=0; i<count; i++) {
			num[i] = sc.nextInt();
		}
		
		// 숫자배열 -> 문자배열로 만들기
		String[] strArray = new String[num.length];
		for(int i=0; i<num.length; i++) {
			strArray[i] = String.valueOf(num[i]);
		}
		System.out.println(Arrays.toString(strArray));
		
		// 숫자의 배열로 조합수 만들기
		System.out.println(strArray[0] + strArray[1] + strArray[2] + strArray[3] + strArray[4]);
		System.out.println(strArray[1] + strArray[2] + strArray[3] + strArray[4] + strArray[0]);
		System.out.println(strArray[2] + strArray[3] + strArray[4] + strArray[0] + strArray[1]);
		

	}

}
