package exam;

import java.util.Scanner;

public class ForExam {

	public static void main(String[] args) {
		// for + �迭 -> ���� �Է¹޾� ����ϱ�.
		
		// �ʿ��� ������
		int count = 0; // 1. �Է¹��� ������ ����
		int[] num; // 2. �Է¹��� �迭
		int findNum = 0;  // 3. �˻� �� ����
		
		Scanner scn = new Scanner(System.in);
		// 1. �迭�� ũ�⸦ ����ڿ��Լ� �Է¹���
		System.out.println("���� �� �迭�� ũ�⸦ �Է��ϼ���.");
		count = scn.nextInt();
		num = new int[count];
		// 2. �迭�� ũ�⸸ŭ ���ڸ� �迭�� ����
		// System.out.printf("%d ���� ���ڸ� �Է��ϼ���. \n", count);
		
		for(int a=0; a<num.length; a++) {
			// num[a] = scn.nextInt();
			double dValue = Math.random();
			num[a] = (int) (dValue * 99);
		}
		System.out.print("num = [");
		for(int a=0; a<num.length; a++) {
			System.out.print(" " +num[a]);
		}System.out.print(" ]\n");
		// 3. �迭�� ����ִ� ���ڸ� �˻�
		System.out.println("�˻� �� ���ڸ� �Է��ϼ���.");
		boolean chk = false;
		findNum = scn.nextInt();
		for(int a=0; a<num.length; a++) {
			if(findNum == num[a]) {
				chk = true;
				System.out.printf("%d�� ��ġ�� %d��° �Դϴ�.\n", findNum, a+1);
			}  // if end
		} // for end
		if(!chk) {
			System.out.printf("%d�� �������� �ʽ��ϴ�.\n", findNum);
		}

	}

}
