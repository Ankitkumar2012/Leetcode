package leetcode;

public class L_367 {
	public static void main(String[] args) {
		int a=2147483647;
		System.out.println(ans(a,1,1));
	}

	private static boolean ans(int a,int b,int c) {
		// TODO Auto-generated method stub
		
		if(a>=Integer.MAX_VALUE) return false;
		if(c==a)return true;
		if(c>a || b<a)return false;
		
		
		 c=b*b;
		return ans(a,b+1,c);
	}

}
