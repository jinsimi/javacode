package exam;

import java.util.Arrays;

public class CombinationWithRepetition {
	// �����ϰ��� �ϴ� ��� ����.
	static int[] target = new int[] {2, 3, 4, 5, 6};
	// ��� ���ڸ� ��Ƶ� �迭
	static int[] result = new int[5];

	public static void main(String[] args) {
		combination(0,0);
	}
	
	private static void combination(int cnt, int idx) {
		// 2���� ���������Ƿ�, ����� ����ϰ� ��͸� �����Ѵ�.
		if (cnt == 5) {
			System.out.println(Arrays.toString(result));
			return;
		}
		// ��� ������ �־��� �ε������� ��ȸ�ϸ� ���ڸ� �ϳ� �����Ѵ�.
		for (int i=idx; i<5; i++) {
			// ���ڸ� ��´�.
			result[cnt] = target[i];
			// �ڽ��� ���ȣ���Ѵ�. �ڽ��� ���� �ߺ������� �����ϹǷ�, �ε����� �״�� �Ѱ��ش�.
			combination(cnt + 1, i);
		}
	}

}
