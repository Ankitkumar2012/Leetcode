package leetcode;

import java.util.Iterator;

public class L_696 {
	public static void main(String[] args) {
		String str = "00110011";
		System.out.println(ans(str, ""));
	}

	public static int ans(String str, String atr) {
		int start=1;
		int end=0;
		int ans=0;
		for (int i = 1; i < str.length(); i++) {
			if(str.charAt(i)==str.charAt(i-1))
				start++;
			else {
				ans+=Math.min(start, end);
				end=start;
				start=1;
			}
		}
		return ans+=Math.min(start, end);
	}

}
