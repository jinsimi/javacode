package exam;

public class SwitchCase {

	public static void main(String[] args) {
		// switch�� : �־��� ���ǰ��� ����� ���� ���α׷��� �ٸ� ����� �����ϵ��� �ϴ� ���ǹ�.
		// ���� : 
		// 1. �������� if������ �پ��.
		// 2. �����Ϸ� ���忡�� ����ȭ�� ������ �ӵ��� ������.
		// ���� : if���� ���ؼ� ������ �������̴�. ������ �������δ�
		// 1. �������� �� �� �ִ� ���� ���� ������ �������̴�.
		
		// switch(���ǰ�) {
		//		case ��1:
		//			���ǿ� �´ٸ� �����ϴ� ��ɹ�;
		//			break;
		//		default: 
		//			���ǰ��� ��𿡵� �ش����� ������ �����ϴ� ��ɹ�;
		//			break;
		
		// ���ĺ��� �������� �������� üũ�ϱ�
		char c = 'x';
		
		 switch(c) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				System.out.printf("�ش� ���ڴ� %c�Դϴ�.", c);
				break;
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
				System.out.printf("�ش� ���ڴ� %c�Դϴ�.", c);
				break;
			default: 
				System.out.printf("�ش繮�ڴ� �����Դϴ�.");
				break;

		}

	}

}
