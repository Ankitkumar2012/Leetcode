package leetcode;

import java.util.HashMap;

public class L_287 {
	public static void main(String[] args) {
		int []arr= {1,3,4,2,4,2};
		System.out.println(ans(arr));
	}

	private static int ans(int[] arr) {
		// TODO Auto-generated method stub
		HashMap<Integer, Integer>map= new HashMap<>();	
		for (int i = 0; i < arr.length; i++) {
			if(!map.isEmpty()&& map.containsKey(arr[i]) )return arr[i];
			else map.put(arr[i], map.getOrDefault(arr[i], 0)+1);		
		}	
		return 0;
	}

}
