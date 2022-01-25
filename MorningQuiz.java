package exam;

public class MorningQuiz {

	public static void main(String[] args) {
		String s = "Techie Delight";
		
		char[] chars = s.toCharArray();
		
		int cnt_b = 0;
		int cnt_i = 0;
		
		for (char ch: chars) {
            if ((ch == 'b') || (ch == 'B')){
            	cnt_b += 1;
            } else if ((ch == 'i') || (ch == 'I')){
            	cnt_i += 1;
            } else {
            	continue;
            }
        }
		
		System.out.println(cnt_b);
		System.out.println(cnt_i);

	}

}
