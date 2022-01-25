package exam;

public class StrBuffer {

	public static void main(String[] args) {
		// strBuffer : 문자열을 추가하거나 변경할 때 주로 사용하는 자료형
		// 문자 추가시 객체를 따로 생성 할 필요가 없기 때문에 메모리 사용에서 이득을 많이 가져갈 수 있음.
		// 모순점 : 자료형 자체가 무거운편. (String의 두배)
		// String과 StringBuffer는 전략적으로 선언해야 할 필요가 있음.
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
