package leetcode;

import java.util.ArrayList;

public class L_443 {
	public static void main(String[] args) {
		char ch[]= {'a','b','b','b','b','d'};
		ArrayList<Character> list=new ArrayList<>();
		System.out.println(ans(ch,list ));
	}

	private static int ans(char[] ch, ArrayList<Character> list) {
		if(ch.length==1)
			return 1;
		String ans="";
		int j=0;
	    for (int i = 0 ; i < ch.length; i++) {
	    	char ah=ch[i];
	    	int count=1;
	    	while(i<ch.length-1&& ch[i]==ch[i+1]) {
	    		count++;
	    		i++;
	    	}
	    	if(count==1) {
	    		ch[j]=ah;
	    	    j++;
	    	    ch[j]=1+48;
	    	    j++;
	    	ans=ans+ah+"1";
	    	}
	    	else {
	    		ch[j]=ah;
	    	    j++;
	    	    ch[j]=(char) ((char) count+48);
	    	    j++;
	    		ans=ans+ah+count;
	    	}
	    }
	    System.out.println(ans);
	    for (int i = 0; i < ch.length; i++) {
			System.out.print(ch[i]+" ");
		}
	    return ans.length();
	}

}
