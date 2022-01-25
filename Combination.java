package exam;

public class Combination {
	public static void comb(int[] arr, boolean[] visited, int index, int r) {
		if (r == 0) {
			for (int i=0; i<arr.length; i++) {
				if(visited[i] == true) {
					System.out.print(arr[i]);
				}
			}
			System.out.println();
			return;
		}
		if (index == arr.length) {
			return;
		} else {
			visited[index] = true;
			comb(arr, visited, index+1, r-1);
			
			visited[index] = false;
			comb(arr, visited, index+1, r);
		}
	}

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		boolean[] visited = new boolean[arr.length];
		
		for(int i=0; i<arr.length+1; i++) {
			comb(arr, visited, 0, i);
		}
		

	}

}
