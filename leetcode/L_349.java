package leetcode;

import java.util.ArrayList;

public class L_349 {
	public static void main(String[] args) {
		int []arr= {1,2,2,1};
		int []brr= {2,2};
		ArrayList <Integer> list=new ArrayList<>();
		ans(arr,brr,list);
		System.out.println(list);
	}

	private static int[] ans(int[] arr, int[] brr, ArrayList<Integer> list) {
		// TODO Auto-generated method stub
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < brr.length; j++) {
				if(arr[i]==brr[j]) {
					if(!list.contains(arr[i]))
					list.add(arr[i]);
					break;
				}
			}
		}
		int[] ans=new int[list.size()];
		for (int i = 0; i < ans.length; i++) {
			ans[i]=list.get(i);
		}
		return ans;
	}

}
