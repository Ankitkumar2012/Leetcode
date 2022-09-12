package leetcode;

public class L_925 {
	public static void main(String[] args) {
		String atr="alex";
		String btr="aaleex";
		System.out.println(ans(atr,btr));
	}

	private static boolean ans(String atr, String btr) {
		int i=0;
		int j=0;
		int a=atr.length();
		int b=btr.length();
		while(i<a && j<b) {
			char ch=atr.charAt(i);
			char bh=btr.charAt(j);
			if(ch!=bh)return false;
			int ant=0;
			while(i<a && atr.charAt(i)==ch) {
				ant++;
				i++;
			}
			int bnt=0;
			while(j<b && btr.charAt(j)==bh) {
				bnt++;
				j++;
			}
			if(bnt<ant)return false;
		}
		
		if(i==a && j==b)return true;
		return false;
	}

}
