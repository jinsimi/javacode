package exam;

import java.util.Scanner;

public class Choice {

	public static void main(String[] args) {
		// ���
		
		// ���ǹ� : �־��� ���ǽ��� ����� ���� ������ ����� �����ϵ��� �ϴ� ���
		// if~ else / switch
		
		// if��
		// if(���ǽ�) {
		//	������ ���϶� �����ϴ� �ڵ�.
		// }
		
		// ���� ����.
		// �������� ���� ���ð� �ýø� Ÿ�� ���� �����ϴµ�
		int money = 15000;
		// �ܾ��� 3���� �̻��̸� �ýø� Ÿ�� �׷��� ������ �ɾ��.
		if (money>=30000) {
			System.out.println("�ýø� Ÿ�� ���� ������ !");
		} else {
			System.out.println("�� ��� �ɾ� ������.");
		}
		
		// ����
		// ��꿡 ���� ������ �ο��ϴ� ���α׷��� �ۼ��ϼ���.
		// 1. ����� 100���� �̻��̸� ������ 10������ ����.
		// 2. �׷��� ������ ������ 2���� ����.
		// 3. ���δ� �޽����θ� ó��
		
		int tax;  // ��� ���� ����
		// Scanner in = new Scanner(System.in);
		// double addMinus, muxDiv;
		
		// System.out.println("��꿡 ���� �����ϴ� ������ �׼��� ����մϴ�..");
		// System.out.println();
		// System.out.println("����� ������ �Է��� �ּ���.");
		// int havi = in.nextInt();
		
		// if (havi >= 1000000) {
		//	tax = 100000;
		// } else {
		//	tax = 20000;
		// }
		// System.out.println(String.format("�����Ͻ� ������ %d�� �Դϴ�.", tax));
		// System.out.println();
		
		// ������ ���ڷ� ó��
		String stu1 = "����л�";
		if(stu1 == "����л�") {
			System.out.println("û�����б��� ���� �ֽ��ϴ�.");
		}
		// �������� ������ ������ ���ǹ�(else if)
		// ���̺� ��ݰ�� ���α׷�
		// �ڵ忡�� �ʿ��� �͵�.
		// ������ ����(����, ���)
		System.out.println("ȯ���մϴ�. �츮 ����Ĵ��Դϴ�.");
		System.out.println("���̸� �Է��� �ּ���.");
		int age, charge;
		Scanner sc = new Scanner(System.in);
		age = sc.nextInt();
		System.out.println(age);
		
		// ����
		// 1. 0~6�� ����� ���� �ʴ´�.
		if(age<=6) {
			System.out.println("6�������� ����� ���� �ʽ��ϴ�");
		} // ���ǹ� ���� ���
		// 2. 7~12���� ������ �Ƶ����� �з�. ����� 5000���� �޴´�
		else if(age<=12) {
			charge = 5000;
			System.out.println(String.format("������ �Ƶ��Դϴ�. ����� %d�� �Դϴ�.", charge));
		}  // �����оƵ� ���� ���� ���
		// 3. 13~19���� û�ҳ����� �з�. ����� 10000���� �޴´�
		else if(age<=19) {
			charge = 10000;
			System.out.println(String.format("û�ҳ� �Դϴ�. ����� %d�� �Դϴ�.", charge));
		} // û�ҳ� ���� ������
		
		// 4. 20�����ʹ� �������� �з�. ����� 15000���� �޴´�
		else if(age>=20) {
			charge = 15000;
			System.out.println(String.format("���� �Դϴ�. ����� %d�� �Դϴ�.", charge));
		}
		else {
			System.out.println("�߸��� �Է°��Դϴ�.");
		}
		
		// ���� : ���� �Է¹ް� ���� 0~100 �̸� 
		// �Է¹��� ���� "�Է¹�����" �Դϴ�. �� ����ϰ�
		// 100���� ū ���� "�ʹ� ū ���� �Է��ϼ̽��ϴ�." �� ���
		// 0���� �������� �Է��ߴٸ� "������ �Է¹��� �� �����ϴ�."�� ����� �ּ���.
		System.out.println();
		System.out.println("���ڸ� �Է��� �ּ���.");
		int in_num;
		Scanner sc_num = new Scanner(System.in);
		in_num = sc_num.nextInt();
		System.out.println(in_num);
		
		if(in_num>=0 && in_num<=100) {
			System.out.println(String.format("�Է��Ͻ� ���� %d �Դϴ�.", in_num));
		} else if(in_num>100) {
			System.out.println("�ʹ� ū ���� �Է��ϼ̽��ϴ�.");
		} else if(in_num<0) {
			System.out.println("������ �Է¹��� �� �����ϴ�.");
		} else {
			System.out.println("�߸��� �Է°��Դϴ�.");
		}
		
		// ������� ROADMAP
		// 0�� �������� �����δ�.
		// 1. 0���� ���� ���   2.0~100 ����     3. 100���� ū ���
		
		
		// ������ : ��� ���� ó���ϴ� ������ �������� ǥ����.
		// ���α׷��� �Ӹ� �ƴ϶� ������ �м�, ������ ���迡���� ���.
	}

}
