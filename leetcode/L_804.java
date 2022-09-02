package leetcode;

import java.util.ArrayList;

public class L_804 {
	static String [] arr= {".-","-...","-.-.","-..",".","..-.","--.","....",
	                       "..",".---","-.-",".-..","--","-.","---",".--.",
	                       "--.-",".-.","...","-","..-","...-",
	                       ".--","-..-","-.--","--.."};
	public static void main(String[] args) {
		String akr []=  {"gin","zen","gig","msg"};
		ArrayList <String> bkr=new ArrayList<>();
		ans(akr,bkr,0);	
	}
	private static int ans(String[] akr,ArrayList<String> bkr,int count) {
		for (int i = 0; i < akr.length; i++) {
			String dc=akr[i];
			String ans="";
			for (int j = 0; j < dc.length(); j++) {
				char ch=dc.charAt(j);
				ans=ans+arr[ch-'a'];
			}
			if(!bkr.contains(ans)) {
			bkr.add(ans);
			count++;
			}
		}
		return count;
	}

}
