package leetcode;

import java.util.ArrayList;
import java.util.List;

public class L_77 {
	public static void main(String[] args) {
		int a=4;
		int b=2;
		List<Integer>list=new ArrayList<>();
		List<List<Integer>> ans=new ArrayList<>();
		ans(a,b,list,ans,1);
		System.out.println(ans);
	}

	private static void ans(int a, int b, List<Integer> list, List<List<Integer>> ans,int idx) {
		// TODO Auto-generated method stub
		if(b==0) {
			ans.add(new ArrayList<>(list));
			return;
		}
		for (int i = idx; i <=a; i++) {
			list.add(i);
			ans(a,b-1,list,ans,i+1);
			list.remove(list.size()-1);
		}
	}

}
