package leetcode;

import java.util.HashMap;

public class L_219 {
	public static void main(String[] args) {
	int arr[]= {1,2,3,1};
	int k=3;
	System.out.println(ans(arr,k));
	}

	private static boolean ans(int[] arr, int k) {
		// TODO Auto-generated method stub
		   HashMap<Integer, Integer>map=new HashMap<>();
			for(int i=0;i<arr.length;i++) {
				if(map.containsKey(arr[i])){
				  if(Math.abs(map.get(arr[i]).intValue()-i)<=k) 
					  return true;
				  }
					map.put(arr[i], i);
			}
			return false;
	}
}
