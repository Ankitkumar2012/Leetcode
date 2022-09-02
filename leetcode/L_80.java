package leetcode;

public class L_80 {
	public static void main(String[] args) {
		int arr[] = { 1, 1, 1, 1, 2, 2, 3, 4, 4, 4 };
		ans(arr);
	}

	private static void ans(int[] arr) {
		// TODO Auto-generated method stub
		int j = 0;
		int count=0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != arr[i + 1]) {
				arr[j] = arr[i];
				j++;
				count=0;
			} else {
				count++;
				if(count>=2) {
					i++;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
