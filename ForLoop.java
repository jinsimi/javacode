package exam;

public class ForLoop {

	public static void main(String[] args) {
		// for��
		// �ݺ����� ����, while���� �ٸ��� �ݺ��� ���۽� ������ ���������� ���� �� �����ϴ� ����
		// for(�ʱ��; ���ǽ�; ������) { ���๮ ; }
//		int tree = 0;
//		for(int i=1; i<101; i++) {
//			System.out.println("������ ������ "+ i +"�� ������ϴ�.");
//		}
		
		// while VS do-while VS for  ���� ������� ���� �����Ѱ�?
		// while : ���� ����� ��/���� �̰ų�, ����ڰ� ���ϴ� ��Ȳ������ ���α׷��� ������ ��
		// do-while : �ѹ��� ���� �� ���� ����� ��/���� �̰ų�, ����ڰ� ���ϴ� ��Ȳ������ ���α׷��� ������ ��
		// for : Ư������ ����, Ƚ���� �����Ͽ� �ݺ��� �� ���, �迭�� ������ ����.
		
		// for���� �ʱ��, ���ǽ�, �������� ������ ����.
		// ������ ��Ʈ������ Ǫ�� �����.
//		int j = 0;
//		for(;;) {
//			System.out.println("������ ������ "+ j+"�� ������ϴ�.");
//			j++;
//		}
		// for�� ��뿹��2 - 1~10���� ���ϵ� ¦���� ����
		int sum = 0;
//		for(int i=1; i<10; i+=2) {
//			sum += i;
//		}
		for(int i=1; i<10; i++) {
			if(i%2 == 0) {
				// continue : �ش� Ű���带 ���� �� �ݺ����� 
				continue;
				
			}
			sum += i;
		}
		System.out.println("�ջ� ����� : " + sum);
		System.out.println();
		
		// for���� ����
		// ������ ����ϱ�
		System.out.printf("\t\t\t\t\t\t  ������ ��� �Դϴ�. \n");
		System.out.println("2  �� \t\t 3  �� \t\t 4  �� \t\t 5  �� \t\t 6  �� \t\t 7  �� \t\t 8  �� \t\t 9  ��\n");
		for(int i=1; i<10; i++) {
			for (int dan=2; dan<10; dan++) {
				System.out.printf("%d * %d = %d \t", dan, i, dan*i);
			} System.out.println();
		}
	}
}
