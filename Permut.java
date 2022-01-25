package exam;

import java.util.Arrays;

public class Permut {

	// 선택하고자 하는 대상 집합.
	static int[] target = new int[] { 2, 3, 4, 5, 6 };
	// 대상 숫자를 선택했는지를 알려주는 집합.
	static boolean[] visited = new boolean[target.length];
	// 대상 숫자를 담아둘 배열을 만든다.
	static int[] result = new int[target.length];

	public static void main(String[] args) {
		permutation(0);
	}
	// 순열 메서드(cnt는 선택 횟수)
	private static void permutation(int cnt) {
		// 2개를 선택했으므로, 결과를 출력하고 재귀를 종료한다.
		if (cnt == target.length) {
			System.out.println(Arrays.toString(result));
			return;
		}
		// 대상 집합을 순회하며 숫자를 하나 선택한다.
		for (int i = 0; i < target.length; i++) {
			// 이미 해당 숫자를 선택한 경우에는 스킵.
			if (visited[i]) {
				continue;
			}
			// 선택하지 않은경우, 선택했다는 표시를 해준다.
			visited[i] = true;
			// 숫자를 담는다.
			result[cnt] = target[i];
			// 자신을 재귀 호출한다.
			permutation(cnt + 1);
			// 선택을 해제한다.
			visited[i] = false;
		}
	}
}