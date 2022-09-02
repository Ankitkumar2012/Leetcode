package leetcode;

import java.util.ArrayList;

public class L_20 {
	public static void main(String[] args) {
		int n=3;
		ArrayList<String> list=new ArrayList<>();
		ans(n,0,0,"",list);
		System.out.println(list);
	}

	private static void ans(int n, int open, int close, String atr, ArrayList<String> list) {
		// TODO Auto-generated method stub
		if(open==n && close==n) {
			list.add(atr);
//			System.out.print(atr+" ");
			return;
		}
		
		if(open<n)
		ans(n,open+1,close,atr+"(",list);
		if(close<open)
		ans(n,open,close+1,atr+")",list);
	}

}
