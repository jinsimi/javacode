package exam;

public class Operand {

	public static void main(String[] args) {
		// �����ڿ� ��
		// ��(operand) : ���꿡 ���Ǵ� ��
		// ������(operator) : ���� �̿��Ͽ� �����ϴ� ��ȣ
		// �������� ���� : ���������, ���Կ�����, ����������, �񱳿�����, ��������, ���׿�����, instanceof ������
		// 1. ���������(��Ģ����)
		// 2. ���Կ����� - ������ ���� ������ �� ��� ( =, +=, -=, *=, /=, %=, &=, |=, ^= )
		int a=1, b=2;
		a += b;
		System.out.println(a);
		System.out.println(b);
		
		int c = 40, d = 50;
		int result1 = c -= d;
		int result2 = c =- d;
		System.out.println(result1);
		System.out.println(result2);
		// 3. ����������
		// 4. �񱳿�����
		//  a==b(a�� b�� ������ true), a!=b(a�� b�� �ٸ��� true), a>b(a�� b�� �ʰ��ϸ� true), a>=b(a�� b �̻��̸� true), a<b(a�� b �̸��̸� true), a<=b(a�� b �����̸� true)
		int num1 = 10;
		int num2 = 20;
		System.out.println(num1 <= num2);
		System.out.println();
		
		// 5. �������� - �־��� ������ �Ǵ��� ���� ������ �����ϴ� ������. �ַ� ���ǹ����� ���� Ȱ��ȴ�.
		int test1 = 30, test2=40;
		boolean result10, result11;
		// AND ���� ����
		result10 = (test1 > 20) && (test2 > 50);
		// OR ���� ����
		result11 = (test1 > 20) || (test2 > 50);
		System.out.println(result10);
		System.out.println(result11);
		System.out.println();
		// AND OR ���� ����
		// 1. ȸ�������� �޴µ� ���̰� 20�� �̻��̰� �з��� ������ ���. (AND)
		// 1. ȸ�������� �޴µ� ���̰� 20�� �̻��̰ų� �з��� ������ ���. (OR)
		// 2. ���� �緯 ��Ʈ�� �Դµ� ���� ��õ���� ��������� ������ 6���� ������ ��. (AND)
		// 2. ���� �緯 ��Ʈ�� �Դµ� ���� ��õ���� ��������ų� ������ 6���� ������ ��. (OR)
		// NOT : ����� ���̸� ������, �����̸� ���� ���
		// ! (not), && (and), || (or)
		
		// 6. ���׿�����
		// �ǿ����ڰ� 3���� ���ǿ�����.  ex)  ���ǽ�? ���ϰ�1:���ϰ�2
		// ? ���� ���ǽĿ� ���� ������� ���̸� ���ϰ� 1�� ���, ������� �����̸� ���ϰ� 2�� ���
		int threeOper1 = 15, threeOper2 = 20;
		String result20;
		
		// ���ǽ�? ���ϰ�1:���ϰ�2
		result20 = (threeOper1-threeOper2)>0 ? "���":"����";
		System.out.println(result20);
		
		// ����. 

	}

}
