package exam;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// ���� �����
		// ���� ��� �ּһ���
		// 1. �ּ� 2�� �̻��� ���ڸ� �Է¹��� ��(2���� ok)
		// 2. �Է¹��� 2���� ������ ��Ģ������ �����ؾ� �Ѵ�.

		// 2022/01/13  Pilgeun ���� ����߰�
		// �߰����� : ���꺰 �������
		//  - ���� �� ������ ����ڰ� �����ϵ��� ó��
		
		Scanner in = new Scanner(System.in);
		// double addMinus, muxDiv;
		
		System.out.println("�Է¹��� �� ������ ������ �����ϴ� ���α׷��Դϴ�.");
		System.out.println();
		System.out.println("ù��° ���ڸ� �Է��� �ּ���.");
		int num1 = in.nextInt();
		System.out.println("�ι�° ���ڸ� �Է��� �ּ���.");
		int num2 = in.nextInt();
		System.out.println("�����ϰ��� �ϴ� ����� ������ �ּ���.");
		System.out.println("1.����,   2.����,   3.����,   4.������");
		System.out.println("������ ������ ��� �� �� �ֽ��ϴ�.");
		System.out.println("�������� ū������ �������� ������ ������ �մϴ�.");
		int num3 = in.nextInt();
		
		switch(num3) {
			case 1:
				System.out.println("�� ������ ���� : " + (num1+num2));
				break;
			case 2:
				// ���� ��ɰ��� 1
				// ���� num1�� num2 ���� ������ num2-num1�� �����ϼ���
				System.out.println("�� ������ ���� : " + (num1-num2));
				break;
			case 3:
				System.out.println("�� ������ ���� : " + (num1*num2));
				break;
			case 4:
				// ���� ��ɰ��� 2
				// ���� num1�� num2 ���� ������ num2/num1�� �����ϼ���
				System.out.println("�� ������ ������ : " + ((num1>num2) ? num1/num2 : num2/num1 ));
				break;
			default:
				System.out.println("�������� ������ Ʋ�Ƚ��ϴ�.");
				System.out.println("1.����,   2.����,   3.����,   4.������ �߿��� ������ �ּ���.");
				System.out.println("���� ���۾��� ���α׷� �����մϴ�.");
		}
	}

}
