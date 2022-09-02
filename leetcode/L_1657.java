package leetcode;

import java.util.Arrays;

public class L_1657 {
	public static void main(String[] args) {
		String a = "uau";
		String b = "ssx";
		System.out.println(ans(a, b));
	}

	private static boolean ans(String a, String b) {
//		for (int i = 0; i < a.length(); i++) {
//			int count=0;
//			for (int j = 0; j < b.length(); j++) {
//				if(a.charAt(i)==b.charAt(j))
//					count++;
//			}
//			if(count==0) return false;
//		}
		for (int i = 0; i < a.length(); i++) {
			if(!b.contains(a.charAt(i)+"")) {
				return false;
			}
		}
		int [] crr=new int [26];
		for (int i = 0; i < a.length(); i++) {
			char ch=a.charAt(i);
			crr[ch-97]=crr[ch-97]+1;
		}	
		int [] drr=new int [26];
		for (int i = 0; i < b.length(); i++) {
			char ch=b.charAt(i);
			drr[ch-97]=drr[ch-97]+1;
		}
		Arrays.sort(crr);
		Arrays.sort(drr);
		for (int i = 0; i < drr.length; i++) {
			if(crr[i]!=drr[i])
			   return false;
		}
		return true;
	}

}
