package exam;

import java.util.Arrays;
import java.util.Scanner;

public class SearchMax {

	public static void main(String[] args) {
		int count = 0;
		int[] num;
		int MaxNum =0;
		
		Scanner sc = new Scanner(System.in);
		// �Է¹��� ���� ���� 
		System.out.print("�Է� �� ������ ������? (1000�� �̸�)");
		count = sc.nextInt();
		num = new int[count];
		
		// ���� �Է¹ޱ�
		System.out.println("1000 �̸��� ���ڸ� �����մϴ�.");
		System.out.println(count + " ���� ���ڸ� �Է��ϼ���! :");
		for(int i=0; i<count; i++) {
			num[i] = sc.nextInt();
		}
		
		// ���ڹ迭 -> ���ڹ迭�� �����
		String[] strArray = new String[num.length];
		for(int i=0; i<num.length; i++) {
			strArray[i] = String.valueOf(num[i]);
		}
		System.out.println(Arrays.toString(strArray));
		
		// ������ �迭�� ���ռ� �����
		System.out.println(strArray[0] + strArray[1] + strArray[2] + strArray[3] + strArray[4]);
		System.out.println(strArray[1] + strArray[2] + strArray[3] + strArray[4] + strArray[0]);
		System.out.println(strArray[2] + strArray[3] + strArray[4] + strArray[0] + strArray[1]);
		

	}

}
