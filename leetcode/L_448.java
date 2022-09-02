package leetcode;

import java.util.ArrayList;

public class L_448 {
	public static void main(String[] args) {
		int [] arr= {1,2,2,2,2,2,2,2};
		ArrayList<Integer> list=new ArrayList<>();
		ans(arr,list);
	}

	private static void ans(int[] arr, ArrayList<Integer> list) {
		// TODO Auto-generated method stub
		int maxv=Integer.MIN_VALUE;
		for (int i=0; i<arr.length; i++) {
			maxv=Math.max(maxv, arr[i]);
		}
        maxv=Math.max(maxv,arr.length);

		for(int i=1; i<=maxv; i++) {
			int k=0;
			for (int j = 0; j < arr.length; j++) {
				if(arr[j]==i) {
					k++; break;
				}
			}
			if(k==0) list.add(i);
		}
		System.out.println(list);
	}

}
