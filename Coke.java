package exam;

import java.util.Scanner;

public class Coke {

	public static void main(String[] args) {
		
		int price = 1000;
		System.out.println("���Ǳ⿡ ���� �� �ݾ��� �Է��ϼ���.");
		int into;
		Scanner sc = new Scanner(System.in);
		into = sc.nextInt();
		System.out.println(into);
		
		if(into > price) {
			System.out.printf("���ᱸ�� �� �ܾ��� %d�� �Դϴ�.", (into-price));
		} else if(into == price) {
			System.out.println("���ᱸ�� �� �ܾ��� �����ϴ�.");
		} else if(into < price) {
			System.out.println("�ܾ��� �����Ͽ� �ݶ� ���� �� �����ϴ�.");
		} else {
			System.out.println("������ �ʿ��մϴ�.");
		}
		
		


	}

}
