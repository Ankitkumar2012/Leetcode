package leetcode;

public class L_342 {
	public static void main(String[] args) {
		int n=84;
	    System.out.println(ans(n));
	}

	private static boolean ans(int n) {		
		long ans=1;
		if(n<=0)return false;
		while(ans<=n) {
			if(ans==n) {
				return true;
			}
		ans=ans*4;
		}
		return false;
	}

}
