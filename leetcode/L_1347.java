package leetcode;

import java.util.Arrays;

public class L_1347 {
	public static void main(String[] args) {
		String a = "leetcode";
		String b = "practice";
		ans(a, b);
	}

	private static void ans(String a, String b) {
		int count = 0;	
		
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
		for (int i = 0; i < drr.length; i++) {
			int k=crr[i]-drr[i];
			if(k>0)
			   count+=k;
		}
		System.out.println(count);

		
		
		
		
		
		
		
		
		
		
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < brr.length; j++) {
//				if (arr[i] == brr[j]) {
//					brr[j] = '-';
//					count++;
//					break;
//				}
//			}
//		}
//		System.out.println(brr.length-count);
	}
}


