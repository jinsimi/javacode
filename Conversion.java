package exam;

import java.util.Scanner;

public class Conversion {

	public static void main(String[] args) {
		// ������(����ȯ)
		// ���� �ٸ� �ڷ����� ������� ������ ���� �ϳ��� �ڷ������� �����ϴ°�
		
		// ������ �� ��ȯ(�ڵ� �� ��ȯ)
		String num = "1234";
		// int test = num;  // ������ �� ��ȯ�� ����ϰ� �ٷ� ������ ���� �־������ ������Ȳ.
		int test = Integer.parseInt(num);
		System.out.println(test);
		
		
		// ������ �����͸� ���������� �ٲٱ�
		int n = 123;
		String a = String.valueOf(n);
		String b = Integer.toString(n);
		System.out.println(a);
		System.out.println(b);
		// ����� �� ��ȯ(���� �� ��ȯ)
		
		// �Ǽ��� �߰����� & Ÿ�Ժ�ȯ
		// �ֱ� �Ǽ�Ÿ���� ������ ����� ���� float ���� double�� ���� ���
		// ���� : ��ǻ���� �޸� �뷮�� Ŀ���鼭 �ý��۸��ҽ� �������� ���ɿ� ������ �д�.
		float c = 123.45f;
		System.out.println(c);
		
		double d = 123.450;
		System.out.println(d);
		
		// double���� ����� Ÿ�� ��ȯ. 
		int test_Num_Db = 11;
		int test_Num_Db2 = 3;
		
		// ������ 3.0 : ����(java���� int�� ������ ������� ������ int������ ���)
		double result2 = test_Num_Db / test_Num_Db2;
		System.out.println(result2);

		// double Ÿ���� ������ ���� �� �����ϸ� double ���·� ��µ�.
		double test_Num_Db3 = 11;
		double test_Num_Db4 = 3;
		
		double result3 = test_Num_Db3 / test_Num_Db4;
		System.out.println(result3);


	}

}
