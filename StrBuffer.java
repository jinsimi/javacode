package exam;

public class StrBuffer {

	public static void main(String[] args) {
		// strBuffer : ���ڿ��� �߰��ϰų� ������ �� �ַ� ����ϴ� �ڷ���
		// ���� �߰��� ��ü�� ���� ���� �� �ʿ䰡 ���� ������ �޸� ��뿡�� �̵��� ���� ������ �� ����.
		// ����� : �ڷ��� ��ü�� ���ſ���. (String�� �ι�)
		// String�� StringBuffer�� ���������� �����ؾ� �� �ʿ䰡 ����.
		String[] msg = {"hello", "2022", "java", "web", "devTeam"};
		for(int i=0; i<msg.length; i++) {
			System.out.print(msg[i] + " ");
		}
		
		System.out.println();
		
		String result = "";
		result += "hello";
		result += " ";
		result += "2022";
		result += " ";
		result += "java";
		result += " ";
		result += "web";
		result += " ";
		result += "devTeam";
		System.out.println(result);
		
		
		StringBuffer sb = new StringBuffer();
		sb.append("hello");
		sb.append(" ");
		sb.append("2022");
		sb.append(" ");
		sb.append("java");
		sb.append(" ");
		sb.append("web");
		sb.append(" ");
		sb.append("devTeam");
		
		String result2 = sb.toString();
		System.out.println(result2);
		
	}

}
