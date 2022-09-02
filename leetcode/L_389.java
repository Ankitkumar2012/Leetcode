package leetcode;

public class L_389 {
	public static void main(String[] args) {
		String s="abcd";
		String t="abcde";
		ans(s,t);
	}

	private static char ans(String s, String t) {
		// TODO Auto-generated method stub
		int sum1=0,sum2=0;
		for (int i=0; i<s.length(); i++) {
			sum1+=s.charAt(i);
		}
		for (int i=0; i<t.length(); i++) {
			sum2+=t.charAt(i);
		}
		char ch=(char) (sum2-sum1);
		return ch;
	}
}
