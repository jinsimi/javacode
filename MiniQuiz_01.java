package exam;

import java.util.Scanner;

public class MiniQuiz_01 {

	public static void main(String[] args) {
		// 1. 
		String name = "�谳��";
		String department = "���ߺ�";
		String position = "�븮";
		int sal = 3000000;
		
		System.out.println("�̸� : " + name);
		System.out.printf("�μ� : " + department + "\n");
		System.out.print("���� : " + position + "\n" + "�޿� : " + sal +"��");
		
		// 2.
		Scanner in = new Scanner(System.in);
		System.out.println("�Է¹��� �� ������ ũ�⸦ ���ϴ� ���α׷��Դϴ�.");
		System.out.println();
		System.out.println("ù��° ���ڸ� �Է��� �ּ���.");
		int num1 = in.nextInt();
		System.out.println("�ι�° ���ڸ� �Է��� �ּ���.");
		int num2 = in.nextInt();
		System.out.printf("�Է¹��� �� ���� �� ū ���� %d �Դϴ�.", (num1>num2 ? num1:num2));
		
		// 3.
		


	}

}
