package leetcode;

import java.util.Scanner;

public class L_383 {
	public static void main(String[] args) {
		Scanner ak=new Scanner (System.in);
		String ransomNote=ak.nextLine();
		String magazine=ak.nextLine();
		System.out.println(Print(ransomNote,magazine));
	}

	private static boolean Print(String a, String b) {
		int ch[]= new int[26];
		for (int i = 0; i < a.length(); i++) {
            char c=a.charAt(i);
			ch[c-'a']=ch[c-'a']+1;
		}
		for (int i = 0; i < b.length(); i++) {
			char c=b.charAt(i);
			ch[c-'a']=ch[c-'a']-1;
		}
		
		for (int i = 0; i < ch.length; i++) {
			if(ch[i]>=1) {
				return false;
			}
		}
		return true;
	}

}
