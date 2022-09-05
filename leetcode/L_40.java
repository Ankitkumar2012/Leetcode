package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L_40 {
	public static void main(String[] args) {
		int arr[]= {1,1,2,5,6,7,10};
		int target=8;
		List<Integer>list=new ArrayList<>();
		List<List<Integer>> ans=new ArrayList<>();
		ans(arr,target,list,ans,0);
		System.out.println(ans);
	}

	private static void ans(int[] arr, int t, List<Integer> list, List<List<Integer>> ans, int idx) {
		// TODO Auto-generated method stub
		if(t==0) {
			ans.add(new ArrayList<>(list));
			return;
		}
		if(t<0) return;
		for (int i = idx; i < arr.length; i++) {
			list.add(arr[i]);
			ans(arr,t-arr[i],list,ans,i+1);
			list.remove(list.size()-1);
			while(i<arr.length-1&& arr[i]==arr[i+1])i++;
	    }
	}
}
