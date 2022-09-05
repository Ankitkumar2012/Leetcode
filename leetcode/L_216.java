package leetcode;

import java.util.ArrayList;
import java.util.List;

public class L_216 {
	public static void main(String[] args) {
		int a=3;
		int b=9;
		List<Integer>list=new ArrayList<>();
		List<List<Integer>> ans=new ArrayList<>();
		ans(a,b,list,ans,1);
		System.out.println(ans);
	}

	private static void ans(int a, int b, List<Integer> list, List<List<Integer>> ans,int idx) {
		if(a==0 && b==0) {
			ans.add(new ArrayList<>(list));
			return;
		}
		if(a<0 && b<0)return;
		for (int i = idx; i <=9; i++) {
			list.add(i);
			ans(a-1,b-i,list,ans,i+1);
			list.remove(list.size()-1);
		}
	}

}
