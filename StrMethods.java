package exam;

public class StrMethods {

	public static void main(String[] args) {
		// strMethods
		// indexOf : ���ڿ����� Ư�� ���ڰ� ���۵Ǵ� ��ġ�� �����ϴ� �޼���
		String idx = "happy lunch time";
		idx.indexOf("happy");
		// System.out.println(idx);
		// System.out.println(idx.indexOf("hpy"));
		// System.out.println(idx.indexOf('p'));
		// System.out.println(idx.indexOf("lunch"));
		// System.out.println(idx.indexOf("time"));
		
		// System.out.println(idx.contains("time"));
		// ���� ã�� ���ڰ� ���ٸ� -1�� �����.
		// System.out.println(idx.contains("hungry"));
		
		// equals : �ΰ��� ���ڿ��� �������� ���� ������� ����.
		String equ1 = "hello";
		String equ2 = "lunch";
		String equ3 = "hello";
		String equ4 = new String("hello");
		
		// System.out.println();
		// System.out.println(equ1.equals(equ3));
		// System.out.println(equ1.equals(equ2));
		// System.out.println(equ1.equals(equ4));
		// System.out.println();
		// System.out.println(equ1==equ3);
		// System.out.println(equ1==equ4);
		// System.out.println();
		
		// charAt, substring 
		String idx2 = "hello everybody";
		System.out.println(idx.charAt(4));
		
		// substring : ���ڿ��� Ư�� �κ��� �̾Ƴ� ��� ���
		System.out.println(idx2.substring(0, 4));
		System.out.println(idx2.substring(3, 9));
		System.out.println(idx2.substring(5, 8));
		
		// replace, replaceAll
		// replaceAll�� ����ǥ������ ��� �����ϴ�.
		// replace�� char, replaceAll�� string
		String repl1 = "test";
		System.out.println(repl1.replace("st", "ji"));
		System.out.println(repl1.replaceAll("st", "ji"));
		
		// toUpperCase(��� �빮��), toLowCase(��� �ҹ���)
		String case1 = "Funny Java";
		System.out.println(case1.toUpperCase());
		System.out.println(case1.toLowerCase());
		System.out.println();
		
		// split
		// ���ڿ��� Ư�� �����ڷ� �и�
		String case2 = "q:w:e:r";
		String[] result = case2.split(":");
		System.out.println(result[0]);
		for(int i=0; i<result.length; i++) {
			System.out.println(result[i]);
		}
		


	}

}
