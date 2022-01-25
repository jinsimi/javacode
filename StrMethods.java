package exam;

public class StrMethods {

	public static void main(String[] args) {
		// strMethods
		// indexOf : 문자열에서 특정 문자가 시작되는 위치를 리턴하는 메서드
		String idx = "happy lunch time";
		idx.indexOf("happy");
		// System.out.println(idx);
		// System.out.println(idx.indexOf("hpy"));
		// System.out.println(idx.indexOf('p'));
		// System.out.println(idx.indexOf("lunch"));
		// System.out.println(idx.indexOf("time"));
		
		// System.out.println(idx.contains("time"));
		// 만약 찾는 문자가 없다면 -1을 출력함.
		// System.out.println(idx.contains("hungry"));
		
		// equals : 두개의 문자열이 동일한지 비교해 결과값을 리턴.
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
		
		// substring : 문자열중 특정 부분을 뽑아낼 경우 사용
		System.out.println(idx2.substring(0, 4));
		System.out.println(idx2.substring(3, 9));
		System.out.println(idx2.substring(5, 8));
		
		// replace, replaceAll
		// replaceAll은 정규표현식이 사용 가능하다.
		// replace는 char, replaceAll는 string
		String repl1 = "test";
		System.out.println(repl1.replace("st", "ji"));
		System.out.println(repl1.replaceAll("st", "ji"));
		
		// toUpperCase(모두 대문자), toLowCase(모두 소문자)
		String case1 = "Funny Java";
		System.out.println(case1.toUpperCase());
		System.out.println(case1.toLowerCase());
		System.out.println();
		
		// split
		// 문자열을 특정 구분자로 분리
		String case2 = "q:w:e:r";
		String[] result = case2.split(":");
		System.out.println(result[0]);
		for(int i=0; i<result.length; i++) {
			System.out.println(result[i]);
		}
		


	}

}
