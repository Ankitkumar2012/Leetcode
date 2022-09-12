package leetcode;

public class L_28 {
	public static void main(String[] args) {
		String atr="abcddefa";
		String str="ade";
		System.out.println(ans(atr,str));
	}

	private static int ans(String atr, String str) {
		if(atr.equals(str))return 0 ;
		int i=0;
		int j=atr.length();
		int k=str.length();
		if(j<k)return -1;
		int ans=-1;
		while(i<atr.length()) {
			if(atr.charAt(i)==str.charAt(0)) {
				if(i+k<=atr.length()) {
				String ab=atr.substring(i,i+k);
				if(ab.equals(str)) {
					ans=i;
					break;
				}
				}
			}
			i++;
		}
		return ans;
		}
}

