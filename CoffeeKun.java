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
//			System.out.println("�մ��� �Խ��ϴ�.  Ŀ�Ǹ� �󸶿� �Ľðڽ��ϱ�?");
//			money = s.nextInt();
//			coffee--;
//			result += money;
//			System.out.println("���� Ŀ���� ���� "+coffee+"�� �Դϴ�.");
//		}
//		System.out.println("���� ���� �ݾ� : " + result);
		
		
		// ������ �Է¹޾� 80�� �̻��̸� �հݸ޽����� �׷��� ������ ���հ� �޽����� ����ϴ� �۾��� �ݺ��ϴٰ�
		// 0���� 100�� �̿��� ������ �ԷµǸ� �����ϴ� ���α׷��� �ۼ��غ�����.

		Scanner s = new Scanner(System.in);
		int point = 0;
		
		while(true) {
			System.out.println("������ �Է��ϼ���");
			point = s.nextInt();
			if (point<0 || point>100) {
				System.out.println("�Է¹��� �����Դϴ�. ���α׷� �����մϴ�.");
				break;
			}
			if (point>=80) {
				System.out.println("�հ� �Դϴ�.");
			} else {
				System.out.println("���հ��Դϴ�.");
			}
			System.out.println();
		}
		System.out.println("���α׷� ����Ǿ����ϴ�. ");
	}

}
