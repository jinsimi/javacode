package exam;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		// Array
		// ���� Ÿ���� ������� �̷���� ����
		// �迭�� �����ϴ� ������ �� : ���(element)
		// �迭���� ��ġ�� ����Ű�� ���� : �ε���(index)
		
		// �迭�� ����� ���ÿ� �ʱ�ȭ
		int[] number = {10, 20, 30};	// �ʱ�ȭ ���
		int[] number2 = new int[] {20, 30, 40};
		
		System.out.println(number[0]);
		System.out.println(number2[0]);
		
		// �迭 ������ �ε������� �ʱ�ȭ�ϴ� ���̽�
		String[] str1 = new String[5];
		
		str1[0] = "80";
		str1[1] = "test";
		str1[2] = "hello";
		str1[3] = "java";
		// str1[7] = "world";
		System.out.println(str1[2]);
		// System.out.println(str1[7]);
		// Error ���� : �����ʰ�(str1 �迭)
		
		
		// �迭�� ����
		// 1. �迭�� �Է¹��� ��ҵ��� ���հ� ��� ���ϱ�
		int[] number3 = new int[] {85, 75, 55, 77, 86};
		int sum = 0;
		
		for (int i=0; i<number3.length; i++) {
			sum += number3[i];
		}  // ����
		System.out.println();
		System.out.println(sum);
		System.out.println(sum/number3.length);
		
		// ������ �迭(n���� �迭)
		// 2���� �̻��� �迭 : �迭��ҷ� �� �ٸ� �迭�� ������ �迭
		
		// 2���� �迭 ����
		// Ÿ��[][] �迭��; 
		// Ÿ�� �迭��[][];
		// Ÿ��[] �迭��[];
		int[][] di_arr = {
				{10, 30, 50},
				{15, 25, 35}
		};
		System.out.println();
		System.out.println(di_arr[0]);
		System.out.println(di_arr[0][0]);
		
		// �����迭 : ���� ���̸� ������� �ʰ� �ึ�� �ٸ� ������ �迭�� ��ҷ� �����ϴ� �迭
		int[][] arr2 = {
				{10, 15},
				{10, 20, 30, 45},
				{10}
    		};
		System.out.println(arr2[1][0]);
		
		// �迭�� ����
		// �ڹٿ��� �迭�� ���� �� ���̸� �����ϱⰡ �ſ� ��ƴ�
		// � �迭�� �� ���� �����͸� �����ϱ����� ���� �迭�� �����͸� ���Ӱ� �ű� �ſ��� ����.
		// arraycopy, copyof, clone
		// for�� + index ����
		int[] arr3 = new int[] {1, 2, 3, 4, 5};
		int nlength = 10;
		
		int[] newArr1 = new int[nlength];
		// arraycopy(�����迭, �ű�迭, �ű����)
		System.arraycopy(arr3, 0, newArr1, 0, arr3.length);
		System.out.println();
		for(int i=0; i<newArr1.length; i++) {
			System.out.print(newArr1[i] + " ");
			}
		System.out.println();

		// copyof
		int[] arr4 = Arrays.copyOf(arr3, nlength);
		for(int j=0; j<arr4.length; j++) {
			System.out.print(arr4[j] + " ");
			}
		System.out.println();

		// clone
		int[] arr5 = (int[])arr3.clone();
		for(int k=0; k<arr5.length; k++) {
			System.out.print(arr5[k] + " ");
			}
		System.out.println();
		
		
		}
	}


