package exam;

import java.util.Scanner;

public class Input {

	public static void main(String[] args) {
		// ���ݱ��� �����͸� ����Ϸ��� ? ������ �Է¹޾� �ش纯���� ���뿡�� ó��.
		// Scanner Ŭ������ �̿��ؼ� ���α׷� ����ڷκ��� �����͸� �Է¹޴°͵� �����ϴ�.
		Scanner in = new Scanner(System.in);
		
		// String test = in.next();
		// String test2 = in.nextLine();
		
		// System.out.println(test);
		// System.out.println(test2);
		
		// �����Է�
		System.out.println("�� ���� ���� ����ϴ� ���α׷��Դϴ�.");
		System.out.println("ù��° ���ڸ� �Է��� �ּ���.");
		int num = in.nextInt();
		System.out.println("�ι�° ���ڸ� �Է��� �ּ���.");
		int num2 = in.nextInt();
		System.out.println("�Է¹��� ���� : " + (num+num2));
		
		// ���� �ΰ��� �Է¹޾Ƽ� ���ϱ� ���?  ������ ����ȯ�� ���� ���� �ʿ�.
		// ���ڿ��� ������ ���� ���ڿ�.  ���ڿ�ó�� ������ ���ڳ��� ���� ���� ���ϰ� ���߿� ���ڿ��� ���Ѵ�.
		
		// Scanner �޼��� ����
		// boolean : nextBoolean()
		// byte : nextByte()
		// short : nextShort()
		// int nextInt()
		// long : nextLong()
		// float : nextFloat()
		// double : nextDouble()
		// String : nextLine()  _ nextLine()�� ������ �������� ó���Ѵ�. 
		// String : next()  __ next()�� ������������ ó���Ѵ�. ������ ���ԵǸ� �޺κ��� ����.
		

	}

}
