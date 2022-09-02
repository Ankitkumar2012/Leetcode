package leetcode;

import java.util.ArrayList;

public class L_917 {
	public static void main(String[] args) {
		String str="ab-cd";
		ArrayList<Integer> list=new ArrayList<>();
		ans(str);
	}
	private static void ans(String str) {
		char[] ch= str.toCharArray();
		int i=0;
		int j=ch.length-1;
		while(i<j) {
			while(i<j&&!(ch[i]>='a'&&ch[i]<='z'||ch[i]>='A'&&ch[i]<='Z'))i++;
			while(j>i&&!(ch[j]>='a'&&ch[j]<='z'||ch[j]>='A'&&ch[j]<='Z'))j--;
			char c=ch[i];
			ch[i]=ch[j];
			ch[j]=c;
			i++;
			j--;
		}
		String ans="";
		for (int k = 0; k < ch.length; k++) {
			ans+=ch[k];
		}
		System.out.println(ans);
		
	}
	

}
