package exam;

import java.util.Scanner;

public class LunchQuiz_2022_01_12 {

	public static void main(String[] args) {
		// 1. ���νŻ� �̸�: _����: _Ű: _��ȭ��ȣ: _������:
		Scanner in = new Scanner(System.in);
		
		System.out.println("���� �Ż����� �Է¼��� �Դϴ�.");
		System.out.println();
		System.out.println("�̸��� �Է��� �ּ���.");
		String name = in.nextLine();
		System.out.println("���̸� �Է��� �ּ���.");
		int age = in.nextInt();
		System.out.println("Ű�� �Է��� �ּ���.");
		float height = in.nextFloat();
		in.nextLine();
		System.out.println("��ȭ��ȣ�� �Է��� �ּ���.");
		String tel_num = in.nextLine();
		System.out.println("������ �Է��� �ּ���.");
		float weight = in.nextFloat();
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + age);
		System.out.println("Ű : " + height);
		System.out.println("��ȭ��ȣ : " + tel_num);
		System.out.println("������ : " + weight +"kg");


	}

}
