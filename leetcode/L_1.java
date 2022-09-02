package leetcode;

import java.util.Scanner;

public class L_1 {
	public static void main(String[] args) {
		Scanner ak = new Scanner(System.in);
		int n = ak.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = ak.nextInt();
		}
		int m = ak.nextInt();
		int k[] = new int[2];
		k = ans(arr, m);
		for (int nt : k) {
			System.out.print(nt + " ");
		}
	}

	private static int[] ans(int[] arr, int m) {
		// TODO Auto-generated method stub
		int ans[] = new int[2];
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 1; j < arr.length - 1; j++) {
				if (arr[i] + arr[j] == m) {
					ans[0] = i;
					ans[1] = j;
					return ans;
				}
			}
		}
		int[] kans = new int[2];
		return kans;
	}

}
