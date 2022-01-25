package exam;

import java.util.Arrays;

public class Permutation_with_repetition {
	// �����ϰ��� �ϴ� ��� ����.
	static int[] target = new int[] { 1, 2, 3, 4, 5 };
	// ��� ���ڸ� ��Ƶ� �迭�� �����.
	static int[] result = new int[target.length];

	public static void main(String[] args) {
		permutation(0);
	}
	
	// ���� �޼���(cnt�� ���� Ƚ��)
	private static void permutation(int cnt) {
		// 2���� ���������Ƿ�, ����� ����ϰ� ��͸� �����Ѵ�.
		for(int j=0; j<target.length; j++) {
			if (cnt == target.length) {
				System.out.println(Arrays.toString(result));
				return;
			}
		}
		// ��� ������ ��ȸ�ϸ� ���ڸ� �ϳ� �����Ѵ�.
		for (int i = 0; i < target.length; i++) {
			// ���ڸ� ��´�.
			result[cnt] = target[i];
			// �ڽ��� ��� ȣ���Ѵ�.
			permutation(cnt + 1);
		}
	}


}
