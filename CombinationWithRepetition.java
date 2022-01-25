package exam;

import java.util.Arrays;

public class CombinationWithRepetition {
	// 선택하고자 하는 대상 집합.
	static int[] target = new int[] {2, 3, 4, 5, 6};
	// 대상 숫자를 담아둘 배열
	static int[] result = new int[5];

	public static void main(String[] args) {
		combination(0,0);
	}
	
	private static void combination(int cnt, int idx) {
		// 2개를 선택했으므로, 결과를 출력하고 재귀를 종료한다.
		if (cnt == 5) {
			System.out.println(Arrays.toString(result));
			return;
		}
		// 대상 집합을 주어진 인덱스부터 순회하며 숫자를 하나 선택한다.
		for (int i=idx; i<5; i++) {
			// 숫자를 담는다.
			result[cnt] = target[i];
			// 자신을 재귀호출한다. 자신의 수는 중복선택이 가능하므로, 인덱스를 그대로 넘겨준다.
			combination(cnt + 1, i);
		}
	}

}
