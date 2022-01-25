package exam;

public class StrFormatting {

	public static void main(String[] args) {
		// StrFormatting
		//���ڿ� ������ : ���ڿ� �ȿ� ��� ���� �����ϴ� ���
		int money = 15000;
		String day = "tomorrow";
		System.out.println(String.format("i need %d money %s", money, day));
		System.out.println(String.format("i need %s money %d", day, money));
		
		// ���ڿ� ���� �ڵ�
		// %s : ���ڿ�
		// %c : char
		// %d : ����
		// %f : �ε��Ҽ���
		// %o : 8����
		// %x : 16����
		// %% : ���� % �� ��ü
		
		// ����
		// ������ ������ ����� ������.
		// ����� ���� : error clean 95%
		// ���� : ���ڴ� ���ڴ��, ���ڴ� ���ڴ�� Ÿ�� ����� ��.
		
		int percent = 95;
		System.out.println(String.format("error clean %d%%", percent));
		
		// ������ �ڵ�� ���ڻ��
		// �����ڵ� + ������ ������� ������ ��밡��.
		// ���ڿ� ���� �� ����ó��
		System.out.println(String.format("%6s",  "test"));
		System.out.println(String.format("%10s",  "test"));
		// �����ڵ���� ������ �ǹ̴� ��ü���̸� �ǹ���. �������� �� �������� ��������� ä���.
		
		System.out.println(String.format("%-10s, friend~", "hi"));
		// ���� ���ڰ� ������� ���Ե� ���� �������� ���� �� �������� �������� ó���Ѵ�.
		
		// format �޼��� ��� �Ʒ��� ���� ���·ε� ��밡��
		// �������� printf�� ����� ��¸� ����. format �޼���� ����� ��ȯ(����)
		System.out.printf("%-10s, friend~", "hi");

	}

}
