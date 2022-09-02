package leetcode;

import java.util.Arrays;
import java.util.HashMap;

public class L_645 {
	public static void main(String[] args) {
		int arr[] = { 3, 3, 1 };
		int brr[] = new int[2];
		HashMap<Integer, Integer> map = new HashMap<>();
		int rep = 0;
		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i])) {
				rep = arr[i];
				break;
			} else {
				map.put(arr[i], 1);
			}
		}
		int k = arr.length;
		int tsum = k * (k + 1) / 2;
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		brr[0] = rep;

		brr[1] = tsum - (sum - rep);
		System.out.println(brr[0]);
		System.out.println(brr[1]);
	}

}
