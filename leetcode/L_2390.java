package leetcode;

public class L_2390 {
	public static void main(String[] args) {
		String str="leet**cod*e";
		System.out.println(ans(str));
	}

	private static String ans(String str) {
		char ch[]=str.toCharArray();
		  int j = 0;
			for (int i = 0; i < ch.length; ++i) {
		        if (ch[i] == '*')
		            j--;
		        else 
		            ch[j++] = ch[i];
	      }
			String ans="";
			for (int i = 0; i < j; i++) {
				ans+=ch[i];
			}
		    return ans;
		}
		
}	
		
		
		
//		String abc="";
//		for (int i = 0; i < str.length(); i++) {
//			if(str.charAt(i)!='*') {
//				list.add(str.charAt(i));
//			}
//			else {
//				list.remove(list.size()-1);
//			}
//				
//		}
//		System.out.println(list);
//		String bns="";
//		for (int i = 0; i < list.size(); i++) {
//			bns+=list.get(i);
//		}
//		return bns;
//	}

//}
