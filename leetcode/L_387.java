package leetcode;

import java.util.Scanner;

public class L_387 {
	public static void main(String[] args) {
		Scanner ak=new Scanner (System.in);
		String str=ak.next();
		System.out.println(ans(str));
	}

	private static int ans(String str) {
		// TODO Auto-generated method stub
		int arr[] =new int [26];
		for (int i = 0; i < str.length(); i++) {
			char ch=str.charAt(i);
			arr[ch-'a']=arr[ch-'a']+1;
		}
		for (int i = 0; i < str.length(); i++) {
			char ch=str.charAt(i);
			if(arr[ch-'a']==1) {
				return i;
			}
		}
		return -1;
	}

}
