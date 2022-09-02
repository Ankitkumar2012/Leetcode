package leetcode;

import java.util.ArrayList;
import java.util.List;

public class L_22 {
	public static void main(String[] args) {
		int n=3;
		List <String> list=new ArrayList<>();
		ans(n,0,0,"",list);
		System.out.println(list);
	}

	private static void ans(int n,int open,int close, String ans,List<String> list) {
		// TODO Auto-generated method stub
		if(open==n && close==n) { 
			list.add(ans);
			return;
		}
		if(open<n) {
			ans(n,open+1,close,ans+"(",list);		
		}
		if(close<open) {
			ans(n,open,close+1,ans+")",list);		
		}
		
	}

}
