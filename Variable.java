package exam;

public class Variable {

	public static void main(String[] args) {
		// ���� : ���ϴ� ��.
		// ������ �̸��� �����ڰ� ������� ���� �� ����.
		// but ��Ģ�� ����.
		
		// ������ ������ ��Ģ
		// 1. ���ڷ� �����ϸ� �ȵȴ�.
		// 2. $,_ �̿��� Ư�����ڴ� ���Ұ�
		// 3. Ű����� ���������� ����� �� ����.  -- ����) new, if, case, char, catch, for, try, this, import, throw, goto, do, while
		
		// ������ Ÿ�԰� �������� �ۼ�
		// int myVariable = 10;
		// String myTest = "����׽�Ʈ";
		// System.out.println(myVariable);
		// System.out.println(myTest);
		
		// ������ ����(���ڿ���)
		int a = 30;
		int b = 15;
		int c = 9;
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		
		System.out.println(a % c);
		System.out.println(b % c);
		
		// ��������
		// ��ȣ�� �̿��ؼ� ���� ������Ű�ų� ���� ��ų �� �ִ� ����.
		int test1 = 'A';
		int test2 = 5;
		
		// ���������ڴ� ��ȣ�� ��ġ�� ���� ���Ǵ� ������ �ٸ���.
		
		//test1 ++;  //���� ������ �Ŀ� ����
		//test2 --;
		System.out.println(test1);  
		System.out.println(++test1);  // ���� �����Ǳ� �� ����
		System.out.println(--test2);
		System.out.println(test1);
		System.out.println(test2);

		
		// �ڹ��� �ڷ���
		// ������ 
		// 1. int : �⺻������ / 4byte / -2^31 ~ 2^31-1
		// 2. byte : 1byte(8 bit) / -2^7 ~ 2^7-1 / -128 ~ 127
		// 3. short : 2byte(16 bit) / -2^15 ~ 2^15-1 / -32768 ~ 32767
		// 4. long : 8byte(64 bit) / -2^63 ~ 2^63-1
		
		// ���ڿ�
		// 1. String
		// 2. StringBuffer
		
		// ������
		// 1. char : 2byte
		
		// ������
		// 1. float : 4byte
		// 2. double : 8byte
		
		// ����
		// 1. boolean : True/False
		

	}

}
