package leetcode;

import java.util.Iterator;

public class L_48 {
	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		System.out.println(arr[0].length);
		ans(arr);
		matrix(arr);
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	private static void ans(int[][] arr) {
		// TODO Auto-generated method stub
		int k = 0;
		for (int i = k; i < arr.length; i++) {
			for (int j = i; j < arr[0].length; j++) {
				int temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;
			}
			k++;
		}
	}

	public static void matrix(int[][] arr) {
		int k = 0;
		while (k < arr.length) {
			int a = 0;
			int b = arr[0].length - 1;
			while (a < b) {
				int t = arr[k][a];
				arr[k][a] = arr[k][b];
				arr[k][b] = t;
				a++;
				b--;

			}
			k++;
		}
	}
}
