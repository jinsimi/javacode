package exam;

import java.util.Arrays;

public class Permut {

	// �����ϰ��� �ϴ� ��� ����.
	static int[] target = new int[] { 2, 3, 4, 5, 6 };
	// ��� ���ڸ� �����ߴ����� �˷��ִ� ����.
	static boolean[] visited = new boolean[target.length];
	// ��� ���ڸ� ��Ƶ� �迭�� �����.
	static int[] result = new int[target.length];

	public static void main(String[] args) {
		permutation(0);
	}
	// ���� �޼���(cnt�� ���� Ƚ��)
	private static void permutation(int cnt) {
		// 2���� ���������Ƿ�, ����� ����ϰ� ��͸� �����Ѵ�.
		if (cnt == target.length) {
			System.out.println(Arrays.toString(result));
			return;
		}
		// ��� ������ ��ȸ�ϸ� ���ڸ� �ϳ� �����Ѵ�.
		for (int i = 0; i < target.length; i++) {
			// �̹� �ش� ���ڸ� ������ ��쿡�� ��ŵ.
			if (visited[i]) {
				continue;
			}
			// �������� �������, �����ߴٴ� ǥ�ø� ���ش�.
			visited[i] = true;
			// ���ڸ� ��´�.
			result[cnt] = target[i];
			// �ڽ��� ��� ȣ���Ѵ�.
			permutation(cnt + 1);
			// ������ �����Ѵ�.
			visited[i] = false;
		}
	}
}